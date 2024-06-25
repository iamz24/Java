package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import databaseService.ImpUserDB;
import model.User;

@WebServlet("/user/service")
public class DatabaseServiceController extends HttpServlet {
	ImpUserDB db = new ImpUserDB();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = req.getSession();
		User user = (User)session.getAttribute("user");
		if (user != null) {
			List<User> listUser = db.getAll();
			req.setAttribute("listUser", listUser);
			
			req.getRequestDispatcher("/views/DatabaseService.jsp").forward(req, resp);
		} else {
			resp.sendRedirect(req.getContextPath() + "/login");
		}
	}
}
