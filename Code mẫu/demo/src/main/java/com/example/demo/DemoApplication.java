package com.example.demo;

import java.util.Locale;

import javax.naming.spi.Resolver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@SpringBootApplication
public class DemoApplication implements WebMvcConfigurer {//implement webmvc để sử dụng filter
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Bean //tạo bean bằng tay, manual
	public LocaleResolver localeResolver() { //tạo bean, mục đích là xem ngôn ngữ đang chọn là gì
	//được sử dụng để xác định và quản lý locale (ngôn ngữ và vùng miền) cho ứng dụng web
	//nhiệm vụ của nó là kiểm tra xem người dùng đang lưu dữ liệu của vùng ngôn ngữ nào
	//có thể lưu ngôn ngữ vào session
		SessionLocaleResolver resolver = new SessionLocaleResolver(); //resolver sinh ra lưu vào session
		resolver.setDefaultLocale(new Locale("")); //đặt mặc định là tiếng việt, đọc file message_vi
		//nếu không truyền tham số thì lấy default là message.propoties
		return resolver;
	}
	
	@Bean
	LocaleChangeInterceptor localeChangeInterceptor() { 
		//đặt tên cùng với tên interface để khi gọi ra sẽ được tự động autowired không cần @autowired
		//nếu không cần đặt tên cho bean và dùng autowired
		//interceptor có chức năng giống filter, lọc các dữ liệu đi qua xem có chứa cái yêu cầu không
		//ví dụ ở đây là kiểm tra localchange là sự thay đổi của language
		LocaleChangeInterceptor lci = new LocaleChangeInterceptor();
		lci.setParamName("language");
		//là param mà dữ liệu sẽ được lấy ví dụ trên url là ?language=vi thì dữ liệu vi sẽ được lấy
		//nó sẽ lọc các request đi qua nếu chứa lang mới thì nó sẽ lấy ra và thay đổi
		return lci;
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
		registry.addInterceptor(localeChangeInterceptor());
		// đăng kí với spring, từ đó các dữ liệu mới chạy qua đây
	}
	
}
