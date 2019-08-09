package co.com.google.capacitacion.questions;

import co.com.google.capacitacion.userinterfaces.GoolgeHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ResultWikipedia implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		
		String Resultado = Text.of(GoolgeHome.UrlWiki).viewedBy(actor).asString();
		
		return Resultado;		
	}


	public static ResultWikipedia Visualized() {
		
		return new ResultWikipedia();
	}


}


