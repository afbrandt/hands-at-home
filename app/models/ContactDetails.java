package models;

import javax.persistence.*;
import play.data.validation.Constraints.*;

import play.db.ebean.*;

@Entity
public class ContactDetails extends Model
{
	
	//@Required
	private String telephoneNumber;

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	
}
