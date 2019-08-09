package co.com.bancolombia.certificacion.googlesuite.stepdefinitions;

import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import co.com.bancolombia.certificacion.googlesuite.questions.TheWord;
import co.com.bancolombia.certificacion.googlesuite.task.GoTo;
import co.com.bancolombia.certificacion.googlesuite.task.OpenTheBrowser;
import co.com.bancolombia.certificacion.googlesuite.task.Translate;
import co.com.bancolombia.certificacion.googlesuite.userinterfaces.GoogleAppsComponent;
import co.com.bancolombia.certificacion.googlesuite.userinterfaces.GoogleHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class GoogleTranslateStepDefinitions {
	
	
	
	@Managed(driver="chrome")
	private WebDriver SuBuscador;
	private Actor Jonathan= Actor.named("jonathan");
	
	private GoogleHomePage googleHomePage;
	
	@Before
	public void setUp() {
		Jonathan.can(BrowseTheWeb.with(SuBuscador));
	}
	
	@Given("^Jonathan quiere hacer una traduccion$")
	public void jonathanQuiereHacerUnaTraduccion() throws Exception {
	    //Precondiciones Estar en google Translate
		Jonathan.wasAbleTo(OpenTheBrowser.on(googleHomePage));
		Jonathan.wasAbleTo(GoTo.theApp(GoogleAppsComponent.GoogleTranslate));
		
	}

	@When("^el quiere traducir la palabra cheese de ingles a espanol$")
	public void elQuiereTraducirLaPalabraCheeseDeInglesAEspanol() throws Exception {
	    //Condiciones Traducir una palabra de ingles a español
		Jonathan.wasAbleTo(Translate.the());
	}

	@Then("^ver la traduccion en pantalla$")
	public void verLaTraduccionEnPantalla() throws Exception {
	    Jonathan.should(seeThat(TheWord.translated(),Matchers.equalTo("Queso")));
	}

}
