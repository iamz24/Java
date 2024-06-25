package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import databaseController.RegisterDB;
import model.Person;

@WebServlet("/person/create")
public class PersonCreateController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//khi nhập url và tải thì là get
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = req.getRequestDispatcher("/views/person-create.jsp");
		
		dispatcher.forward(req, resp);
	}
	
	RegisterDB db = new RegisterDB();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Khi ấn save để đẩy dữ liệu sẽ là post
		// TODO Auto-generated method stub
		String id = req.getParameter("id"); 
		//client gửi lên server dữ liệu id nên id nằm trong request
		//Ta lấy dữ liệu có name là id trên client để gán vào biến id
		//tất cả đều là string
		String name = req.getParameter("name");
		
		System.out.println(id + " " + name);
		
		Person p = new Person();
		p.setId(Integer.parseInt(id));
		p.setName(name);
		// sẽ đẩy dữ liệu về console và in ra trang trắng vì chưa hề có view nào phía sau
		
		db.register(p); //đẩy vào database
		
		//views
		req.setAttribute("person", p); //set đối tượng vừa tạo vào person và gửi đi cùng request qua forward
		req.getRequestDispatcher("/views/person-detail.jsp").forward(req, resp); //forward sang trang tiếp theo 		
	}
}
