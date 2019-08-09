package co.com.google.capacitacion.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirLaPagina implements Task {

	PageObject page;
	
	public AbrirLaPagina(PageObject page) {
		this.page=page;
	}
	@Override
	public <T extends Actor> void performAs(T Actor) {
		Actor.attemptsTo(Open.browserOn(page));
	}
		

	public static Performable en(PageObject page) {
			return Tasks.instrumented(AbrirLaPagina.class, page);
		
		
	}

	
}
