package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import databaseService.ImpUserDB;
import model.User;

@WebServlet("/user/service/search")
public class DatabaseSearchByNameController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ImpUserDB db = new ImpUserDB();
		String searchName = req.getParameter("searchName"); //lấy name gửi lên từ client
		List<User> uList = db.searchByName(searchName);
		req.setAttribute("listUser", uList);
		req.getRequestDispatcher("/views/DatabaseService.jsp").forward(req, resp);
	}
}
