package models;

import play.db.ebean.*;
import play.data.validation.Constraints.*;

import javax.persistence.*;

@Entity
public class Therapist extends Model
{
	@Id
	@Required
	private String handle;
	
	@Required
	private String firstName, lastName, emailAddress;

	//@Required
	private ContactDetails contactDetails;
	
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

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public ContactDetails getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(ContactDetails contactDetails) {
		this.contactDetails = contactDetails;
	}
	
	public void setHandle(String handle) {
		this.handle = handle;
	}

	public String getHandle() {
		return handle;
	}

	@Override
	public String toString()
	{
		return String.format("%s's profile:\n\rName: %s %s\n\rEmail: %s\n\r", 
			handle, firstName, lastName, emailAddress); 
	}
}
