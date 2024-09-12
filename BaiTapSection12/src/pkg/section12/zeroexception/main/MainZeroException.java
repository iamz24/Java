package pkg.section12.zeroexception.main;

import pkg.section12.zeroexception.model.ModelZeroException;

public class MainZeroException {
	public static void main(String[] args) {
		try {
			chia2So(3, 0);
		} catch (ModelZeroException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getNotification());
		}
	}
	
	private static void chia2So(int a, int b) throws ModelZeroException {
		try {
			System.out.println(a/b);
		} catch (Exception e) {
			throw new ModelZeroException("Loi mau so bang 0");
		}
	}
}
