package pkg.section3.main;

import java.util.Iterator;

public class MainSoNguyenTo {
	public static void main(String[] args) {
		
		
		int soLuong = 0;// tao bien dem so luong de chut nua gan vao mang tim min max
		long tong = 0; //tạo biến tổng
		System.out.println("Cac so nguyen to co 4 chu so la: ");
		System.out.println();
		for(int i = 1000; i < 10000; i++) {
			if (checkSoNguyenTo(i)) {
				System.out.println(i);
				soLuong++;// cứ 1 lần i thỏa mãn hàm check số nguyên tố thì số lượng sẽ được tăng lên 1
				tong+=i; // cứ 1 lần i thỏa mãn thì tổng cộng thêm 1 số bằng số thỏa mãn đó và gán nó vào tổng, nghĩa là tổng mang kết quả của tổng các số thỏa mãn
			}
		}
		System.out.println("Tong cac so nguyen to co 4 chu so la:"+tong);
		
		//gan cac so nguyen to vao mang
		int [] soNguyenTo = new int [soLuong]; // tạo mảng số nguyên tố với số lượng phần tử là số lượng số nguyên tố
		int index=0;// khai báo 1 biến đại diện cho vị trí index = 0
		for(int i = 1000; i<10000; i++) {
			if(checkSoNguyenTo(i)==true) {
				soNguyenTo[index]=i;
				index++;
			}
		}
		
		//tim max 
		int max = soNguyenTo[0];
		for (int i = 0; i < soNguyenTo.length; i++) {
			if (max < soNguyenTo[i]) {
				max = soNguyenTo[i];
			}
		}
		System.out.println("So nguyen to co 4 chu so lon nhat la: " +max);
		
		//tim min
		int min = soNguyenTo[0];
		for (int i = 0; i < soNguyenTo.length; i++) {
			if (min > soNguyenTo[i]) {
				min = soNguyenTo[i];
			}
		}
		System.out.println("So nguyen to co 4 chu so nho nhat la: " +min);
		
	
		
		
	}
	
	// số nguyên tố là số chỉ chia hết cho chính nó và 1
	//Điều kiện để 1 số là số nguyên tố là phải lớn hơn bằng 2, không có ước số trong đoạn từ 2 tới căn bậc 2 của số đó
	public static boolean checkSoNguyenTo(int a) {
		if (a < 2) { // check ĐK nhỏ hơn 2 nếu nhỏ hơn thì hàm boolean false
			return false; // vì sử dụng hàm return rồi nên sau return tất cả câu lệnh là vô nghĩa nên không cần dùng break
		}
		
		for (int i = 2; i < Math.sqrt(a); i++) { // Hàm lặp từ 2 tới căn bậc 2 của số truyền vào
			if (a % i == 0) {	// nếu chia hết cho bất kì số nào trong khoảng đó thì trả về false
				return false; // vì sử dụng hàm return rồi nên sau return tất cả câu lệnh là vô nghĩa nên không cần dùng break
			}
		}
		
		return true; // nếu không rơi vào vị trí nào trong những cái trên thì trả về true
	}
}
