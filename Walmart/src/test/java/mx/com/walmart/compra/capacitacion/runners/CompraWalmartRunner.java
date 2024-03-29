package mx.com.walmart.compra.capacitacion.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src\\test\\resources\\features\\CompraWalmart.feature",
		glue="mx.com.walmart.compra.capacitacion.stepdefinitions",
		snippets = SnippetType.CAMELCASE)

public class CompraWalmartRunner {
	

}
