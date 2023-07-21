package co.com.blankfactor.certification.test.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class Login {

  public static final Target TXT_USUARIO =
      Target.the("Ingresar usuario").locatedBy("//*[@placeholder='Usuario ']");
  public static final Target TXT_CLAVE =
      Target.the("Ingresar clave").locatedBy("//*[@placeholder='Contraseña ']");
  public static final Target BTN_LOGIN =
      Target.the("Botón Iniciar Sesión")
          .locatedBy(
              "//*[@class='bg-white border-black p-2 border-2 rounded-md hover:bg-blue-300 w-1/2 mx-auto']");

  public static final Target BTN_COORDENADA =
      Target.the("Elegir Coordenada").locatedBy("//*[@value='{0}']");

  public static final Target TXT_RESULTADO =
      Target.the("Resultado").locatedBy("/html/body/div[4]/div/div/div[2]/div/div/form/input");

  public static final Target BTN_ENVIAR =
      Target.the("Botón Enviar")
          .locatedBy(
              "//*[@class='border-black p-2 border-2 rounded-md mx-auto hover:bg-blue-300']");
}
