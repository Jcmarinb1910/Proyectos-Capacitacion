package mx.com.walmart.compra.capacitacion.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AgregarProducto extends PageObject {

	public static final Target VentanaEmergente = Target.the("Ventana Emergente").locatedBy("//button[@class='_2sjlb8azozjgY8icZT7vDz _2SMc8AbEP4KN-i6oCZvazG KzaDI_P3zxg8aXLT5x0H6']");
	public static final Target AgregarProducto = Target.the("Agregar Producto").locatedBy("//ng-container/span[contains(text(),'agregar')]");
	

	
}
