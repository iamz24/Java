package pkg.section3.model;

import java.util.Scanner;

public class ModelMang {
	public static void ModelMang(int n) {
		
		//nhap phan tu
		Scanner sc = new Scanner(System.in);
		int[] mang = new int[n];
		System.out.println("Nhap cac phan tu");
		for (int i = 0; i < mang.length; i++) {
			mang[i] = sc.nextInt();
		}
		System.out.println("Cac phan tu trong mang la:");
		for (int i : mang) {
			System.out.println(i);
		}
		
		//tong phan tu
		int sum = 0;
		for (int i = 0; i < mang.length; i++) {
			sum += mang[i];
			
		}
		System.out.println("Tong cac phan tu trong mang la: "+ sum);
		
		//tich phan tu
		int tich=1;
		for (int i = 0; i < mang.length; i++) {
			tich *= mang[i];
		}
		System.out.println("Tich cac phan tu trong mang la: "+ tich);
		
		//sap xep tang dan
		for (int i = 0; i < mang.length-1; i++) {
			int sx = mang[i];
			for (int j = i+1; j < mang.length; j++) {
				if (sx>mang[j]) {
					mang[i]=mang[j];
					mang[j]=sx;
					sx = mang[i];
				}
			}
		}
		System.out.println("Sap xep mang da nhap tang dan:");
		for (int i : mang) {
			System.out.println(i);
		}
		
		//Gia tri nho nhat
		int min = mang[0];
		for (int i = 0; i < mang.length; i++) {
			if (min > mang[i] ) {
				min = mang[i];
			}
		}
		System.out.println("Gia tri min trong mang la: "+min);
		
		// gia tri lon nhat
		int max = mang[1];
		for (int i = 0; i < mang.length; i++) {
			if (max < mang[i]) { // so sanh max voi so nguyen to tai vi tri i,
				max = mang[i];	// nếu lớn hơn max thì đổi vị trí cho max
			}
		}
		System.out.println("Gia tri lon nhat trong mang la: "+max);
		
	}
}
