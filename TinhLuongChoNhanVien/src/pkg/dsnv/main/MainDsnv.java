package pkg.dsnv.main;

import java.util.Iterator;
import java.util.Scanner;

import pkg.dsnv.model.ModelAddress;
import pkg.dsnv.model.ModelEmployee;
import pkg.dsnv.model.ModelPerson;

public class MainDsnv {
	public static void main(String[] args) {
		ModelEmployee[] emps = new ModelEmployee[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao thong tin: ");
		
		for (int i = 0; i < emps.length; i++) {
			String tenDuong = sc.nextLine();
			String ten = sc.nextLine();
			int namKN = sc.nextInt();
			
			ModelAddress add = new ModelAddress(tenDuong);
			emps[i] = new ModelEmployee(ten, namKN);
			emps[i].setDiaChi(add);
			
//			Hoac su dung tinh chat bac cau
//			ModelEmployee emp = new ModelEmployee(ten, luong);
//			emp.setDiaChi(add);
//			emps[i] = emp;
			
			
			sc.nextLine(); // xoa bo nho dem
		}
		
		for (ModelEmployee modelEmployee : emps) {
			System.out.println(modelEmployee.getTen());
			System.out.println(modelEmployee.getLUONG_CO_BAN());
			System.out.println(modelEmployee.getDiaChi().getTenDuong());
		}
	}

}
