package co.com.blankfactor.certification.test.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class BuscarHotel {

  public static final Target LST_DESPLEGAR_CIUDADES =
      Target.the("Visualiza ciudades")
          .locatedBy(
              "//*[@id=\"MainContentPlaceHolder_SearchPanel_SearchPanelLayout_LocationComboBox_B-1Img\"]");

  public static final Target LBL_LOCATION =
      Target.the("Campo Ubicación")
          .locatedBy(
              "//*[@id=\"MainContentPlaceHolder_SearchPanel_SearchPanelLayout_LocationComboBox_I\"]");

  public static final Target LBL_CHECKIN =
      Target.the("Campo Check In")
          .locatedBy(
              "//*[@id=\"MainContentPlaceHolder_SearchPanel_SearchPanelLayout_CheckInDateEdit_I\"]");

  public static final Target LBL_CHECKOUT =
      Target.the("Campo Check Out")
          .locatedBy(
              "//*[@id=\"MainContentPlaceHolder_SearchPanel_SearchPanelLayout_CheckOutDateEdit_I\"]");

  public static final Target LST_ROOMS =
      Target.the("Lista Habitaciones")
          .locatedBy(
              "//*[@id=\"MainContentPlaceHolder_SearchPanel_SearchPanelLayout_RoomsComboBox_B-1Img\"]");

  public static final Target LBL_ROOMS =
      Target.the("Campo Habitaciones")
          .locatedBy(
              "//*[@id=\"MainContentPlaceHolder_SearchPanel_SearchPanelLayout_RoomsComboBox_I\"]");

  public static final Target LBL_ADULTS =
      Target.the("Campo Adultos")
          .locatedBy(
              "//*[@id=\"MainContentPlaceHolder_SearchPanel_SearchPanelLayout_AdultsSpinEdit_I\"]");

  public static final Target LBL_CHILDREN =
      Target.the("Campo Niños")
          .locatedBy(
              "//*[@id=\"MainContentPlaceHolder_SearchPanel_SearchPanelLayout_ChildrenSpinEdit_I\"]");

  public static final Target BTN_BUSCAR =
      Target.the("Botón Buscar")
          .locatedBy(
              "//*[@id=\"MainContentPlaceHolder_SearchPanel_SearchPanelLayout_SearchButton_CD\"]");

  public static final Target IMG_ESTRELLA_1 =
      Target.the("Estrellas del Hotel")
          .locatedBy(
              "//*[@id=\"MainContentPlaceHolder_FilterFormLayout_OurRatingCheckBoxList_RB0\"]/tbody/tr/td[2]/label/img");

  public static final Target IMG_ESTRELLA_2 =
      Target.the("Estrellas del Hotel")
          .locatedBy(
              "//*[@id=\"MainContentPlaceHolder_FilterFormLayout_OurRatingCheckBoxList_RB1\"]/tbody/tr/td[2]/label/img");

  public static final Target BTN_APLICAR =
      Target.the("Botón Aplicar")
          .locatedBy(
              "//*[@id=\"MainContentPlaceHolder_FilterFormLayout_ApplyFilterButton_CD\"]/span");

  public static final Target BARRA_VALOR =
      Target.the("VALORES")
          .locatedBy("//*[@id=\"MainContentPlaceHolder_FilterFormLayout_NightlyRateTrackBar_MD\"]");
}
