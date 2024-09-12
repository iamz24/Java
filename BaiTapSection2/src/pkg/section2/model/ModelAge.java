package pkg.section2.model;

public class ModelAge {
	public static void Age(int age) {
		System.out.print("Doi tuong co so tuoi ban vua nhap la: ");
		if(age >= 1 && age <= 3) {
			System.out.println("Em be");
		} else if(age > 3 && age < 18) {
			System.out.println("Tre em");
		} else if (age >= 18 && age < 40) {
			System.out.println("Nguoi lon");
		} else if (age >= 40 && age < 60) {
			System.out.println("Trung nien");
		} else if(age >= 60)  {
			System.out.println("Nguoi gia");
		} else System.out.println("Khong ton tai so tuoi nay");
		return;
	}
}
