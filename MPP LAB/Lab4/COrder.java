import java.time.LocalDate;

public class COrder {
	private int ordernum;
	private LocalDate orderDate;
	private double orderAmount;
	public COrder(int ordernum, LocalDate orderDate, double orderAmount) {
		super();
		this.ordernum = ordernum;
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
	}
	public int getOrdernum() {
		return ordernum;
	}
	public void setOrdernum(int ordernum) {
		this.ordernum = ordernum;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public double getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}
	
	

}
