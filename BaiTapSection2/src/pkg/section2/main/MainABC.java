package pkg.section2.main;

import java.util.Scanner;

import pkg.section2.model.*;

public class MainABC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Chon option: \n1. Min - Max \n2. Phuong trinh bac hai");
		int choice = sc.nextInt();
	
		System.out.println("Nhap so a: ");
		float a = sc.nextFloat();
		System.out.println("Nhap so b: ");
		float b = sc.nextFloat();
		System.out.println("Nhap so c: ");
		float c = sc.nextFloat();
		
		switch(choice) {
		case 1:
			ModelMinMax.MinMax(a, b, c);
		case 2:
			ModelPhuongTrinhBac2.PhuongTrinhBac2(a, b, c);
		}
	}

}
