package pkg.dsnv.model;

public class ModelPerson {
	private String ten;
	private ModelAddress diaChi;
	private final double LUONG_CO_BAN = 2000d;
	
	public ModelPerson() {}
	
	public ModelPerson(String ten) {
		super();
		this.ten = ten;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public ModelAddress getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(ModelAddress diaChi) {
		this.diaChi = diaChi;
	}

	public double getLUONG_CO_BAN() {
		return LUONG_CO_BAN;
	}
	
	
	
}
