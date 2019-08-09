package mx.com.walmart.compra.capacitacion.task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import mx.com.walmart.compra.capacitacion.userinterfaces.InfarmaHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class OpenTheBrowser implements Task {

	@Override
	
	
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(new InfarmaHomePage()));
		
		
	}

	public static OpenTheBrowser on() {
		return instrumented(OpenTheBrowser.class);
		
	}
	

}
