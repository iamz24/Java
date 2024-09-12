package pkg.section5.main;

import pkg.section5.model.ModelChair;

public class MainChair {
	public static void main(String[] args) {
		ModelChair chair1 = new ModelChair();
		chair1.setLoaiGhe("Nhua");
		chair1.setNhaSx("Tho Phat");
		chair1.setNamSx(2002);
		
		System.out.println("Ghe cua ban la:");
		System.out.println("Nha san xuat: "+chair1.getNhaSx());
		System.out.println("Loai ghe: "+chair1.getLoaiGhe());
		System.out.println("Nam san xuat: "+chair1.getNamSx());
		
		System.out.println("================================");
		
		ModelChair chair2 = new ModelChair("Tien Phong", "Inox", 2012);
		System.out.println("Ghe cua ban la:");
		System.out.println("Nha san xuat: "+chair2.getNhaSx());
		System.out.println("Loai ghe: "+chair2.getLoaiGhe());
		System.out.println("Nam san xuat: "+chair2.getNamSx());
	}
}
