package pkg.section3.main;

import java.util.Scanner;

import pkg.section3.model.ModelMang;

public class MainlMang {
	public static void main(String[] args) {
		System.out.println("Nhap so phan tu trong mang: ");
		int n = new Scanner(System.in).nextInt();
		ModelMang.ModelMang(n);
	}
}
