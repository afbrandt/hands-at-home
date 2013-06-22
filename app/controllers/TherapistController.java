package controllers;

import models.Therapist;
import play.*;
import play.mvc.*;
import play.data.*;
import services.TherapistService;
import models.*;

import views.html.*;


public class TherapistController extends Controller {
	
	static Form<Therapist> therapistForm = Form.form(Therapist.class);

	public static Result register()
	{
		return ok(register.render(therapistForm));
	}
	
	public static Result createTherapist()
	{
		Form<Therapist> submittedForm = therapistForm.bindFromRequest();
		if (submittedForm.hasErrors())
		{
			return badRequest(register.render(submittedForm));
		}
		else
		{
			TherapistService.create(submittedForm.get());
		}
		return redirect(routes.TherapistController.register());
	}
}
