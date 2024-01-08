package MainPS;

import java.util.Scanner;

import Model.Person;
import Model.Student;
import Model.Teacher;

public class MainPerson {
	public static void main(String[] args) {
		Teacher tc = new Teacher();
		Student st = new Student();
		
		input(tc);// p=tc=new teacher => da hinh
		info(tc);
		
		input(st);
		info(st);
	}
	
	
	public static void input(Person p) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten: ");
		p.setName(sc.nextLine());
		System.out.println("Nhap tuoi: ");
		p.setAge(sc.nextInt());
		sc.nextLine();
		if(p instanceof Student) {
			System.out.println("Nhap lop: ");
			((Student) p).setLop(sc.nextLine());
		} else if (p instanceof Teacher) {
			System.out.println("Nhap bo mon: ");
			((Teacher) p).setBoMon(sc.nextLine());
		}
	}
	
	public static void info(Person p) {
		System.out.println(p.getName());
		System.out.println(p.getAge());
		
		if(p instanceof Student) {
			System.out.println(((Student) p).getLop());
		} else if (p instanceof Teacher) {
			System.out.println(((Teacher) p).getBoMon() );
		}
	}
}
