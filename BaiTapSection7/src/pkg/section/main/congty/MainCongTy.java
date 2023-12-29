package pkg.section.main.congty;

import java.util.Scanner;

import pkg.section7.model.congty.ModelDeveloper;
import pkg.section7.model.congty.ModelLeader;

public class MainCongTy {
	public static void main(String[] args) {
		while(true) {
			System.out.println("Menu");
			System.out.println("1. Leader");
			System.out.println("2. Developer");
			System.out.println("3. Quit");
			System.out.println("Moi chon:");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			if(choice == 1) {
				Leader();
				System.out.println("Ban co muon thu tiep khong?");
				System.out.println("An phim 1 de tiep tuc");
				System.out.println("An phim bat ky de thoat");
				int choice2 = sc.nextInt();
				if (choice2 == 1) {
					System.out.println("Chuc vui ve!");
					continue;
				} else {
					System.out.println("Cam on da su dung chuong trinh!");
					break;
				}
			} else if (choice == 2) {
				Developer();
				System.out.println("Ban co muon thu tiep khong?");
				System.out.println("An phim 1 de tiep tuc");
				System.out.println("An phim bat ky de thoat");
				int choice2 = sc.nextInt();
				if (choice2 == 1) {
					System.out.println("Chuc vui ve!");
					continue;
				} else {
					System.out.println("Cam on da su dung chuong trinh!");
					break;
				}
			} else if (choice == 3) {
				System.out.println("Bye!");
				break;
			} else {
				System.out.println("Khong ton tai lua chon, moi chon lai!");
			}
		}
	}
	
	public static void Leader() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so luong Leader muon luu: ");
		int slLeader = sc.nextInt();
		ModelLeader[] leader = new ModelLeader[slLeader];
		for (int i = 0; i < leader.length; i++) {
			leader[i] = new ModelLeader();
			System.out.println("--------------------------");
			System.out.println("Nhap vao thong tin Leader so"+(i+1)+":");
			leader[i].input();
			System.out.println("=> Luu thanh cong!");
		}
		
		System.out.println("================================");
		System.out.println("Danh sach Leader:");
		for (ModelLeader modelLeader : leader) {
			System.out.println("------------------------------");
			modelLeader.output();
		}
		sc.nextLine();
		System.out.println("=====================================");
		System.out.println("Danh sach leader co team size tren 10:");
		int none = 0;
		for (int i = 0; i < leader.length; i++) {
			if (leader[i].getTeamSize() > 10) {
				System.out.println("----------------------------");
				leader[i].output();
			} else none++;
		}
		if (none == leader.length) {
			System.out.println("Khong co");
		}
		
	}
	
	public static void Developer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so luong Developer muon luu: ");
		int slDeveloper = sc.nextInt();
		ModelDeveloper[] developer = new ModelDeveloper[slDeveloper];
		for (int i = 0; i < developer.length; i++) {
			developer[i] = new ModelDeveloper();
			System.out.println("--------------------------");
			System.out.println("Nhap vao thong tin Leader so"+(i+1)+":");
			developer[i].input();
			System.out.println("=> Luu thanh cong!");
		}
		
		System.out.println("================================");
		System.out.println("Danh sach Developer:");
		for (ModelDeveloper modelDeveloper : developer) {
			System.out.println("--------------------------");
			modelDeveloper.output();
		}
		
		System.out.println("=============================");
		System.out.println("Danh sach Dev Java:");
		int none = 0;
		for (int i = 0; i < developer.length; i++) {
			if (developer[i].getProgramLanguage().equals("Java")) {
				System.out.println("-----------------------");
				developer[i].output();
			} else {
				none++;
			}
		}
		if (none == developer.length) {
			System.out.println("Khong co");
		}
	}
}
