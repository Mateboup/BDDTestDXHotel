package co.com.blankfactor.certification.test.tasks;

import static co.com.blankfactor.certification.test.userinterface.BuscarHotel.*;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MoverElemento implements Task {

  private WebElement elemento;
  private int offsetX;

  public MoverElemento(WebElement elemento, int offsetX) {
    this.elemento = elemento;
    this.offsetX = offsetX;
  }

  public static MoverElemento haciaLaDerecha(WebElement elemento, int offsetX) {
    return new MoverElemento(elemento, offsetX);
  }

  public static MoverElemento haciaLaIzquierda(WebElement elemento, int offsetX) {
    return new MoverElemento(elemento, -offsetX);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    WebDriver driver = BrowseTheWeb.as(actor).getDriver();
    Actions actions = new Actions(driver);
    actions.clickAndHold(elemento).moveByOffset(offsetX, 0).release().build().perform();
    actor.attemptsTo(Click.on(IMG_ESTRELLA_1), Click.on(IMG_ESTRELLA_2), Click.on(BTN_APLICAR));
  }
}
