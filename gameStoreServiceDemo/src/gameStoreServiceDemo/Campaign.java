package gameStoreServiceDemo;


public class Campaign implements Entity {
	private int id;
	private String name;
	private byte discount;
	boolean status;
	
	public Campaign(int id, String name, byte discount, boolean status) {
		this.id = id;
		this.name = name;
		this.discount = discount;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte getDiscount() {
		return discount;
	}

	public void setDiscount(byte discount) {
		this.discount = discount;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}	
}