package co.com.google.capacitacion.stepdefinitions;
import org.openqa.selenium.WebDriver;

import co.com.google.capacitacion.questions.ResultWikipedia;
import co.com.google.capacitacion.tasks.AbrirLaPagina;
import co.com.google.capacitacion.tasks.BotonBuscar;
import co.com.google.capacitacion.userinterfaces.GoolgeHome;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class BuscarGoogleStepdefinitions {
	
	@Managed(driver="chrome")
	WebDriver suDriver;
	Actor Jonathan=Actor.named("Jonathan");
	
	GoolgeHome googleHome;
	
	@Before
	public void setUp() {
		Jonathan.can(BrowseTheWeb.with(suDriver));
	}
	
	
	@Given("^Que Jonathan esta en la pagina de google$")
	public void queJonathanEstaEnLaPaginaDeGoogle() throws Exception {
	   Jonathan.wasAbleTo(AbrirLaPagina.en(googleHome));
	   	   
	}

	@When("^busca la palabra \"([^\"]*)\"$")
	public void buscaLaPalabra(String arg1) throws Exception {
	   Jonathan.wasAbleTo(BotonBuscar.en(googleHome));
	    
	   
	}
		

	@Then("^deberia ver el resultado de wikipedia$")
	public void deberiaVerElResultadoDeWikipedia() throws Exception {
		Jonathan.asksFor(ResultWikipedia.Visualized());
		
		
				} 
 
	}


