package pkg.section7.model.Person;

import java.util.Scanner;

public class ModelPerson {
	private String ten;
	private int tuoi;
	
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao ten: ");
		ten = sc.nextLine();
		System.out.println("Nhap vao tuoi: ");
		tuoi = sc.nextInt();
	}
	
	public void output() {
		System.out.println("Ten: "+this.ten);
		System.out.println("Tuoi: "+this.tuoi);
	}
}
