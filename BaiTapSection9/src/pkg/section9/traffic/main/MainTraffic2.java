package pkg.section9.traffic.main;

import java.util.Scanner;

import pkg.section9.traffic.model.ModelCar;
import pkg.section9.traffic.model.ModelTraffic;
import pkg.section9.traffic.model.ModelTrain;

public class MainTraffic2 {
	public static void main(String[] args) {
		ModelCar car = new ModelCar();
		ModelTrain train = new ModelTrain();
		while (true) {
			System.out.println("Chon ve muon xem (Train/Car), q de thoat: ");
			String choice = new Scanner(System.in).nextLine();
			if (choice.equals("Train") || choice.equals("train")) {
				System.out.println("Gia ve tau hoa: ");
				thongTinVe(train);
				System.out.println("Cam on da su dung dich vu!");
				break;
			} else if (choice.equals("Car") || choice.equals("car")) {
				while (true) {
					System.out.println("(Normal/Bus): ");
					String choice2 = new Scanner(System.in).nextLine();
					if (choice2.equals("Normal") || choice2.equals("normal")) {
						System.out.println("Gia ve xe 7 cho: ");
						car.setLoaiXe("Xe 7 cho");
						thongTinVe(car);
						System.out.println("Cam on da su dung dich vu!");
						break;
					} else if (choice2.equals("Bus") || choice2.equals("bus")) {
						System.out.println("Gia ve Bus: ");
						car.setLoaiXe("Xe Bus");
						thongTinVe(car);
						System.out.println("Cam on da su dung dich vu!");
						break;
					} else {
						System.out.println("Khong ton tai lua chon, moi chon lai!");
					}
				} break; //thoat vong if gap break ket thuc vong lap ngoai
			} else if (choice.equals("q")) {
				System.out.println("Bye!");
				break;
			} else {
				System.out.println("Khong ton tai lua chon, moi chon lai");
			}
		}
	}
	
	
	public static void thongTinVe(ModelTraffic ticket) {
		if (ticket instanceof ModelCar && ((ModelCar) ticket).getLoaiXe().equals("Xe 7 cho")) {
			ticket.setGiaVe(150000);
			ticket.setSoGhe(7);
			System.out.println("Loai xe: "+((ModelCar) ticket).getLoaiXe());
			System.out.println("Gia ve: "+ticket.getGiaVe());
			System.out.println("So ghe: "+ticket.getSoGhe());
		}  
		if (ticket instanceof ModelCar && ((ModelCar) ticket).getLoaiXe().equals("Xe Bus")) {
			ticket.setGiaVe(70000);
			ticket.setSoGhe(40);
			System.out.println("Loai xe: "+((ModelCar) ticket).getLoaiXe());
			System.out.println("Gia ve: "+ticket.getGiaVe());
			System.out.println("So ghe: "+ticket.getSoGhe());
		}
		if (ticket instanceof ModelTrain) {
			ticket.setGiaVe(200000);
			ticket.setSoGhe(15);
			((ModelTrain) ticket).setSoToa(10);
			System.out.println("Gia ve: "+ticket.getGiaVe());
			System.out.println("So toa: "+((ModelTrain) ticket).getSoToa());
			System.out.println("So ghe: "+ticket.getSoGhe());
		} 
	}
}
