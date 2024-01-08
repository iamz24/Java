package pkg.section10.laptop.imp;

import java.util.Scanner;

import pkg.section10.laptop.model.ModelLaptop;
import pkg.section10.laptop.service.ServiceLaptop;

public class ImplementLaptop implements ServiceLaptop {

	@Override
	public void input(ModelLaptop it) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ID: ");
		it.setId(sc.nextInt());
		sc.nextLine();
		System.out.println("Nhap CPU: ");
		it.setCpu(sc.nextLine());
		System.out.println("Nhap ram: ");
		it.setRam(sc.nextLine());
		System.out.println("Nhap VGA: ");
		it.setVga(sc.nextLine());
	}

	@Override
	public void output(ModelLaptop it) {
		System.out.println("ID: "+it.getCpu());
		System.out.println("CPU: "+it.getCpu());
		System.out.println("RAM: "+it.getRam());
		System.out.println("VGA: "+it.getVga());
	}
	
}
