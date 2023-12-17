package pkg.section3.main;

import java.util.Scanner;

import pkg.section3.model.ModelGiaiThua;

public class MainGiaiThua {
	public static void main(String[] args) {
		System.out.println("Nhap so muon tinh giai thua: ");
		int a = new Scanner(System.in).nextInt();
		ModelGiaiThua.giaiThua(a);
	}
}
