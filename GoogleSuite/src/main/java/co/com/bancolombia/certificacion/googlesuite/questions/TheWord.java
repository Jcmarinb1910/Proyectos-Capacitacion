package co.com.bancolombia.certificacion.googlesuite.questions;

import co.com.bancolombia.certificacion.googlesuite.userinterfaces.GoogleTranslatePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheWord implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		
		
		//String word= Text.of(GoogleTranslatePage.TargetLanguageResult).viewedBy(actor).asString();
		
		return Text.of(GoogleTranslatePage.TargetLanguageResult).viewedBy(actor).asString();
		
	}

	public static TheWord translated() {
		
		return new TheWord();
	}

}
