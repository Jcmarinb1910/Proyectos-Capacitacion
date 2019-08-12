package mx.com.walmart.compra.capacitacion.questions;

import mx.com.walmart.compra.capacitacion.userinterfaces.Producto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerificarProducto implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		
		/*String Word1=Text.of(Producto.NombreProducto).viewedBy(actor).asString();
		StringBuilder sb= new StringBuilder(Word1);
		sb.deleteCharAt(32);
		sb.deleteCharAt(32);
		sb.deleteCharAt(32);*/
		return Text.of(Producto.NombreProducto).viewedBy(actor).asString();		
	}
	

	public static VerificarProducto visualized() {
		return new VerificarProducto();
	}
}

