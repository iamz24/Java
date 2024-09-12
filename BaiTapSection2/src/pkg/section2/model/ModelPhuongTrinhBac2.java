package pkg.section2.model;

public class ModelPhuongTrinhBac2 {
	public static void PhuongTrinhBac2(float a, float b, float c) {
		
		double delta = Math.pow(a, 2) - 4*a*c;
		
		if (delta > 0) {
			double x1 = (-b + Math.sqrt(delta))/(2*a);
			double x2 = (-b - Math.sqrt(delta))/(2*a);
			System.out.println("Phuong trinh co 2 nghiem phan biet:");
			System.out.println("x1 = "+x1);
			System.out.println("x2 = "+x2);
		} else if (delta == 0) {
			float x = -b/(2*a);
			System.out.println("Phuong trinh co 1 nghiem duy nhat:");
			System.out.println("x = "+x);
		} else{
			System.out.println("Phuong trinh vo nghiem");
		}
		
		return;
	}
}
