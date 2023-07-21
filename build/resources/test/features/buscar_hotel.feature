#language: es

Característica: Validar que las tarifas cobrada a los clientes sea la correcta
  Yo como Jefe de ventas de la agencia de viajes DX Hotels
  deseo ver la tarifa mas economica para un destino especifico
  para poder validar que al cliente se le este cobrando correctamente y validar el precio total.

  @TarifarCorrectamente
  Esquema del escenario: Tarifar correctamente el hotel mas barato en la agencia de viaje DX Hotels
    Dado que deseo ver la tarifa mas economica de  los hoteles
      |  Location|  <Location>|
      |  Rooms   |  <Rooms>   |
      |  Adults  |  <Adults>  |
      |  Children|  <Children>|
    Cuando realice una busqueda de las tarifas disponibles
    Entonces la tarifa mas baja para ese destino es "<Tarifa>"

    Ejemplos:
      |Location     | Rooms| Adults | Children | Tarifa  |
      |Los Angeles  | 2    | 2      | 3        | $109.99 |
      |London       | 1    | 3      | 2        | $100.00 |
