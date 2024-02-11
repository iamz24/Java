package pkg.section3.model;

public class ModelGiaiThua {
	public static void giaiThua(int a) {
		int b = 1;
		int giaiThua = 1;
		while (b<=a) {
			giaiThua *= b;
			b++;
		}
		System.out.println("Giai thua cua so vua nhap la: "+ giaiThua);
	}
}
