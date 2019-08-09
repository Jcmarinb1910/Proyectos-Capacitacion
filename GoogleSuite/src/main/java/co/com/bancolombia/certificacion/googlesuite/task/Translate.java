package co.com.bancolombia.certificacion.googlesuite.task;

import co.com.bancolombia.certificacion.googlesuite.userinterfaces.GoogleTranslatePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Translate implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(GoogleTranslatePage.SourceLanguageOptions),
				Click.on(GoogleTranslatePage.SourceLanguage),
				Click.on(GoogleTranslatePage.TargetLanguageOptions),
				Click.on(GoogleTranslatePage.TargetLanguage),
				Enter.theValue("Cheese").into(GoogleTranslatePage.SourceLanguageTextArea));
		
		
	}

	public static Translate the() {
		return Tasks.instrumented(Translate.class);
	}
	
	

}
