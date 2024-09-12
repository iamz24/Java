package pkg.section12.zeroexception.model;

public class ModelZeroException extends Exception {
	private String notification;
	
	public ModelZeroException(String notification) {
		super();
		this.notification = notification;
	}

	public String getNotification() {
		return notification;
	}

	public void setNotification(String notification) {
		this.notification = notification;
	}
	
	
}
