package co.com.blankfactor.certification.test.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class PrecioHotelPage {

  public static final Target TXT_ELEGIR_HOTEL =
      Target.the("Elegir hotel").locatedBy("//*[text()='{0}']");

  public static final Target PRECIO_TOTAL =
      Target.the("Valor hotel")
          .locatedBy("//*[@id=\"MainContentPlaceHolder_RoomsNavBar_GHE0\"]/div[2]/div[2]");
}
