package models;

import play.db.ebean.*;
import play.data.validation.Constraints.*;

import javax.persistence.*;

@Entity
public class Therapist extends Model
{
	@Id
	private Long id;
	
	@Required
	private String firstName, lastName, emailAddress;

	private ContactDetails contactDetails;
	
	//public static Finder<Long, Therapist> find = new Finder(Long.class, Therapist.class);
	
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
	
}
