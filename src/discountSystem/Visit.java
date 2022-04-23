package discountSystem;

import java.util.Date;

public class Visit {
	
	private Customer customer;
	private Date date;
	private double serviceExpense;
	private double productExpense;
	
	//I added a default constructor
	public Visit() {
		
	}
	
	public Visit(String name, Date date) {
		this.customer = new Customer(name);
		this.date = date;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getServiceExpense() {
		return serviceExpense;
	}

	public void setServiceExpense(double serviceExpense) {
		this.serviceExpense = serviceExpense;
	}

	public double getProductExpense() {
		return productExpense;
	}

	public void setProductExpense(double productExpense) {
		this.productExpense = productExpense;
	}
	
	public double getTotalExpense() {
		return this.productExpense + this.serviceExpense;
	}
	
	public String toString() {
		return  "Customer Name: " + this.customer.getName() + "\n" +
				"Service Expenses: " + this.serviceExpense + "\n" +
				"Product Expenses: " + this.productExpense + "\n"+
				"Total Expenses: " + this.getTotalExpense() + "\n" +
				"Date: " + this.getDate();
	}
	
	

}
