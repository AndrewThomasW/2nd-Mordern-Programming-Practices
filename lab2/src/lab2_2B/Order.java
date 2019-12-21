package lab2_2B;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private int orderNum;
	private OrderLine orderLine;
	private List<OrderLine> orderLines;
	
	public Order(int orderNum) {
		this.orderNum = orderNum;
		orderLine = new OrderLine(this);
		
		orderLines = new ArrayList<OrderLine>();
		addOrderLine(orderLine);
	}

	public int getOrderNum() {
		return orderNum;
	}

	public OrderLine getOrderLine() {
		return orderLine;
	}

	public List<OrderLine> getOrderLines() {
		return orderLines;
	}

	public void addOrderLine(OrderLine orderLine) {
		orderLines.add(orderLine);
	}
	
	

}
