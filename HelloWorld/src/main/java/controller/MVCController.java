package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/mvc")
public class MVCController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//MVC: servlet đóng vai trò controller điều hướng, jsp đóng vai trò view - giao diện
		RequestDispatcher dispatcher = req.getRequestDispatcher("/hello.jsp");//chuyển tiếp sang một trang servlet khác
		
		req.setAttribute("msg", "Hello java servlet!"); 
		//tạo thuộc tính bằng cách map một key dạng string với một đối tượng
		/*Khi request vào /mvc thì nó sẽ gửi request lên server lấy dữ liệu gán và msg và cầm cả cái cục request đó gửi sang
		jsp trong đó bao gồm cả attribute, vì được gửi đi cùng request nên nó gọi là request attribute*/
		
		dispatcher.forward(req, resp); 
		//chuyển tiếp, khi một request có phương thức là get gọi vào /mvc thì nó sẽ gọi vào hàm
		//do get và nó nhận request và chuyển tiếp toàn bộ req và resp sang /hello.jsp để hiển thị lên giao diện
		//và thay vì gọi /hello.jsp để hiển thị giao diện thì chỉ cần gọi /mvc
	}
}
