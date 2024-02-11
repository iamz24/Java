//In bảng giá vé niêm yết

package pkg.section9.traffic.main;

import pkg.section9.traffic.model.ModelCar;
import pkg.section9.traffic.model.ModelTraffic;
import pkg.section9.traffic.model.ModelTrain;

public class MainTraffic  {
	public static void main(String[] args) {
		ModelCar car = new ModelCar();
		ModelTrain train = new ModelTrain();
		System.out.println("Bang gia ve tau xe:");
		System.out.println("==============================");
		System.out.println("Gia ve o to:");
		thongTinVe(car);
		System.out.println("==============================");
		System.out.println("Gia ve tau hoa: ");
		thongTinVe(train);
	}
	
	public static void thongTinVe(ModelTraffic ticket) {
		if (ticket instanceof ModelCar) {
			ticket.setGiaVe(150000);
			ticket.setSoGhe(7);
			((ModelCar) ticket).setLoaiXe("Xe 7 cho");
			System.out.println("Loai xe: "+((ModelCar) ticket).getLoaiXe());
			System.out.println("Gia ve: "+ticket.getGiaVe());
			System.out.println("So ghe: "+ticket.getSoGhe());
		}  
		if (ticket instanceof ModelCar) {
			ticket.setGiaVe(70000);
			ticket.setSoGhe(40);
			((ModelCar) ticket).setLoaiXe("Xe bus");
			System.out.println("----------------------------------------");
			System.out.println("Loai xe: "+((ModelCar) ticket).getLoaiXe());
			System.out.println("Gia ve: "+ticket.getGiaVe());
			System.out.println("So ghe: "+ticket.getSoGhe());
		}
		if (ticket instanceof ModelTrain) {
			ticket.setGiaVe(200000);
			ticket.setSoGhe(15);
			((ModelTrain) ticket).setSoToa(10);
			System.out.println("So toa: "+((ModelTrain) ticket).getSoToa());
			System.out.println("Gia ve: "+ticket.getGiaVe());
			System.out.println("So ghe: "+ticket.getSoGhe());
		} 
	}
}
