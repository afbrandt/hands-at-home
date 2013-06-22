package services;

import javax.persistence.*;

import models.Therapist;

public class TherapistService 
{
	private Therapist therapist;
	
	public static void create(Therapist therapist)
	{
		therapist.save();
	}
}
