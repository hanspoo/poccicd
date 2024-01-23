package controllers;

import java.util.Date;

import play.mvc.Controller;

public class Application extends Controller {

	public static void index() {
		Date date = new Date();
		render(date);
	}

}