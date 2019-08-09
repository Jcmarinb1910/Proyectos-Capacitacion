package mx.com.walmart.compra.capacitacion.task;

import mx.com.walmart.compra.capacitacion.userinterfaces.Producto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class EncontrarProducto implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(Producto.ProductoEnCarrito));
	
		
	}

	public static EncontrarProducto on() {		
		return Tasks.instrumented(EncontrarProducto.class);
	}

}
