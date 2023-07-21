package co.com.blankfactor.certification.test.questions;

import static co.com.blankfactor.certification.test.userinterface.PrecioHotelPage.PRECIO_TOTAL;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValorPrecioTotal implements Question<String> {

  @Override
  public String answeredBy(Actor actor) {
    return Text.of(PRECIO_TOTAL).viewedBy(actor).asString();
  }

  public static ValorPrecioTotal delHotel() {
    return new ValorPrecioTotal();
  }
}
