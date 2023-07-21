package co.com.blankfactor.certification.test.utils.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EnumCredenciales {
  EVALART_CREDENCIALES("628058", "10df2f32286b7120My0zLTg1MDgyNg==30e0c83e6c29f1c3"),
  EVALART_CREDENCIALES2("628058", "10df2f32286b7120MS00LTg1MDgyNg==30e0c83e6c29f1c3");

  private final String usuario;
  private final String clave;
}
