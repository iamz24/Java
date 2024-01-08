package pkg.section9.animal.main;

import java.util.Scanner;

import pkg.section9.animal.model.ModelAnimal;
import pkg.section9.animal.model.ModelChicken;
import pkg.section9.animal.model.ModelDog;

public class MainAnimal {
	public static void main(String[] args) {
		ModelDog dog = new ModelDog();
		ModelChicken chicken = new ModelChicken();
		
		System.out.println("Nhap vao thong tin cua cho: ");
		input(dog);
		System.out.println("Nhap vao thong tin cua ga: ");
		input(chicken);
		System.out.println("Thong tin cho vua nhap: ");
		output(dog);
		System.out.println("Thong tin ga vua nhap: ");
		output(chicken);
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
