package com.example.demo.dto;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data //tự động set get không cần dùng set get nữa
@Table(name="user_info")//map bảng với user
@Entity //đánh dấu là entity, Bean là new object
public class User {
	@Id //map id vào primary key
//	@GeneratedValue(strategy = GenerationType.AUTO) //tự tăng auto increment, neu khong dung auto increment thi thay identity thanh cai khac
	//nếu id tự tăng stt thì bỏ phần nhập id đi
	@Column(name="ma_kh")//map với tên trong db, trùng tên thì k cần
	private int id;
	@Column(name="ten_kh", unique = false)//nếu unique bằng true thì tức là trong bảng phần đó được set unique
	private String name;
	private int age; //Đối với 2 từ birthDay thì trong sql tương ứng là birth_day, lúc đó không cần map column nữa
	//lưu url dẫn tới file ảnh avatar
	private String avatarURL;
}
