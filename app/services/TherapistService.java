package services;

import java.util.List;

import javax.persistence.*;

import play.db.ebean.Model.Finder;

import models.Therapist;

public class TherapistService 
{
	private Therapist therapist;
	
	public static Finder<String, Therapist> find = new Finder(Long.class, Therapist.class);
	
	public static void create(Therapist therapist)
	{
		therapist.save();
	}
	
	public static List<Therapist> findAll()
	{
		return find.all();
	}

	public static Therapist findByHandle(String handle)
	{
		return find.byId(handle);
	}
}
