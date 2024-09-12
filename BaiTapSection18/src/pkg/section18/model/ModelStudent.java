package pkg.section18.model;

public class ModelStudent {
	private int id;
	private String ten;
	private int age;
	private ModelUniversity university;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public ModelUniversity getUniversity() {
		return university;
	}
	public void setUniversity(ModelUniversity university) {
		this.university = university;
	}
	
	
}
