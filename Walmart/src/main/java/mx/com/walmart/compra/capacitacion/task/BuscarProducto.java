package mx.com.walmart.compra.capacitacion.task;

import mx.com.walmart.compra.capacitacion.models.DetalleArticu;
import mx.com.walmart.compra.capacitacion.userinterfaces.AgregarProducto;
import mx.com.walmart.compra.capacitacion.userinterfaces.InfarmaHomePage;
import mx.com.walmart.compra.capacitacion.userinterfaces.Producto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class BuscarProducto implements Task {
	
	private DetalleArticu Detalle;
	
	public BuscarProducto(DetalleArticu Producto) {
		this.Detalle = Producto;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(InfarmaHomePage.VentanaUno),
				Click.on(InfarmaHomePage.BuscarProducto),
				(Enter.theValue(Detalle.getArticulo()).into(InfarmaHomePage.BuscarProducto)),
				Click.on(InfarmaHomePage.BtnBuscar),
				Click.on(AgregarProducto.AgregarProducto),
				Click.on(Producto.ProductoEnCarrito));	
	}

	public static Performable the(DetalleArticu Producto) {
		return Tasks.instrumented(BuscarProducto.class, Producto);
	}



}
