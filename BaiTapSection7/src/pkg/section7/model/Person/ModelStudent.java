package pkg.section7.model.Person;

import java.util.Scanner;

public class ModelStudent extends ModelPerson{
	private String lopHoc;

	public String getLopHoc() {
		return lopHoc;
	}

	public void setLopHoc(String lopHoc) {
		this.lopHoc = lopHoc;
	}
	
	
	@Override
	public void input() {
		// TODO Auto-generated method stub
		super.input();
		System.out.println("Nhap vao lop hoc: ");
		lopHoc = new Scanner(System.in).nextLine();
	}
	
	@Override
	public void output() {
		// TODO Auto-generated method stub
		super.output();
		System.out.println("Lop hoc: "+this.lopHoc);
	}
}
