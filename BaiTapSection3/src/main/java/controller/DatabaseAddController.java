package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import databaseService.ImpUserDB;
import model.User;

@WebServlet("/user/service/add")
public class DatabaseAddController extends HttpServlet {
	ImpUserDB impU = new ImpUserDB();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		User user = new User();
		user.setName(name);
		user.setAge(Integer.parseInt(age));
		impU.insert(user);
		resp.sendRedirect(req.getContextPath() + "/user/service");
	}
	
	
}
