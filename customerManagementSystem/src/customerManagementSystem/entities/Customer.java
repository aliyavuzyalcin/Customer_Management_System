package customerManagementSystem.entities;

import java.util.Date;

import customerManagementSystem.abstracts.IEntity;

public class Customer implements IEntity {
	
	private int ID;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private String nationalityId;
	
	public Customer(int iD, String firstName, String lastName, Date dateOfBirth, String nationalityId) {
		super();
		this.ID = iD;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		this.ID = iD;
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

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	

}
