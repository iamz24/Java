package pkg.dsnv.model;

public class ModelEmployee extends ModelPerson {
	private double luong;

	public ModelEmployee() {
		super();
	}

	public ModelEmployee(String ten) {
		super(ten);
	}

	public ModelEmployee(String ten, double luong) {
		super(ten);
		this.luong = luong;
	}

	public double getLuong() {
		return luong;
	}

	public void setLuong(double luong) {
		this.luong = luong;
	}

}
