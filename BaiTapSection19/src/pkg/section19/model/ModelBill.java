package pkg.section19.model;

import java.util.Date;

public class ModelBill {
	private int id;
	private int quantity;
	private int price;
	private ModelProduct product;
	private Date buyDate;
	private ModelUser buyer;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public ModelProduct getProduct() {
		return product;
	}
	public void setProduct(ModelProduct product) {
		this.product = product;
	}
	public Date getBuyDate() {
		return buyDate;
	}
	public void setBuyDate(Date buyDate) {
		this.buyDate = buyDate;
	}
	public ModelUser getBuyer() {
		return buyer;
	}
	public void setBuyer(ModelUser buyer) {
		this.buyer = buyer;
	}
	
	
}
