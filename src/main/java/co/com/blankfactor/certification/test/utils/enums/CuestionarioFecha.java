package co.com.blankfactor.certification.test.utils.enums;

import static co.com.blankfactor.certification.test.userinterface.Ciclo2.TXT_FECHA;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.questions.Text;

public class CuestionarioFecha {

  private CuestionarioFecha() {}

  public static String cuestionarioFecha(Actor actor) {
    String cadenaTextoFecha;
    String dias;
    String fechaInicial;

    cadenaTextoFecha = Text.of(TXT_FECHA).viewedBy(actor).asString();
    dias = cadenaTextoFecha.substring(35, 37);
    fechaInicial = cadenaTextoFecha.substring(63, 73);
    System.out.println(fechaInicial);

    LocalDate fechaActual = LocalDate.now();

    if (cadenaTextoFecha.contains("antes")) {
      fechaActual = fechaActual.plusYears(0).minusDays(Integer.parseInt(dias));

    } else {
      fechaActual = fechaActual.plusYears(0).plusDays(Integer.parseInt(dias));
    }
    DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    String fechaFormateada = fechaActual.format(formatoFecha);
    return fechaFormateada;
  }
}
