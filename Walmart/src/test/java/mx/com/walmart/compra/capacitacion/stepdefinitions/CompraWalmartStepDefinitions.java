package mx.com.walmart.compra.capacitacion.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import mx.com.walmart.compra.capacitacion.models.DetalleArticu;
import mx.com.walmart.compra.capacitacion.questions.VerificarProducto;
import mx.com.walmart.compra.capacitacion.task.BuscarProducto;
import mx.com.walmart.compra.capacitacion.task.OpenTheBrowser;
import mx.com.walmart.compra.capacitacion.userinterfaces.InfarmaHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class CompraWalmartStepDefinitions {
	
	
	@Managed(driver = "chrome")
	private WebDriver SuNavegador;
	private Actor Jonathan = Actor.named("jonathan");
	InfarmaHomePage  inkafarmaHome;
	
	
	
	@Before
	public void setU() {
		Jonathan.can(BrowseTheWeb.with(SuNavegador));		
	}
	
	
	@Given("^que Jonathan esta en la Pagina Inkafarma de Peru$")
	public void jonathanQuiereHacerUnaCompraOnline() throws Exception {
		Jonathan.wasAbleTo(OpenTheBrowser.on(inkafarmaHome));	    
	}


	@When("^el quiere buscar el \"([^\"]*)\" y comprarlo en la pagina$")
	public void elQuiereBuscarElYComprarloEnLaPagina(DetalleArticu Articulo) throws Exception {
		Jonathan.wasAbleTo(BuscarProducto.the(Articulo));	
	}

	@Then("^deberia de ver el \"([^\"]*)\" en carrito de compras$")
	public void deberiaDeVerElEnCarritoDeCompras(DetalleArticu Articulo) throws Exception {
		Jonathan.should(seeThat(VerificarProducto.visualized(),Matchers.equalTo(Articulo.getArticulo())));
    }

}
