package co.com.blankfactor.certification.test.stepdefinitions;

import static co.com.blankfactor.certification.test.exceptions.PrecioNoCorrecto.VALOR_TARIFA_ERRADO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static org.hamcrest.Matchers.equalTo;

import co.com.blankfactor.certification.test.exceptions.PrecioNoCorrecto;
import co.com.blankfactor.certification.test.questions.ValorPrecioTotal;
import co.com.blankfactor.certification.test.tasks.BuscarHotel;
import co.com.blankfactor.certification.test.tasks.Comparar;
import co.com.blankfactor.certification.test.tasks.MoverElemento;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BuscarHotelStepDefinition {
  @Dado("que deseo ver la tarifa mas economica de  los hoteles")
  public void queDeseoVerLaTarifaMasEconomicaDeLosHoteles(Map<String, String> mapBuscarHotel) {
    theActorInTheSpotlight().attemptsTo(BuscarHotel.conLosDatos(mapBuscarHotel));
    WebElement elemento =
        getDriver()
            .findElement(
                By.xpath(
                    "//*[@id=\"MainContentPlaceHolder_FilterFormLayout_NightlyRateTrackBar_MD\"]"));
    theActorInTheSpotlight().attemptsTo(MoverElemento.haciaLaDerecha(elemento, 12));
  }

  @Cuando("realice una busqueda de las tarifas disponibles")
  public void realiceUnaBusquedaDeLasTarifasDisponibles() {
    theActorInTheSpotlight().attemptsTo(Comparar.precios());
  }

  @Entonces("la tarifa mas baja para ese destino es {string}")
  public void laTarifaMasBajaParaEseDestinoEsTarifa(String tarifaHotel) {
    theActorInTheSpotlight()
        .should(
            seeThat(ValorPrecioTotal.delHotel(), equalTo(tarifaHotel))
                .orComplainWith(PrecioNoCorrecto.class, VALOR_TARIFA_ERRADO));
  }
}
