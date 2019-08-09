package co.com.google.capacitacion.tasks;

import co.com.google.capacitacion.userinterfaces.GoolgeHome;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

public class BotonBuscar implements Task {
	PageObject page;
	
	public BotonBuscar(PageObject page) {
		this.page=page;
	}
	
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(page),
				Click.on(GoolgeHome.txtBuscar),
				Enter.theValue("Quesito").into(GoolgeHome.txtBuscar),
				Click.on(GoolgeHome.BtnBuscar));
		
	}


	public static Performable en(PageObject page) {
		return Tasks.instrumented(BotonBuscar.class, page);
	}
	

}


