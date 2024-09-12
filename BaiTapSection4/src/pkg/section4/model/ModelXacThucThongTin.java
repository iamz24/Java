package pkg.section4.model;

import java.util.Scanner;

public class ModelXacThucThongTin {
	public static void Email() {
		System.out.println("Nhap vao Email: ");
		String email = new Scanner(System.in).nextLine();
		if (email.contains("@")) {
			String[] xetEmail = email.split("@");
			if (xetEmail.length == 2) { //email có dạng bắt buộc là abc@gmail.com, split @ tức mảng phải có độ dài 2 là abc và gmail.com
				if (xetEmail[0].length() > 3) { // điều kiện cho phần trước @ từ 4 chữ trở lên
					if (xetEmail[1].contains(".")) { //điều kiện phần sau của mail tức gmail.com phải có dấu chấm, có thể sử dụng index of để ép vị trí của dấu chấm
						System.out.println("Email hợp lệ");
					} else System.out.println("Email sai: Thiếu dấu chấm");
				} else System.out.println("Email sai: Độ dài phần trước @ ít nhất phải là 4");
			}
		}  else System.out.println("Email sai: Email thiếu ký tự @");
	}
	
	
	public static void Telephone() {
		System.out.println("Nhập vào số điện thoại: ");
		String tele = new Scanner(System.in).nextLine();
		if (tele.length() == 10) { // xét độ dài số điện thoại là 10 (1)
			
			if (tele.indexOf("0") == 0) { // xét số đầu tiên ở vị trí 0 là số 0 (2)
			
				for(int i = 1; i < tele.length(); i++) {
					if (!(tele.charAt(i)=='0' ||tele.charAt(i)=='1' ||tele.charAt(i)=='2'
						|| tele.charAt(i)=='3' || tele.charAt(i)=='4' ||tele.charAt(i)=='5' 
						|| tele.charAt(i)=='6' || tele.charAt(i)=='7' ||tele.charAt(i)=='8' ||tele.charAt(i)=='9')) { // xét 9 số, trừ số đầu tiên đã là 0 xét ở trên phải là số chạy từ 0-9 (3)
						System.out.println("Số điện thoại sai, vị trí sau có kí tự không hợp lệ: " + (i+1));// nếu các số kphai các số từ 0-9 thì thông báo 2 cái lỗi này
						System.out.println("Ký tự không hợp lệ là: "+ tele.charAt(i));
					} 
				} // nếu các số là 0-9 thì đã hợp lệ thoát if không gặp câu lệnh nào cả for sẽ lặp đủ số lần các câu lệnh không tồn tạị, không in gì cả và chạy xuống gặp cấu sysout là hệ quả của (1)(2) đúng và (3) sai
				System.out.println("Số điện thoại hợp lệ");
			} else System.out.println("Số điện thoại sai, số đầu tiên phải là 0"); //nếu số đầu tiên khác 0 chạy xuống đây

			
		} else System.out.println("Số điện thoại sai, độ dài phải là 10"); // nếu hơn 10 chạy xuống đây
	}
}
