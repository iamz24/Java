package pkg.section7.model.congty;

import java.util.Scanner;

public class ModelPerson {
	private int id;
	private String name;
	private int age;
	
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao id: ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap vao ten: ");
		name = sc.nextLine();
		System.out.println("Nhap vao tuoi: ");
		age = sc.nextInt();
	}
	
	public void output() {
		System.out.println("ID: "+this.id);
		System.out.println("Name: "+this.name);
		System.out.println("Age: "+this.age);
	}
	
}
