package Entity;

public class Game implements Entity{
	private int id;
	private String productName;
	private int gameCategoryId;
	private int unitPrice;
	private int unitsInStock;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getGameCategoryId() {
		return gameCategoryId;
	}
	public void setGameCategoryId(int gameCategoryId) {
		this.gameCategoryId = gameCategoryId;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getUnitsInStock() {
		return unitsInStock;
	}
	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}
	
}
