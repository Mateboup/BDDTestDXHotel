package co.com.blankfactor.certification.test.tasks;

import static co.com.blankfactor.certification.test.userinterface.BuscarHotel.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class BuscarHotel implements Task {

  Map<String, String> mapBuscarHotel;

  public BuscarHotel(Map<String, String> mapBuscarHotel) {
    this.mapBuscarHotel = mapBuscarHotel;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    LocalDate checkIn;
    LocalDate checkOut;
    LocalDate fechaActual = LocalDate.now();
    checkIn = fechaActual.plusDays(2);
    checkOut = fechaActual.plusDays(7);

    DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd MMM yyyy");
    String checkInForm = checkIn.format(formatoFecha);
    String checkOutForm = checkOut.format(formatoFecha);

    actor.attemptsTo(
        Click.on(LST_DESPLEGAR_CIUDADES),
        Enter.theValue(mapBuscarHotel.get("Location")).into(LBL_LOCATION),
        Enter.theValue(checkInForm.toString()).into(LBL_CHECKIN),
        Enter.theValue(checkOutForm.toString()).into(LBL_CHECKOUT));

    actor.attemptsTo(Enter.theValue(mapBuscarHotel.get("Rooms")).into(LBL_ROOMS));

    actor.attemptsTo(
        Enter.theValue(mapBuscarHotel.get("Adults")).into(LBL_ADULTS),
        Enter.theValue(mapBuscarHotel.get("Children")).into(LBL_CHILDREN),
        Click.on(BTN_BUSCAR));
  }

  private void moverBarra(Actor actor) {}

  public static Performable conLosDatos(Map<String, String> mapBuscarHotel) {
    return instrumented(BuscarHotel.class, mapBuscarHotel);
  }
}
