package pkg.section19.model;

public class ModelProduct {
	private int id;
	private String name;
	private int quantity;
	private int price;
	private ModelCategory category;
	
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public ModelCategory getCategory() {
		return category;
	}
	public void setCategory(ModelCategory category) {
		this.category = category;
	}
	
	
}
