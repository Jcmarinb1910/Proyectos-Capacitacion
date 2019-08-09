package co.com.google.capacitacion.userinterfaces;


import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl ("https://www.google.com/")

public class GoolgeHome extends PageObject {
	
	public static final Target txtBuscar = Target.the("Buscador").located(By.name("q"));
	public static final Target BtnBuscar = Target.the("Boton Buscar").located(By.name("btnK"));
	public static final Target UrlWiki = Target.the("Url resultado Wikipedia").locatedBy("//div [@class='r']/a[@href='https://es.wikipedia.org/wiki/Quesito']");
	

}
