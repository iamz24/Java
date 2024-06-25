package com.example.demo;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.dto.User;

public interface UserRepo extends JpaRepository<User, Integer> {//đại diện cho truy vấn vào DB, T là class map với bảng, ID là kiểu của @ID đã kí hiệu
	//spring chạy sẽ tự tạo ra một bean, khi dùng chỉ cần autowired
	//kế thừa lại interface này sẽ dùng được các hàm
	
	//tìm theo username, trả về duy nhất 1 và chính xác
	//select user where username = :username
//	User findByUsername(String username); //findby tương ứng với dấu bằng, mặc định
	
	//select user where name= :name
	List<User> findByName(String name); //trả về danh sách
	
	@Query("SELECT u FROM User u WHERE u.name LIKE :s") //dùng spring data jpa, dùng câu lệnh jpql, u là đại diện cho user
	Page<User> searchByName(@Param("s") String name, Pageable pageable); //map s vào với name để sử dụng name cho vị trí s
	//nếu sử dụng cách đặt tên khác và loại câu lệnh khác thì phải sử dụng annotation chỉ ra câu lệnh tùy biến
	//nếu thêm pageable thì trả về một page - trang, thay Page vào list
	
	@Modifying //những câu lệnh xóa, update phải có annotation modifying
	@Query("DELETE FROM User u WHERE u.name = :x") //nếu đặt theo ?x thì x chỉ dùng đc 1 lần
	int deleteUser (@Param("x") String name);
	
	void deleteByName (String name);//cách thứ 2 delete
	//các câu lệnh update, delete không trả về đối tượng mà chỉ trả về số lượng bản ghi hoặc void

}
