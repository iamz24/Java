package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

//tất cả request đến server sẽ được foward đến spring sau đó spring quét các hàm controller
@Controller //kí hiệu đây là class controller đóng vai trò map các đường dẫn vào một hàm
public class HelloController {
	@GetMapping("/hello") //bên dưới getmapping phải có một hàm, dùng phương thức get
	public String hi() {
		//map url vào một hàm hàm này trả về tên file views
		return "hi.html"; //thay vì phải forward thì chỉ cần dùng return, file views được đặt trong resource template
	}
	
}
