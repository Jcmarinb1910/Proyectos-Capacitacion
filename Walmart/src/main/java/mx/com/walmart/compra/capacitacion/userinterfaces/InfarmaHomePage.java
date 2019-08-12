package mx.com.walmart.compra.capacitacion.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://inkafarma.pe/")

public class InfarmaHomePage extends PageObject {
	
	public static final Target VentanaUno = Target.the("Ventana uno").locatedBy("//button[@id='onesignal-popover-allow-button']");
	public static final Target BuscarProducto = Target.the("Buscar producto en Inicio").located(By.xpath("//input[@placeholder='Busca por marca o producto']"));
	public static final Target BtnBuscar = Target.the("Buscar Producto").locatedBy("//button[@class='btn btn-default btn_see_all desktop']");
}
