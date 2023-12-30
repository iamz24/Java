package pkg.section8.product.model;

import java.util.Scanner;

public class ModelCategory {
	private int id;
	private String name;
	
	public ModelCategory() {}
	
	public ModelCategory(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao id: ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap vao loai hang: ");
		name = sc.nextLine();
	}
	
	public void output() {
		System.out.println("ID: "+this.id);
		System.out.println("Loai hang: "+this.name);
	}
	
}
