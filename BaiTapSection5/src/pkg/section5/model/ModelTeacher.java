package pkg.section5.model;

import java.util.Scanner;

public class ModelTeacher {
	int id;
	String name;
	String address;
	String boMon;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBoMon() {
		return boMon;
	}
	public void setBoMon(String boMon) {
		this.boMon = boMon;
	}
	
	public void input() {
		System.out.println("Nhập vao ID: ");
		id = new Scanner(System.in).nextInt();
		System.out.println("Nhập vao ho va ten: ");
		name = new Scanner(System.in).nextLine();
		System.out.println("Nhap vao dia chi: ");
		address = new Scanner(System.in).nextLine();
		System.out.println("Nhap vao bo mon giang day: ");
		boMon = new Scanner(System.in).nextLine();
	}
	
	public void output() {
		System.out.println("ID: "+id);
		System.out.println("Ho va ten: "+name);
		System.out.println("Dia chi: "+address);
		System.out.println("Bo mon: "+boMon);
	}
}
