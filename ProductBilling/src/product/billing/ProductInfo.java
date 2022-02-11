package product.billing;

public class ProductInfo {

	private String productName; 
	private int quantity; 
	private float pricePerUnit; 
	private float cost;
	
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getPricePerUnit() {
		return pricePerUnit;
	}
	public void setPricePerUnit(float pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}
	public float getCost() {
		return (quantity*pricePerUnit);
	}
	public void setCost(float cost) {
		this.cost = cost;
	} 
	
	
	
	
}
