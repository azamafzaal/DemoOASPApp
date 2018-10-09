package io.oasp.gastronomy.restaurant.staffmanagement.logic.api.to;

import java.io.Serializable;

public class StaffMemberEto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;

	private String lastName;

	private String firstName;

	private String login;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	@Override
	public String toString() {
		return "StaffMemberEto [id=" + id + ", lastName=" + lastName + ", firstName=" + firstName + ", login=" + login
				+ "]";
	}

}
