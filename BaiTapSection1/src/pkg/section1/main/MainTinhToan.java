package pkg.section1.main;

import pkg.section1.tinhtoan.Model;

public class MainTinhToan {
	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		float x = 2.5f;
		float y = 1.35f;
		Model.Tong(a, b);
		Model.Hieu(a, b);
		Model.Tich(a, b);
		Model.Thuong(a, b);
		Model.Tong(x, y);
		Model.Hieu(x, y);
		Model.Tich(x, y);
		Model.Thuong(x, y);
		
	}
}
