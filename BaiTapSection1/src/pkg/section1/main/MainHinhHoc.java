package pkg.section1.main;

import java.util.Scanner;

public class MainHinhHoc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap chieu dai HCN: ");
		float chieuDai = sc.nextFloat();
		
		System.out.println("Nhap chieu rong HCN: ");
		float chieuRong = sc.nextFloat();
		
		System.out.println("Chu vi HCN la: "+pkg.section1.hinhhoc.ModelHCN.chuVi(chieuDai, chieuRong));
		
		System.out.println("Dien tich HCN la: "+pkg.section1.hinhhoc.ModelHCN.dienTich(chieuDai, chieuRong));
		
		System.out.println("Nhap canh hinh vuong: ");
		float canhHinhVuong = sc.nextFloat();
		
		System.out.println("Chu vi hinh vuong: "+pkg.section1.hinhhoc.ModelHV.chuVi(canhHinhVuong));
		System.out.println("Dien tich hinh vuong: "+pkg.section1.hinhhoc.ModelHV.dienTich(canhHinhVuong));
		
		return;
	}
}
