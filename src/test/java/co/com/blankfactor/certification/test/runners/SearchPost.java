package co.com.blankfactor.certification.test.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/features/buscar_hotel.feature",
    snippets = CucumberOptions.SnippetType.CAMELCASE,
    glue = {
      "co.com.blankfactor.certification.test.stepdefinitions",
    })
public class SearchPost {}
