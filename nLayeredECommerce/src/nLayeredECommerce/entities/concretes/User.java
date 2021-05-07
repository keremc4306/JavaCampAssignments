package nLayeredECommerce.entities.concretes;

import nLayeredECommerce.entities.abstracts.Entity;

public class User implements Entity {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String activateCode;
	private String confirmActivationCode;

	public User() {

	}

	public User(int id, String firstName, String lastName, String email, String password) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setActivateCode(String activateCode) {
		this.activateCode = activateCode;
	}

	public void setConfirmActivationCode(String confirmActivationCode) {
		boolean result = this.activateCode.equals(confirmActivationCode);
		if (!result) {
			System.out.println("Girilen kod do�ru de�il, i�lem ba�ar�s�z");
			return;
		}

		this.confirmActivationCode = confirmActivationCode;
		System.out.println("Active etme i�lemi ba�ar�l�");
	}

	public boolean checkActivationCode() {
		if (!(this.activateCode == null))
			return this.activateCode.equals(this.confirmActivationCode);

		return false;
	}
}