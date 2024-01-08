package pkg.section10.student.imp;

import java.util.Scanner;

import pkg.section10.student.model.ModelAddress;
import pkg.section10.student.model.ModelSchool;
import pkg.section10.student.model.ModelStudent;
import pkg.section10.student.service.ServiceStudent;

public class ImplemetStudent implements ServiceStudent {

	@Override
	public void input(ModelStudent std) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so bao danh: ");
		std.setId(sc.nextLine());
		System.out.println("Nhap ten sinh vien: ");
		std.setName(sc.nextLine());
		System.out.println("Nhap tuoi sinh vien: ");
		std.setAge(sc.nextInt());
		sc.nextLine();
		ModelAddress add = new ModelAddress();
		ImplementAddress addimp = new ImplementAddress();
		addimp.input(add);
		std.setAdd(add);
		ModelSchool sch = new ModelSchool();
		ImplementSchool schimp = new ImplementSchool();
		schimp.input(sch);
		std.setSch(sch);
	}

	@Override
	public void output(ModelStudent std) {
		// TODO Auto-generated method stub
		System.out.println("So bao danh: "+std.getId());
		System.out.println("Ho va ten: "+std.getName());
		System.out.println("Tuoi: "+std.getAge());
		ImplementAddress addimp = new ImplementAddress();
		addimp.output(std.getAdd());
		ImplementSchool schimp = new ImplementSchool();
		schimp.output(std.getSch());
		
	}

	
	
}
