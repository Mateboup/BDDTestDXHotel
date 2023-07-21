package co.com.blankfactor.certification.test.tasks;

import static co.com.blankfactor.certification.test.utils.enums.EnumCoordenadas.*;
import static co.com.blankfactor.certification.test.utils.enums.EnumSumaFila.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.blankfactor.certification.test.userinterface.Login;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

public class RealizarCiclos implements Task {
  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Click.on(
            co.com.blankfactor.certification.test.userinterface.Login.BTN_COORDENADA.of(
                C1.getCoordenada())),
        Enter.theValue(R1.getResultado())
            .into(co.com.blankfactor.certification.test.userinterface.Login.TXT_RESULTADO),
        Click.on(co.com.blankfactor.certification.test.userinterface.Login.BTN_ENVIAR));

    actor.attemptsTo(
        Scroll.to(
            co.com.blankfactor.certification.test.userinterface.Login.BTN_COORDENADA.of(
                C2.getCoordenada())),
        Click.on(
            co.com.blankfactor.certification.test.userinterface.Login.BTN_COORDENADA.of(
                C2.getCoordenada())),
        Enter.theValue(R2.getResultado())
            .into(co.com.blankfactor.certification.test.userinterface.Login.TXT_RESULTADO),
        Click.on(co.com.blankfactor.certification.test.userinterface.Login.BTN_ENVIAR));

    actor.attemptsTo(
        Scroll.to(
            co.com.blankfactor.certification.test.userinterface.Login.BTN_COORDENADA.of(
                C3.getCoordenada())),
        Click.on(
            co.com.blankfactor.certification.test.userinterface.Login.BTN_COORDENADA.of(
                C3.getCoordenada())),
        Enter.theValue(R3.getResultado())
            .into(co.com.blankfactor.certification.test.userinterface.Login.TXT_RESULTADO),
        Click.on(co.com.blankfactor.certification.test.userinterface.Login.BTN_ENVIAR));

    actor.attemptsTo(
        Scroll.to(
            co.com.blankfactor.certification.test.userinterface.Login.BTN_COORDENADA.of(
                C4.getCoordenada())),
        Click.on(
            co.com.blankfactor.certification.test.userinterface.Login.BTN_COORDENADA.of(
                C4.getCoordenada())),
        Enter.theValue(R4.getResultado())
            .into(co.com.blankfactor.certification.test.userinterface.Login.TXT_RESULTADO),
        Click.on(co.com.blankfactor.certification.test.userinterface.Login.BTN_ENVIAR));

    actor.attemptsTo(
        Scroll.to(
            co.com.blankfactor.certification.test.userinterface.Login.BTN_COORDENADA.of(
                C5.getCoordenada())),
        Click.on(
            co.com.blankfactor.certification.test.userinterface.Login.BTN_COORDENADA.of(
                C5.getCoordenada())),
        Enter.theValue(R5.getResultado())
            .into(co.com.blankfactor.certification.test.userinterface.Login.TXT_RESULTADO),
        Click.on(co.com.blankfactor.certification.test.userinterface.Login.BTN_ENVIAR));

    actor.attemptsTo(
        Scroll.to(
            co.com.blankfactor.certification.test.userinterface.Login.BTN_COORDENADA.of(
                C6.getCoordenada())),
        Click.on(
            co.com.blankfactor.certification.test.userinterface.Login.BTN_COORDENADA.of(
                C6.getCoordenada())),
        Enter.theValue(R6.getResultado())
            .into(co.com.blankfactor.certification.test.userinterface.Login.TXT_RESULTADO),
        Click.on(co.com.blankfactor.certification.test.userinterface.Login.BTN_ENVIAR));

    actor.attemptsTo(
        Scroll.to(
            co.com.blankfactor.certification.test.userinterface.Login.BTN_COORDENADA.of(
                C7.getCoordenada())),
        Click.on(
            co.com.blankfactor.certification.test.userinterface.Login.BTN_COORDENADA.of(
                C7.getCoordenada())),
        Enter.theValue(R7.getResultado())
            .into(co.com.blankfactor.certification.test.userinterface.Login.TXT_RESULTADO),
        Click.on(co.com.blankfactor.certification.test.userinterface.Login.BTN_ENVIAR));

    actor.attemptsTo(
        Scroll.to(
            co.com.blankfactor.certification.test.userinterface.Login.BTN_COORDENADA.of(
                C8.getCoordenada())),
        Click.on(
            co.com.blankfactor.certification.test.userinterface.Login.BTN_COORDENADA.of(
                C8.getCoordenada())),
        Enter.theValue(R8.getResultado())
            .into(co.com.blankfactor.certification.test.userinterface.Login.TXT_RESULTADO),
        Click.on(co.com.blankfactor.certification.test.userinterface.Login.BTN_ENVIAR));

    actor.attemptsTo(
        Scroll.to(
            co.com.blankfactor.certification.test.userinterface.Login.BTN_COORDENADA.of(
                C9.getCoordenada())),
        Click.on(
            co.com.blankfactor.certification.test.userinterface.Login.BTN_COORDENADA.of(
                C9.getCoordenada())),
        Enter.theValue(R9.getResultado())
            .into(co.com.blankfactor.certification.test.userinterface.Login.TXT_RESULTADO),
        Click.on(co.com.blankfactor.certification.test.userinterface.Login.BTN_ENVIAR));

    actor.attemptsTo(
        Scroll.to(
            co.com.blankfactor.certification.test.userinterface.Login.BTN_COORDENADA.of(
                C10.getCoordenada())),
        Click.on(
            co.com.blankfactor.certification.test.userinterface.Login.BTN_COORDENADA.of(
                C10.getCoordenada())),
        Enter.theValue(R10.getResultado())
            .into(co.com.blankfactor.certification.test.userinterface.Login.TXT_RESULTADO),
        Click.on(Login.BTN_ENVIAR));
  }

  public static RealizarCiclos enLaPagina() {
    return instrumented(RealizarCiclos.class);
  }
}
