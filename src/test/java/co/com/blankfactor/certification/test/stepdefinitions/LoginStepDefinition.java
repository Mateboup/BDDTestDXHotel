package co.com.blankfactor.certification.test.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.blankfactor.certification.test.tasks.Login;
import co.com.blankfactor.certification.test.tasks.RealizarCicloDos;
import co.com.blankfactor.certification.test.tasks.RealizarCiclos;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class LoginStepDefinition {

  @Dado("que estoy logueado en la aplicación de evalart")
  public void queEstoyLogueadoEnLaAplicaciónDeEvalart() {
    theActorInTheSpotlight().attemptsTo(Login.enLaPagina());
  }

  @Cuando("realice los ciclos exitosos")
  public void realiceLosCiclosExitosos() {
    theActorInTheSpotlight().attemptsTo(RealizarCiclos.enLaPagina());
  }

  @Entonces("se debe validar el mensaje de exito")
  public void seDebeValidarElMensajeDeExito() {}

  @Cuando("realice los dos ciclos exitosos")
  public void realiceLosDosCiclosExitosos() {
    theActorInTheSpotlight().attemptsTo(RealizarCicloDos.enLaPagina());
  }
}
