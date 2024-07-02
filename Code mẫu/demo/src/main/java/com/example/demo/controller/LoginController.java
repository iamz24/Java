package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpSession;

@Controller //danh dau controler de chuong trinh biet
public class LoginController {
	@GetMapping("/login")
	public String login() {
		return "login.html";//trả về view
	}
	@PostMapping("/login")
	public String login(HttpSession session, @RequestParam("username") String username, @RequestParam("password") String password) { 
		// giống servlet, sử dụng req và resp nên cần set, nhưng khi áp dụng spring vào thì không cần
		//sử dụng annotation request param ngay trong phần khai báo
		if (username.equals("admin")&&password.equals("24112002")) {
			//session, có thể khai báo như servlet hoặc chỉ cần gọi khai báo là nó tự gán, không cần phải getSession
			session.setAttribute("username", username);
			//thay vì dùng resp.send thì dùng return redirect
			return "redirect:/hello";//chuyển hướng trang
		} else {
			return "redirect:/login";//chú ý có redirect
		}
	}
}
