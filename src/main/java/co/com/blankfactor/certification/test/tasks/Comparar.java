package co.com.blankfactor.certification.test.tasks;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

import co.com.blankfactor.certification.test.userinterface.PrecioHotelPage;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Comparar implements Task {

  List<WebElement> nombresHoteles;
  List<WebElement> preciosHoteles;
  List<WebElement> pestañasHoteles;
  Map<String, Double> map = new HashMap<>();

  @Override
  public <T extends Actor> void performAs(T actor) {
    pestañasHoteles = getDriver().findElements(By.xpath("//*[contains(@class,'dxp-num')]"));
    for (int i = 0; i < pestañasHoteles.size(); i++) {
      buscarHotelEconomico(actor);
      actor.attemptsTo(Click.on("//*[@id=\"MainContentPlaceHolder_HotelsDataView_PGB_PBN\"]"));
    }
    calcularPrecioBajo(actor);
    String nombreHotel = actor.recall("nombreHotel");
    actor.attemptsTo(Click.on(PrecioHotelPage.TXT_ELEGIR_HOTEL.of(nombreHotel)));
  }

  private void buscarHotelEconomico(Actor actor) {
    {
      nombresHoteles =
          getDriver().findElements(By.xpath("//a[@class='dxeHyperlink_Metropolis hotel-title']"));
      preciosHoteles = getDriver().findElements(By.xpath("//div[@class='price']"));

      if (nombresHoteles.size() == preciosHoteles.size()) {
        for (int n = 0; n < nombresHoteles.size(); n++) {
          map.put(
              nombresHoteles.get(n).getText(),
              Double.parseDouble(preciosHoteles.get(n).getText().substring(1)));
        }
      }
    }
  }

  private void calcularPrecioBajo(Actor actor) {
    double menor = 99999999;
    String nombre = "";
    for (String nombreHotel : map.keySet()) {
      if (menor > map.get(nombreHotel)) {
        menor = map.get(nombreHotel);
        nombre = nombreHotel;
      }
    }
    actor.remember("nombreHotel", nombre);
    actor.remember("precio", menor);
  }

  public static Comparar precios() {
    return new Comparar();
  }
}
