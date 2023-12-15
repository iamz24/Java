package pkg.section1.main;

import java.util.Scanner;

public class MainPhuongTrinhBacNhat {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập 2 số theo thứ tự a - b: ");
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		
		pkg.section1.phuongtrinhbacnhat.Model.phuongTrinhBacNhat(a, b);
		
		return;
	}
}
