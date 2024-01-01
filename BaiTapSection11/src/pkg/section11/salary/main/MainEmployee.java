package pkg.section11.salary.main;

import pkg.section11.salary.model.ModelEmployee;

public class MainEmployee {
	public static void main(String[] args) {
		ModelEmployee emp = new ModelEmployee() {
			
			@Override
			public void salary() {
				// TODO Auto-generated method stub
				System.out.println("luong 10 trieu");
			}
		};
		
		emp.salary();
	}
}
