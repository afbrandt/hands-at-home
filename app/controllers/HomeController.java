package controllers;

import play.*;
import play.mvc.*;
import services.TherapistService;

import views.html.*;

public class HomeController extends Controller {
  
	public static Result index() 
	{
		return ok(index.render("Home Page"));
	}

	public static Result list()
	{
		return ok(list.render(TherapistService.findAll()));
	}
  
	public static Result contact()
	{
		return ok(contact.render());
	}
  
	public static Result login()
	{
		return ok(login.render());
	}
}
