package pkg.section4.model;

import java.util.Scanner;

public class ModelString {
	public static void ModelString() {
		
		//Tạo 1 string và in ra độ dài
		String s1 = "Toi la Nguyen Viet Dung";
		System.out.println("Độ dài của string 1 là: "+s1.length());
		
		//String nhập từ bàn phím
		System.out.println("Nhap vao chuoi: ");
		String s2 = new Scanner(System.in).nextLine();
		
		// kiểm tra s1 có chứa s2 không
		if (s1.contains(s2)) {
			System.out.println("s1 co chua s2");
		} else {
			System.out.println("s1 khong chua s2");
		}
		
		int count = 0;
		for(int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == 'A' || s1.charAt(i) == 'a') {
				count++;
			}
		}
		System.out.println("So ky tu A: "+ count);
		
		// tách mảng s1 ra thành các phần tử cách nhau bởi dấu cách
		String[] stach =  s1.split(" "); // Lấy vách ngăn là dấu cách cứ mỗi lần đến dấu cách là bỏ qua dấu cách tách thành 1 index mới
		for(int i=0; i<stach.length; i++) {
			System.out.println("Tach chuoi thanh: "+ stach[i]);
		}
		
		
	}
}
