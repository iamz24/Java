package pkg.section2.model;

public class ModelMinMax {
	public static void MinMax(float a, float b, float c) {
		
		if (a>b && a>b) {
			System.out.println("So lon nhat la: "+a);
		} else if(b>a && b>c) {
			System.out.println("So lon nhat la: "+b);
		} else if(c>b && c>a) {
			System.out.println("So lon nhat la: "+c);
		} else {
			System.out.println("Ba so bang nhau");
		}
		
		if(a<b && a<c) {
			System.out.println("So nho nhat la: "+a);
		} else if(b<a && b<c) {
			System.out.println("So nho nhat la: "+b);
		} else if(c>b && c>a)  {
			System.out.println("So nho nhat la: "+c);
		} else return;
		return;
	}
}
