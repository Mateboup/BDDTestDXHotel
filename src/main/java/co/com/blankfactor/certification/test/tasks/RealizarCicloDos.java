package co.com.blankfactor.certification.test.tasks;

import static co.com.blankfactor.certification.test.userinterface.Ciclo2.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Text;

public class RealizarCicloDos implements Task {
  @Override
  public <T extends Actor> void performAs(T actor) {
    String texto;
    String repetir;
    String letra;
    String numCiclo;
    int contadorCiclo = 1;

    texto = Text.of(TXT_CICLOS).viewedBy(actor).asString();

    while (contadorCiclo < 11) {
      String cadenaTexto1 = Text.of(TXT_LETRA).viewedBy(actor).asString();
      repetir = cadenaTexto1.substring(8, 11);
      letra = cadenaTexto1.substring(28, 29);
      int contador = 0;
      String cadenaFinal = "";
      while (contador < Integer.parseInt(repetir)) {
        cadenaFinal += letra;
        System.out.println(cadenaFinal);
        contador++;
      }
      actor.attemptsTo(Enter.theValue(cadenaFinal).into(LBL_TEXTO_LETRA));
      // ------------------------------------EJERCICIO 2---------------------------------------//

      String cadenaTextoFecha;
      String dias;
      String fechaInicial;

      cadenaTextoFecha = Text.of(TXT_FECHA).viewedBy(actor).asString();
      dias = cadenaTextoFecha.substring(35, 37);
      fechaInicial = cadenaTextoFecha.substring(63, 73);

      LocalDate fechaActual = LocalDate.now();

      if (cadenaTextoFecha.contains("antes")) {
        fechaActual = fechaActual.plusYears(0).minusDays(Integer.parseInt(dias));

      } else {
        fechaActual = fechaActual.plusYears(0).plusDays(Integer.parseInt(dias));
      }
      DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
      String fechaFormateada = fechaActual.format(formatoFecha);
      actor.attemptsTo(Enter.theValue(fechaFormateada).into(CL_FECHA), Click.on(BTN_ENVIAR2));
      texto = Text.of(TXT_CICLOS).viewedBy(actor).asString();
      numCiclo = texto.substring(25, 27);
      contadorCiclo++;
    }
  }

  public static RealizarCicloDos enLaPagina() {
    return instrumented(RealizarCicloDos.class);
  }
}
