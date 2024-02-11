package pkg.section11.menu.model;

public enum EnumFoodMenu {
	CAFE(1,". Cafe"), MILK_TEA(2, ". Tra sua");
	
	private int stt;
	private String tenDoUong;

	private EnumFoodMenu(int stt, String tenDoUong) {
		this.stt = stt;
		this.tenDoUong = tenDoUong;
	}
	public int getStt() {
		return stt;
	}
	public String getTenDoUong() {
		return tenDoUong;
	}
	
	
}
