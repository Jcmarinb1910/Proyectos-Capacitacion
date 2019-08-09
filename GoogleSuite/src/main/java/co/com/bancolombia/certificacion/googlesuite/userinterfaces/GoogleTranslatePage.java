package co.com.bancolombia.certificacion.googlesuite.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class GoogleTranslatePage {
	
	public static final Target SourceLanguageOptions= Target.the("Source language Button").locatedBy("//div[@class='sl-more tlid-open-source-language-list']");	
	public static final Target TargetLanguageOptions = Target.the("Target language Button").locatedBy("//div[@class='tl-more tlid-open-target-language-list']");
	public static final Target SourceLanguage = Target.the("Source language options").locatedBy("//div [@class ='language_list_languages language_list_sl_list tw-ll-top']/div [@class ='language-list-unfiltered-langs-sl_list']/div [@class ='language_list_section']//div[@class ='language_list_item_wrapper language_list_item_wrapper-en']");
	public static final Target TargetLanguage = Target.the("Target language options").locatedBy("//div[@class='language-list-unfiltered-langs-tl_list']//div[30]//div[2]");
	public static final Target SourceLanguageTextArea = Target.the("Source Language text Area").located(By.id("source"));
	public static final Target TargetLanguageResult = Target.the("Target Language Result").locatedBy("//div[@class='text-wrap tlid-copy-target']");
	
}






