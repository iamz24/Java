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

@WebServlet("/login")
public class LoginController extends HttpServlet {
	ImpUserDB db = new ImpUserDB();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.getRequestDispatcher("/views/Login.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		User user = db.checkAccount(username, password);
		if (user != null) {
			HttpSession httpSession = req.getSession(); //nếu có thì lấy nếu chưa có thì tạo, ở đây là tạo
			httpSession.setAttribute("name", user.getName());
			httpSession.setAttribute("user", user);
			resp.sendRedirect(req.getContextPath() + "/user/service");
		} else {
			resp.sendRedirect(req.getContextPath()+"/login");
		}
		
	}
}
