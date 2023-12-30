package pkg.dsnv.model;

public class ModelEmployee extends ModelPerson {
	private int namKN;
	
	public ModelEmployee() {
		// TODO Auto-generated constructor stub
	}
	
	public ModelEmployee(String ten, int namKN) {
		super(ten);
		this.namKN = namKN;
	}


	public int getNamKN() {
		return namKN;
	}

	public void setNamKN(int namKN) {
		this.namKN = namKN;
	}
	
	@Override
	public double getLUONG_CO_BAN() {
		if (this.namKN < 1) {
			return super.getLUONG_CO_BAN()*1.5;
		} else if (this.namKN >=1 && this.namKN <3) {
			return super.getLUONG_CO_BAN()*2;
		} else return super.getLUONG_CO_BAN() *3;
	}

}
