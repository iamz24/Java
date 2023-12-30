package pkg.section8.product.main;

import java.util.Iterator;
import java.util.Scanner;

import pkg.section8.product.model.ModelCategory;
import pkg.section8.product.model.ModelProduct;

public class MainProduct {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so loai hang: ");
		int n = sc.nextInt();
		ModelProduct[] product = new ModelProduct[n];
		for (int i = 0; i < product.length; i++) {
			ModelCategory category = new ModelCategory();
			category.input();
			ModelProduct pro = new ModelProduct();
			pro.input();
			pro.setDanhMuc(category);
			
			product[i] = pro;
		}
		
		for (ModelProduct modelProduct : product) {
			modelProduct.output();
		}
	}
}
