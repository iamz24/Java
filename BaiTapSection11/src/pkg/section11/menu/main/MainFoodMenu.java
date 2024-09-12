package pkg.section11.menu.main;

import pkg.section11.menu.model.EnumFoodMenu;

public class MainFoodMenu {
	public static void main(String[] args) {
		System.out.println("Danh sach do uong: ");
		for (EnumFoodMenu FoodMenu : EnumFoodMenu.values()) {
			System.out.println(FoodMenu.getStt() + FoodMenu.getTenDoUong());
		}
	}
}
