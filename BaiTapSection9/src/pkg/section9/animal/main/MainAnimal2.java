package pkg.section9.animal.main;

import java.util.Scanner;

import pkg.section9.animal.model.ModelAnimal;
import pkg.section9.animal.model.ModelChicken;
import pkg.section9.animal.model.ModelDog;

public class MainAnimal2 {
	public static void main(String[] args) {
		while (true) {
			System.out.println("Menu");
			System.out.println("1. Nhap thong tin cho");
			System.out.println("2. Nhap thong tin ga");
			System.out.println("3. Thoat");
			int choice = new Scanner(System.in).nextInt();
			if (choice == 1) {
				menuDog();
				break;
			} else if (choice == 2) {
				menuChicken();
				break;
			} else if (choice == 3) {
				System.out.println("Bye!");
				break;
			} else System.out.println("Lua chon khong hop le! Moi chon lai!");
		}
	}
	
	public static void menuChicken() {
		System.out.println("Nhap so luong giong:");
		int n = new Scanner(System.in).nextInt();
		ModelChicken[] chicken = new ModelChicken[n];
		for (int i = 0; i < chicken.length; i++) {
			chicken[i] = new ModelChicken();
			input(chicken[i]);
		}
		
		System.out.println("Danh sach vua nhap: ");
		for (ModelChicken modelChicken : chicken) {
			output(modelChicken);
		}
	}
	
	public static void menuDog() {
		System.out.println("Nhap so luong giong:");
		int n = new Scanner(System.in).nextInt();
		ModelDog[] dog = new ModelDog[n];
		for (int i = 0; i < dog.length; i++) {
			dog[i] = new ModelDog();
			input(dog[i]);
		}
		
		for (ModelDog modelDog : dog) {
			output(modelDog);
		}
	}
	
	public static void input(ModelAnimal animal) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap giong: ");
		animal.setGiongLoai(sc.nextLine());
		System.out.println("Nhap so luong: ");
		animal.setSoLuong(sc.nextInt());
		sc.nextLine();
		if (animal instanceof ModelDog) {
			System.out.println("Nhap danh gia giong: ");
			((ModelDog) animal).setChatGiong(sc.nextLine());
		} else if (animal instanceof ModelChicken) {
			System.out.println("Nhap so trung: ");
			((ModelChicken) animal).setSoTrung(sc.nextInt());
		}
	}
	
	public static void output(ModelAnimal animal) {
		System.out.println("Giong loai: "+animal.getGiongLoai());
		System.out.println("So luong: "+animal.getSoLuong());
		if (animal instanceof ModelDog) {
			System.out.println("Danh gia: "+((ModelDog) animal).getChatGiong());
		} else if (animal instanceof ModelChicken) {
			System.out.println("So trung: "+((ModelChicken) animal).getSoTrung());
		}
	}
}
