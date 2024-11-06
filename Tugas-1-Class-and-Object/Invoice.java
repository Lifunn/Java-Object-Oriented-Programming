package id.its.pbo;

public class Invoice {
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double price;
	
	public Invoice(String partNumber, String partDescription, int quantity, double price) {
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		
		
		if (quantity < 0) {
			this.quantity = 0;	
		}else {
			this.quantity = quantity;
		}
		
		if (price < 0) {
			this.price = 0;
		}else {
			this.price = price;
		}
	}
	
	public String getPartNumber() {
		return this.partNumber;
	}
	
	public String getpartDescription() {
		return this.partDescription;
	}
	
	public int getquantity() {
		return this.quantity;
	}
	
	public double getprice() {
		return this.price;
	}
	
	//Setter
	public void setQuantity(int quantity) {
		this.quantity = quantity;
		
		if (quantity < 0) {
			this.quantity = 0;
		}else {
			this.quantity = quantity;
		}
		
	}
	public void setPrice(double price){
		this.price = price;
		
		if (price < 0) {
			this.price = 0;
		}else {
			this.price = price;
		}
	}
	
	public void setPartNumber(String partNumber){
		this.partNumber = partNumber;
	}
	
	public void setPartDescription(String partDescription){
		this.partDescription = partDescription;
	}
}
