package pkg.section6.model;

import java.util.Scanner;

public class ModelStudent {
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
		System.out.println("Nhap id: ");
		id = sc.nextInt();
		sc.nextLine(); //xóa bộ nhớ đệm
		System.out.println("Nhap ho va ten: ");
		name = sc.nextLine();
		System.out.println("Nhap vao tuoi: ");
		age = sc.nextInt();
		sc.nextLine();
	}
	
	public void output() {
		System.out.println("ID: "+id);
		System.out.println("Ho va ten: "+name);
		System.out.println("Tuoi: " +age);
	}
	
}
