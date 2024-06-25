package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.Session;

@WebServlet("/login") //trang này phải public tức là không đi qua check filter điều kiện nào, nếu không chưa có điều kiện mà vượt => luôn bị chặn
public class LoginController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.getRequestDispatcher("/views/login.jsp").forward(req, resp); //forward sang trang login front end, forward chuyển trong nội bộ không cần tên project
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//Doc du lieu tu frontend
		String username = req.getParameter("Username");
		String password = req.getParameter("Password");
		
		//dùng select from để so sánh với bảng trong sql
		if (username.equals("admin")&&password.equals("24112002")) {
			//session - lưu tạm vào session, mặc định là 30p, hoặc khởi động lại server thì sẽ bị xóa
			HttpSession httpSession = req.getSession();
			System.out.println(httpSession.getId());//ngầm định có logic response về client một session id, trình duyệt khác nhau session id khác nhau phụ thuộc vào trình duyệt
			httpSession.setAttribute("loginUser", username); //lưu username vào session với tên gọi key là loginUser, sử dụng cho toàn bộ ứng dụng được, ăn theo trình duyệt
			//login đúng
			resp.sendRedirect(req.getContextPath()+"/admin/welcome"); 
			//hoặc sử dụng req.getcontextpath() + đường dẫn, getcontextpath lấy tên của project, cái này sẽ dễ hơn là cấp tên cứng của project vì lỡ sau đổi tên project
			//chặn filter đường dẫn này để chỉ khi đăng nhập vào đúng admin được cấp key mới qua được filter mà vào được, 
			//nếu không thì kẻ tấn công không cần login vẫn vào đc
		} else {
			//cách 1 là dùng dispatcher lại về trang login, nếu dùng forward thì khi gọi ngược lại sẽ không bị chặn filter
			//cách 2 là reload lại trang
			resp.sendRedirect(req.getContextPath()+"/login");//yêu cầu gọi trang, chuyển trang, do client chuyển không phải do server, nên cần tên project, sẽ bị chặn filter
		}
	}
}
