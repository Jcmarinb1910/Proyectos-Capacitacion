package mx.com.walmart.compra.capacitacion.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class Producto extends PageObject {
	
	public static final Target ProductoEnCarrito = Target.the("Producto en Carrito").locatedBy("//img[@class='shopping-cart-effect']");
    public static final Target NombreProducto = Target.the("Nombre del Producto en Carrito").locatedBy("//h5[@class='cart-item-name font-semi-bold font-18 ng-binding']");
}
