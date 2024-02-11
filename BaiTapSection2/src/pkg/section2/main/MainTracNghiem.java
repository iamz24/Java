package pkg.section2.main;

import java.util.Scanner;

public class MainTracNghiem {
	public static void main(String[] args) {
		System.out.println("Chon cau tra loi dung:");
		System.out.println("1+1+?");
		System.out.println("1. 1 \n2. 2");
		int a = new Scanner(System.in).nextInt();
		if(a == 1) {
			System.out.println("Sai");
		} else if (a == 2) {
			System.out.println("Dung");
		} else System.out.println("Khong co lua chon tren");
	}
}
