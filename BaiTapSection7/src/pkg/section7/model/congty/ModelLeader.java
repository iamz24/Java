package pkg.section7.model.congty;

import java.util.Scanner;

public class ModelLeader extends ModelPerson {
	private int teamSize;
	private final long LUONGCOBAN = 10000000;
	
	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	
	@Override
	public void input() {
		// TODO Auto-generated method stub
		super.input();
		System.out.println("Nhap vao teamsize: ");
		teamSize = new Scanner(System.in).nextInt();
	}
	
	@Override
	public void output() {
		// TODO Auto-generated method stub
		super.output();
		System.out.println("Teamsize: "+this.teamSize);
		this.bonus();
	}
	
	public void bonus() {
		if (teamSize > 10) {
			System.out.println("Luong = "+(LUONGCOBAN + LUONGCOBAN*50/100));
		} else {
			System.out.println("Luong = "+(LUONGCOBAN + LUONGCOBAN*10/100));
		}
	}
}
