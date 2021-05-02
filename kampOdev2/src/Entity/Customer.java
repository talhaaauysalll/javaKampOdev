package Entity;

public class Customer extends User implements Entity{
	private int id;
	private int userId;
	private String[] gameInventory;
	
	public String[] getGameInventory() {
		return gameInventory;
	}
	public void setGameInventory(String[] gameInventory) {
		this.gameInventory = gameInventory;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
}
