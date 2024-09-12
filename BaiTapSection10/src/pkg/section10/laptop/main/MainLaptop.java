package pkg.section10.laptop.main;

import pkg.section10.laptop.imp.ImplementLaptop;
import pkg.section10.laptop.model.ModelLaptop;

public class MainLaptop {
	public static void main(String[] args) {
		ModelLaptop laptop = new ModelLaptop();
		ImplementLaptop laptopimp = new ImplementLaptop();
		laptopimp.input(laptop);
		laptopimp.output(laptop);
	}
}
