package pkg.section9.exception.main;

import java.util.Scanner;

public class MainException {
	public static void main(String[] args) {

			while (true ) {
				Scanner sc = new Scanner(System.in);
				try {
					System.out.println("Nhap vao so x: ");
					int x = sc.nextInt();
					System.out.println("Nhap vao so y: ");
					int y = sc.nextInt();
					System.out.println("x = "+x);
					System.out.println("y = "+y);
					System.out.println("x + y = "+(x+y));
					break;
				} catch (Exception e) {
					System.out.println("Da loi, moi nhap lai");
				}
			
			}	
	}
}
