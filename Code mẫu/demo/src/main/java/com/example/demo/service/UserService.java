package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.example.demo.UserRepo;
import com.example.demo.dto.User;
import com.example.demo.dto.searchDTO;




@Service //tạo bean = new một đối tượng userService, được quản lí bởi spring container
public class UserService {
	@Autowired
	UserRepo userRepo;//dependency inject, tiêm thuộc tính của userRepo vào
	@Transactional //đảm bảo nếu một dữ liệu sai thì sẽ roll back lại từ đầu toàn bộ
	public void create(User user) {
		userRepo.save(user); //lưu user, hàm save này nếu trùng id thì nó sẽ update cái vị trí đó
	}
	
	@Transactional
	public void update(User user) {//user truyền vào là user mới
		User currentUser = userRepo.findById(user.getId()).orElse(null); //tìm ra là user cũ
		if (currentUser != null) {
			currentUser.setAge(user.getAge());
			currentUser.setAvatarURL(user.getAvatarURL());
			userRepo.save(currentUser); //trong thực tế phải dùng findbyuser check xem có null không nếu không mới update, phải check
		}
	}
	
	public List<User> getAll(){
		return userRepo.findAll(); //lấy user ra
	}
	
	@Transactional
	public void deleteById(int id) {
		userRepo.deleteById(id); //xóa theo id, deleteallby là xóa tất cả những cái có cùng dữ liệu đó
	}
	
	public User getById (int id) {
		return userRepo.findById(id).orElse(null); // trả về Kiểu optional: nếu tìm thấy id thì trả về id còn nếu không trả về null
	}
	
	public Page<User> searchByName(searchDTO searchDto){//phải truyền vào trang hiện tại và tổng số bản ghi trên trang
		Sort sortBy = Sort.by("name").descending().and(Sort.by("age").descending()); 
		//truyền thuộc tính của user vào, ascending là sắp xếp theo aphabet
		//and là nếu cái trước có những cái trùng nhau thì sắp xếp theo cái and
		if (StringUtils.hasText(searchDto.getSortField())) { //stringutils là class của spring check đồng thời xem string đó có null và có empty hay không
			sortBy = Sort.by(searchDto.getSortField()).ascending(); //phần này phục vụ cho chức năng chọn cột để sort
			//khi chọn cột thì nó sẽ lấy cột đó để sort, tên cột yêu cầu phải là dữ liệu đến từ bên dto
		}
		
		if (searchDto.getCurrentPage() == null) {
			searchDto.setCurrentPage(1);
		}
		
		if (searchDto.getSize() == null) {
			searchDto.setSize(2);
		}
		
		PageRequest pageRequest = PageRequest.of(searchDto.getCurrentPage()-1, searchDto.getSize(), sortBy);//thêm sortby vào
		Page<User> page = userRepo.searchByName("%"+searchDto.getSearchName()+"%", pageRequest);
		System.out.println(page.getTotalPages()); //in ra tổng số trang
		return page;
	}
}
 