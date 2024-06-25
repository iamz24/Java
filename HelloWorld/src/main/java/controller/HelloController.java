package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/hello", loadOnStartup = 1) //map đường dẫn nếu muốn map nhiều kiểu thì dùng mảng {/hi, /hello}
public class HelloController extends HttpServlet {
	@Override
	public void init() throws ServletException { //khi tạo servlet thì nó chạy vào hàm init báo lên
		// TODO Auto-generated method stub
		System.out.println("Hello baby");
	}
	
	@Override
	public void destroy() { //khi dừng server thì chạy hàm destroy
		// TODO Auto-generated method stub
		System.out.println("Bye baby");
	}
	
	//Sử dụng get, khi gõ đường dẫn auto sử dụng get, giống hàm main để chạy code
	// req chứa các tham số đẩy lên server, resp chứa các dữ liệu trả về từ server
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("HTTP GET METHOD hello"); //Dữ liệu gửi đi có văn bản http get method
		System.out.println(req.getRemoteAddr()); //lấy remote address gửi đi
		
		//response
		resp.setContentType("text/html"); //trả về loại nội dung text, mặc định là plain
		PrintWriter pw = resp.getWriter();
		pw.println("hello world");
		pw.println("<h1>Hello World</h1>");
	}
}
