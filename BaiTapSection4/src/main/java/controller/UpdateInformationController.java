package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import databaseService.ImpUserDB;
import model.User;

@WebServlet("/update-information")
public class UpdateInformationController extends HttpServlet {
	ImpUserDB db = new ImpUserDB();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.getRequestDispatcher("/views/UpdateInformation.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(); 
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		String username = (String)session.getAttribute("username");
		
		User user = new User(); 
		//user này là mới tức là khác với cái ta tạo password, tuy nhiên ở đây ta quan tâm đến việc đúng trong database chứ không cần thiết là phải chung 1 đối tượng
		//tức là đối tượng dùng để lưu tạm thời username và password không cần trùng với đối tượng lưu name và age
		user.setName(name);
		user.setAge(Integer.parseInt(age));
		user.setUsername(username);
		//thực hiện set để tiến hành cập nhật thông tin người dùng tài khoản
		
		
		db.insert(user);
		
		resp.sendRedirect(req.getContextPath()+"/login");
	}
}
