package co.com.bancolombia.certificacion.googlesuite.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class GoogleAppsComponent {

	public static  final Target GoogleApps = Target.the("Google apps button").located(By.id("gbwa"));
	public static  final Target GoogleTranslate = Target.the("Google translate option").located(By.id("gb51"));
	
}

