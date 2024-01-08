package pkg.section13.ticket.main;

public class MainTicket implements Runnable {
	
	private int ticket;
	
	public MainTicket() {
		// TODO Auto-generated constructor stub
		this.ticket = 1;
	}
	
	
	
	public void banVe() {
		if (ticket > 0) {
			ticket = ticket - 1;
			System.out.println("Chuc mung "+ Thread.currentThread().getName()+ " da mua duoc ve!");
		}
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		banVe();
	}
	
	public static void main(String[] args) {
		MainTicket ticket = new MainTicket();
		Thread t1 = new Thread(ticket);
		Thread t2 = new Thread(ticket);
		t1.setName("Nguyen Viet Dung");
		t2.setName("Nguyen Thao Nhien");
		
		t1.start();
		t2.start();
		
	}
}
