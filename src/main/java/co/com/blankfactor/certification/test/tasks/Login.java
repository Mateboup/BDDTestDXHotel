package co.com.blankfactor.certification.test.tasks;

import static co.com.blankfactor.certification.test.utils.enums.EnumCredenciales.EVALART_CREDENCIALES2;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.util.EnvironmentVariables;

public class Login implements Task {
  EnvironmentVariables environmentVariable;

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Enter.theValue(EVALART_CREDENCIALES2.getUsuario())
            .into(co.com.blankfactor.certification.test.userinterface.Login.TXT_USUARIO),
        Enter.theValue(EVALART_CREDENCIALES2.getClave())
            .into(co.com.blankfactor.certification.test.userinterface.Login.TXT_CLAVE),
        Click.on(co.com.blankfactor.certification.test.userinterface.Login.BTN_LOGIN));
  }

  public static Login enLaPagina() {
    return instrumented(Login.class);
  }
}
