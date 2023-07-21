package co.com.blankfactor.certification.test.exceptions;

public class PrecioNoCorrecto extends AssertionError {

  public static final String VALOR_TARIFA_ERRADO =
      "El valor de la tarifa obtenido no es igual al esperado";

  public PrecioNoCorrecto(String mensaje, Throwable causa) {
    super(mensaje, causa);
  }
}
