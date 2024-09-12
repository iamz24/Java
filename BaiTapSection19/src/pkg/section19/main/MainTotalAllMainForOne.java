package pkg.section19.main;

import java.util.Scanner;

public class MainTotalAllMainForOne {
	public static void main(String[] args) {
		while (true) {
			System.out.println("Menu:");
			System.out.println("1. Tac vu User");
			System.out.println("2. Tac vu Category");
			System.out.println("3. Tac vu Product");
			System.out.println("4. Tac vu Bill");
			System.out.println("5. Thoat");
			int choice = new Scanner(System.in).nextInt();
			if (choice == 1) {
				ModelForMainUser.menu();
			} else if (choice == 2) {
				ModelForMainCategory.menu();
			} else if (choice == 3) {
				ModelForMainProduct.menu();
			} else if (choice == 4) {
				ModelForMainBill.menu();
			} else if (choice == 5) {
				System.out.println("Thanks For Using!");
				break;
			} else {
				System.out.println("Khong ton tai lua chon, moi chon lai!");
			}
		}
	}
}
