package co.com.bancolombia.certification.Wingo2.runner;



import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/buscar_vuelo.feature",
        glue= "co.com.bancolombia.certification.Wingo.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE


)

public class ComprarVueloRunner {
}
