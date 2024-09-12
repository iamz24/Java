package pkg.section15.person.model;

public class ModelPerson {
	private int id;
	private String name;
	private int age;
	
	public ModelPerson() {
		// TODO Auto-generated constructor stub
	}
	
	public ModelPerson(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ModelPerson) {
			if (this.age == ((ModelPerson)obj).getAge()) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
