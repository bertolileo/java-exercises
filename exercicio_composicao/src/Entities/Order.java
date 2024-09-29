package Entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment = new Date();
	private OrderStatus status;
	
	private Client client;
	private List<OrderItem> orderItems = new ArrayList<>();
	
	public Order() {
	}

	public Order(OrderStatus status, Client client) {
		this.status = status;
		this.client = client;
	}
	
	public void addItem(OrderItem orderItem) {
		orderItems.add(orderItem);
	}
	
	public void	removeItem(OrderItem orderItem) {
		orderItems.remove(orderItem);
	}
	
	public Double total() {
		Double sum = 0.0;
		for (OrderItem c : orderItems) {
			sum += c.subTotal();
		}
		return sum;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY:\n");
		sb.append("Order moment: " + sdf.format(moment) + "\n");
		sb.append("Order Status: " + status + "\n");
		sb.append("Client: " + client + "\n");
		
		for (OrderItem c : orderItems) {
			sb.append(c.toString() + "\n");
		}
		
		sb.append("Total price: " + String.format("%.2f", total()));
		
		return sb.toString();
	}
	
	
}
