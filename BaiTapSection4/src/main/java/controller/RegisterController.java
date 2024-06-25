package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import databaseService.ImpUserDB;
import model.User;

@WebServlet("/register")
public class RegisterController extends HttpServlet {
	ImpUserDB db = new ImpUserDB();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.getRequestDispatcher("/views/register.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String rePass = req.getParameter("re-pass");
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		
		if (!username.isEmpty()) {
			if (!password.isEmpty()) {
				if (password.equals(rePass)) {
					HttpSession oldSession = req.getSession();
					oldSession.invalidate(); //xóa session cũ khi up cái mới lên, đóng vai trò clear sessions cũ
					//bắt đầu tạo session chứa tài khoản mới
					HttpSession newSession = req.getSession();
					newSession.setAttribute("username", username);
					db.register(user);
					resp.sendRedirect(req.getContextPath()+"/update-information");
				} else {
					resp.getWriter().print("The passwords you entered do not match. Please try again.");
				}

			} else {
				resp.getWriter().print("The password field is required.");
			}
		} else {
			resp.getWriter().print("The username field is required.");
		}
	}
}
