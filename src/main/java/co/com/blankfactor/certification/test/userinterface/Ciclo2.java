package co.com.blankfactor.certification.test.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class Ciclo2 {

  public static final Target TXT_LETRA =
      Target.the("Texto Letra").locatedBy("/html/body/div[2]/form/div[1]/div[1]/p");

  public static final Target LBL_TEXTO_LETRA =
      Target.the("Label Letra").locatedBy("//*[@name='text']");

  public static final Target CL_FECHA = Target.the("Label fecha").locatedBy("//*[@name='date']");

  public static final Target TXT_FECHA =
      Target.the("Label fecha").locatedBy("/html/body/div[2]/form/div[1]/div[2]/p");

  public static final Target BTN_ENVIAR2 =
      Target.the("Botón Enviar").locatedBy("/html/body/div[2]/form/div[2]/button");

  public static final Target TXT_CICLOS =
      Target.the("Texto Ciclos").locatedBy("//*[@class='text-xl text-center text-green-500']");
}
