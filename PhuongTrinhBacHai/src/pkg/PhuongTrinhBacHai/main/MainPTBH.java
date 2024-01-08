package pkg.PhuongTrinhBacHai.main;

import java.util.Scanner;

import pkg.PhuongTrinhBacHai.model.ModelPTBH;

public class MainPTBH {
	public static void main(String[] args) {
		System.out.println("Phuong trinh co dang Ax^2+Bx+c= 0. Tim x?");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so A:");
		double a = sc.nextFloat();
		System.out.println("Nhap so B:");
		double b = sc.nextFloat();
		System.out.println("Nhap so C:");
		double c = sc.nextFloat();
		
		ModelPTBH.PhuongTrinhBacHai(a, b, c);
	}

}
