package pkg.section2.main;

import java.util.Scanner;

import pkg.section2.model.ModelAge;

public class MainAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nhap so tuoi: ");
		int Age = new Scanner(System.in).nextInt();
		ModelAge.Age(Age);
	}

}
