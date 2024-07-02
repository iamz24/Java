package com.example.demo.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.dto.User;
import com.example.demo.dto.searchDTO;
import com.example.demo.service.UserService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;

@Controller
public class UserController {
	//nếu không có = thì dữ liệu sẽ bị null nên ta cần sử dụng autowired để đẩy dữ liệu bean vào
	@Autowired //có thể dùng với biến hàm để gán rằng hàm đó biến đó là của bean, lấy dữ liệu bean
	UserService userService;
	@GetMapping("/admin/user/list")
	public String userList(HttpServletRequest req, Model model ) {
		List<User> users = userService.getAll(); //lấy dữ liệu ra
//		req.setAttribute("userList", users); //đẩy dữ liệu vào reqest, cách 1
		model.addAttribute("userList", users); //cách 2 sử dụng model
		model.addAttribute("searchDto", new searchDTO()); //trả về để đẩy lên views
		/* phải đặt cùng tên với tên của model attribute của class, nếu class chưa đặt tên model thì phải trùng với tên class vì class
		 khi đó sẽ mặc định rằng tên class sẽ là tên của model attribute */
		return "users.html";
	}
	
	@GetMapping("/admin/user/list/add")
	public String createUser() {
		return "createUser.html";
	}
	
	@PostMapping("/admin/user/list/add")
	public String createUser(@ModelAttribute User user, @RequestParam("file") MultipartFile uploadFile) throws IllegalStateException, IOException { 
		//sử dụng multipart file để upload file lên
		//file thì chỉ có upload và download
		//vì file có tính chất empty nên không cần dùng require để đưa nó thành null
		if (!uploadFile.isEmpty()) {
			File saveFile = new File("D:/"+uploadFile.getOriginalFilename());
			//luu file vao ổ D, kiến thức về file java core
			//nếu có file thì lưu không thì thôi, lưu với tên cơ bản mà user upleen
			uploadFile.transferTo(saveFile); // chuyển dữ liệu từ file up lên sang file lưu để lưu lại
			user.setAvatarURL(uploadFile.getOriginalFilename()); //set dữ liệu để lưu vô database
			//upload thì cop từ file tải lên về ổ cứng máy chủ gán vào file ở đó
		}
		userService.create(user);
		return "redirect:/admin/user/list"; //get method
	}
	
	@GetMapping("/admin/user/download") //?fileName = abc.jpg
	public void download(@RequestParam("filename") String fileName, HttpServletResponse resp) throws IOException {
		File file = new File("D:/"+fileName); //Tạo 1 đối tượng file chứa dữ liệu của file trong server  
		Files.copy(file.toPath(), resp.getOutputStream()); 
		//copy dữ liệu từ đó và đẩy ra ngoài
		//download thì copy từ máy chủ gán vào response và trả về hình ảnh, đây thực ra không phải download mà là đẩy hình ảnh lên giao diện
	}
	
	@GetMapping("/admin/user/list/delete") //bắt event delete
	public String deleteUser(@RequestParam("id") int id) { //lấy id ra
		userService.deleteById(id);
		return "redirect:/admin/user/list";
	}
	
	@GetMapping("/admin/user/list/search")
	public String searchByname( Model model, @ModelAttribute("searchDto") @Valid searchDTO searchDto, BindingResult bindingResult) { //thêm valid để nhận validation
//			@RequestParam("searchName") String searchName, 
//			@RequestParam(name="currentPage", required = false) Integer currentPage, 
//			//khi sử dụng integer kiểu đối tượng thì khi không có input nó sẽ bằng null
//			//nhưng chỉ là trường hợp nếu không có input để nhập vào, nếu có input mà không nhập nó vẫn tính là truyền lên khoảng trắng
//			//để khắc phục ta dùng name và require false thì nếu tham số gửi lên không được gửi trong request nó sẽ tính là null, và 
//			// vì chỉ có kiểu đối tượng mới nhận được null nên ta sẽ dùng integer thay vì int, int là kiểu nguyên thủy không được null
//			//nếu require true thì bắt buộc phải điền vào input nếu không sẽ bị lỗi 404
			// vì integer,... cùng các kiểu số khác không chứa khái niệm empty nên cần dùng required biến nó thành null để biểu thị sự bỏ trống
//			@RequestParam(name="size", required = false) Integer size,
//			@RequestParam("sortField")  String sortField) {
		if (bindingResult.hasErrors()) { //@valid sẽ check nếu rơi vào error thì là has Error và trả về trang + trả về message lỗi để nếu ta gọi thì in ra
			return "users.html"; //check nếu có lỗi thì return về views
		} //bắt buộc đặt sau @valid annotation và không có bất kì cái gì trước nó
		
		Page<User> searchedUser = userService.searchByName(searchDto);
		model.addAttribute("userList", searchedUser.getContent()); //trả về listUser dưới dạng list trong trang đó
		model.addAttribute("totalPage", searchedUser.getTotalPages()); //trả về tổng số trang
		return "users.html";
	}
	
	@GetMapping("/admin/user/list/edit")
	public String editUser (@RequestParam("id") int id, Model model) {
		User user = userService.getById(id);
		model.addAttribute("user", user); //đẩy thông tin lên views
		return "editUser.html";
	}
	
	@PostMapping("/admin/user/list/edit")
	public String updateUser(@ModelAttribute User user, @RequestParam("file") MultipartFile uploadFile) throws IllegalStateException, IOException { //sử dụng như này sẽ tự động gán các dữ liệu từ post đẩy về vào user, không cần set
		if (!uploadFile.isEmpty()) {
			File saveFile = new File("D:/"+uploadFile.getOriginalFilename());
			//luu file vao ổ D, kiến thức về file java core
			//nếu có file thì lưu không thì thôi, lưu với tên cơ bản mà user upleen
			uploadFile.transferTo(saveFile); // chuyển dữ liệu từ file up lên sang file lưu để lưu lại
			user.setAvatarURL(uploadFile.getOriginalFilename()); //set dữ liệu để lưu vô database
			//upload thì cop từ file tải lên về ổ cứng máy chủ gán vào file ở đó
		}
		userService.update(user);
		return "redirect:/admin/user/list";
	}
}
