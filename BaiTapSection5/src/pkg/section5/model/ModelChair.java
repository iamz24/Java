package pkg.section5.model;

public class ModelChair {
	String nhaSx;
	String loaiGhe;
	int namSx;
	
	public ModelChair() {
		
	}
	
	public ModelChair(String nhaSx, String loaiGhe, int namSX) {
		this.nhaSx = nhaSx;
		this.loaiGhe = loaiGhe;
		this.namSx = namSX;
	}

	public String getNhaSx() {
		return nhaSx;
	}

	public void setNhaSx(String nhaSx) {
		this.nhaSx = nhaSx;
	}

	public String getLoaiGhe() {
		return loaiGhe;
	}

	public void setLoaiGhe(String loaiGhe) {
		this.loaiGhe = loaiGhe;
	}

	public int getNamSx() {
		return namSx;
	}

	public void setNamSx(int namSx) {
		this.namSx = namSx;
	}
	
	
	
}
