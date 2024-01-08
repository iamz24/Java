package pkg.section7.model.Person;

import java.util.Scanner;

public class ModelTeacher extends ModelPerson {
	private String chuyenMon;

	public String getChuyenMon() {
		return chuyenMon;
	}

	public void setChuyenMon(String chuyenMon) {
		this.chuyenMon = chuyenMon;
	}
	
	
	@Override
	public void input() {
		// TODO Auto-generated method stub
		super.input();
		System.out.println("Nhap vao chuyen mon: ");
		chuyenMon = new Scanner(System.in).nextLine();
	}
	
	@Override
	public void output() {
		// TODO Auto-generated method stub
		super.output();
		System.out.println("Chuyen mon: "+this.chuyenMon); 
	}
}
