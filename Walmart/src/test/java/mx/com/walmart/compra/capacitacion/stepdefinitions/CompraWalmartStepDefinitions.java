package mx.com.walmart.compra.capacitacion.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import mx.com.walmart.compra.capacitacion.questions.VerificarProducto;
import mx.com.walmart.compra.capacitacion.task.BuscarProducto;
import mx.com.walmart.compra.capacitacion.task.EncontrarProducto;
import mx.com.walmart.compra.capacitacion.task.OpenTheBrowser;
import mx.com.walmart.compra.capacitacion.userinterfaces.InfarmaHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class CompraWalmartStepDefinitions {
	
	
	@Managed(driver = "chrome")
	private WebDriver SuNavegador;
	private Actor Jonathan = Actor.named("jonathan");
	InfarmaHomePage  walmartHome;
	
	
	
	@Before
	public void setU() {
		Jonathan.can(BrowseTheWeb.with(SuNavegador));
		SuNavegador.manage().window().maximize();
		
	}
	
	
	@Given("^Jonathan quiere hacer una compra online$")
	public void jonathanQuiereHacerUnaCompraOnline() throws Exception {
		Jonathan.wasAbleTo(OpenTheBrowser.on());
		
		
	    
	}


	@When("^el quiere comprar en la pagina Walmart de Mexico$")
	public void elQuiereComprarEnLaPaginaWalmartDeMexico() throws Exception {
	   Jonathan.wasAbleTo(BuscarProducto.on());
	   Jonathan.wasAbleTo(EncontrarProducto.on());
	    
	}

	@Then("^para mirar el articulo en carrito de compras$")
	public void paraMirarElArticuloEnCarritoDeCompras() throws Exception {
	   Jonathan.should(seeThat(VerificarProducto.visualized(),Matchers.equalTo("Desodorante Spray Savital Sábila\n" + "(Frasco de 150ml)")));
    }



}
