package co.com.blankfactor.certification.test.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import io.cucumber.java.Before;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.guice.Injectors;
import net.thucydides.core.util.EnvironmentVariables;
import org.openqa.selenium.WebDriver;

public class Hooks {

  String urlBase;
  EnvironmentVariables environmentVariable;
  String urlBaseFront;

  @Managed(driver = "chrome")
  public WebDriver driver;

  @Before(order = 0)
  public void configurarUrlFront() {
    final String RUTA_URL_FRONT = "url.baseurl";
    environmentVariable = Injectors.getInjector().getInstance(EnvironmentVariables.class);
    urlBaseFront =
        EnvironmentSpecificConfiguration.from(environmentVariable).getProperty(RUTA_URL_FRONT);
  }

  @Before(order = 1)
  public void configurarActor() {
    OnStage.setTheStage(new OnlineCast());
    theActorCalled("SAM").can(BrowseTheWeb.with(driver));
    theActorInTheSpotlight().wasAbleTo(Open.url(urlBaseFront));
  }
}
