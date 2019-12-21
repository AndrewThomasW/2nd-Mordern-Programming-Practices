package lab2_2B;

public class OrderLine {
	private Order order;
	
	OrderLine(Order ord){
		order = ord;
		
	}

	public Order getOrder() {
		return order;
	}
	
}
