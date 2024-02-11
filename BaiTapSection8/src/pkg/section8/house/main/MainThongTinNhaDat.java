package pkg.section8.house.main;

import pkg.section8.house.model.ModelHouse;
import pkg.section8.house.model.ModelPerson;

public class MainThongTinNhaDat {
	public static void main(String[] args) {
		ModelPerson chuNha = new ModelPerson();
		chuNha.setTen("Nguyen Viet Dung");
		chuNha.setQuocTich("Viet Nam");
		
		ModelHouse house1 = new ModelHouse();
		house1.setChuNha(chuNha);
		house1.setSoNha("38B, Pham Van Dong.st");
		
		ModelHouse house2 = new ModelHouse();
		house2.setChuNha(chuNha);
		house2.setSoNha("64/172, Ba Trieu.st");
		
		System.out.println("Thong tin nha dat");
		System.out.println("*********************");
		System.out.println("Nha so 1");
		System.out.println("Chu so huu: "+ house1.getChuNha().getTen());
		System.out.println("Quoc tich: "+house1.getChuNha().getQuocTich());
		System.out.println("Dia chi nha: "+house1.getSoNha());
		System.out.println("=============================================");
		System.out.println("Nha so 2");
		System.out.println("Chu so huu: "+ house2.getChuNha().getTen());
		System.out.println("Quoc tich: "+house2.getChuNha().getQuocTich());
		System.out.println("Dia chi nha: "+house2.getSoNha());
	}
}
