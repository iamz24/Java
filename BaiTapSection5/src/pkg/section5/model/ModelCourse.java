package pkg.section5.model;

import java.util.Scanner;

public class ModelCourse {
	int id;
	String name;
	float score;
	
	public void input() {
		System.out.println("Nhap ID: ");
		id = new Scanner(System.in).nextInt();
		System.out.println("Nhap ho va ten: ");
		name = new Scanner(System.in).nextLine();
		System.out.println("Nhap diem thi: ");
		score = new Scanner(System.in).nextFloat();
	}
	
	public void output() {
		System.out.println("ID: "+id);
		System.out.println("Ho va ten: "+name);
		System.out.println("Diem thi: "+score);
		if (score < 5) {
			System.out.println("Hoc luc: Yeu");
		} else if (score >=5 && score <7) {
			System.out.println("Hoc luc: Trung Binh");
		} else if (score >=7 && score <8) {
			System.out.println("Hoc luc: Kha");
		} else if (score >=8 && score <9) {
			System.out.println("Hoc luc: Gioi");
		} else System.out.println("Hoc luc: Xuat sac");
	}
}
