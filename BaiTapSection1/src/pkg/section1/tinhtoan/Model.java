package pkg.section1.tinhtoan;

public class Model {
	public static void Tong(int a, int b) {
		int tong = a + b;
		System.out.println("Tong so nguyen: "+tong);
		return;
	}
	
	public static void Hieu(int a, int b) {
		int hieu = a - b;
		System.out.println("Hieu so nguyen: "+hieu);
		return;
	}
	
	public static void Tich(int a, int b) {
		int tich = a*b;
		System.out.println("Tich so nguyen: "+tich);
		return;
	}
	
	public static void Thuong(int a, int b) {
		double thuong  = (float) a/b;
		System.out.println("Thuong so nguyen: "+thuong);
		return;
	}
	
	public static void Tong(float a, float b) {
		float tong = a + b;
		System.out.println("Tong so thuc: "+tong);
		return;
	}
	
	public static void Hieu(float a, float b) {
		float hieu = a - b;
		System.out.println("Hieu so thuc: "+hieu);
		return;
	}
	
	public static void Tich(float a, float b) {
		float tich = a*b;
		System.out.println("Tich so thuc: "+tich);
		return;
	}
	
	public static void Thuong(float a, float b) {
		double thuong  = a/b;
		System.out.println("Thuong so thuc: "+thuong);
		return;
	}
}
