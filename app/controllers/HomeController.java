package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class HomeController extends Controller {
  
  public static Result index() 
  {
	  return ok(index.render("Home Page"));
  }
  
}