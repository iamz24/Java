package pkg.section1.main;

import java.util.Scanner;

public class MainMathjv {
	public static void main(String[] args) {
		
		System.out.println("Nhap so a:");
		float a = new Scanner(System.in).nextFloat();
		
		System.out.println(pkg.section1.math.Model.binhPhuong(a));
		System.out.println(pkg.section1.math.Model.canBac2(a));
		System.out.println(pkg.section1.math.Model.tichPia(a));
	}
}
