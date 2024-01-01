package pkg.section10.student.model;

public class ModelStudent {
	private String id;
	private String name;
	private int age;
	private ModelAddress add;
	private ModelSchool sch;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public ModelAddress getAdd() {
		return add;
	}
	public void setAdd(ModelAddress add) {
		this.add = add;
	}
	public ModelSchool getSch() {
		return sch;
	}
	public void setSch(ModelSchool sch) {
		this.sch = sch;
	}
	
	
	
	
	
	
	
	
}
