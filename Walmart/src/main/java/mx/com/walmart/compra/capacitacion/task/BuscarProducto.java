package mx.com.walmart.compra.capacitacion.task;

import mx.com.walmart.compra.capacitacion.userinterfaces.AgregarProducto;
import mx.com.walmart.compra.capacitacion.userinterfaces.InfarmaHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class BuscarProducto implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
		actor.attemptsTo(Click.on(InfarmaHomePage.VentanaUno),
				Click.on(InfarmaHomePage.BuscarProducto),
				Enter.theValue("Desodorante Spry Savital Sábila (Frasco de 150ml)").into(InfarmaHomePage.BuscarProducto),
				Click.on(InfarmaHomePage.BtnBuscar),
				Click.on(AgregarProducto.AgregarProducto));	
	}

	public static BuscarProducto on() {
		return Tasks.instrumented(BuscarProducto.class);
	}

}
