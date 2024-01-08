package pkg.section6.model;

import java.util.Scanner;

public class ModelSchool {
	private int id;
	private String name;
	private String address;
	
	public ModelSchool() {};
	public ModelSchool(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
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
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap id truong: ");
		id = sc.nextInt();
		sc.nextLine(); //khử đệm enter sau nextInt
		System.out.println("Nhap ten truong: ");
		name = sc.nextLine();
		System.out.println("Nhap dia chi: ");
		address = sc.nextLine();
	}
	
	public void output() {
		System.out.println("Ma truong: "+ id);
		System.out.println("Ten truong: "+name);
		System.out.println("Dia chi: "+address);
	}
	
}
