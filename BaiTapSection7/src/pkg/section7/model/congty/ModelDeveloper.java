package pkg.section7.model.congty;

import java.util.Scanner;

public class ModelDeveloper extends ModelPerson  {
	private String programLanguage;

	public String getProgramLanguage() {
		return programLanguage;
	}

	public void setProgramLanguage(String programLanguage) {
		this.programLanguage = programLanguage;
	}
	
	@Override
	public void input() {
		// TODO Auto-generated method stub
		super.input();
		System.out.println("Nhap vao ngon ngu lap trinh: ");
		programLanguage = new Scanner(System.in).nextLine();
	}
	
	@Override
	public void output() {
		// TODO Auto-generated method stub
		super.output();
		System.out.println("Ngon ngu lap trinh: "+this.programLanguage);
	}
}
