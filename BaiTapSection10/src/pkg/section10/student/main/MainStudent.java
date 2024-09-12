package pkg.section10.student.main;


import java.util.Scanner;


import pkg.section10.student.imp.ImplemetStudent;
import pkg.section10.student.model.ModelStudent;

public class MainStudent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ImplemetStudent stdimp = new ImplemetStudent();
		
		System.out.println("Nhap so luong thi sinh: ");
		int n = sc.nextInt();
		ModelStudent[] student = new ModelStudent[n];
		for (int i = 0; i < student.length; i++) {
			student[i] = new ModelStudent();
			stdimp.input(student[i]);	
		}
		
		for (ModelStudent modelStudent : student) {
			stdimp.output(modelStudent);
		}
		
		ModelStudent max = student[0];
		for (int i = 0; i < student.length; i++) {
			if (max.getAge() < student[i].getAge()) {
				max = student[i];
			}
		}
		
		System.out.println("Hoc sinh co tuoi lon nhat la: ");
		stdimp.output(max);
	}
}
