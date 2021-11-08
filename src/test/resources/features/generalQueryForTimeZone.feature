# language: es
# Tags: @Timezone
# Author : alejoil777@gmail.com
Característica: Consulta de zona horaria por latitud y longitud
  Como usuario de los servicios del API-REST de Geonames
  Quiero consultar la información de la zona horaria de un lugar por Latitud y Longitud
  Para tener la información horaria según el lugar que requiera

  @Timezone
  Escenario: Consulta general de zona horaria exitosa
    Dado que Yeison es un cliente activo en el API-REST de Geonames
    Cuando él realice la consulta de la zona horaria por latitud y longitud
    Entonces él debe ver la información detallada de la zona horaria consultada

  @Timezone
  Escenario: Consulta general de zona horaria sin información
    Dado que Nancy es una cliente activa en el API-REST de Geonames
    Cuando ella realice la consulta de la zona horaria por latitud y longitud de una ubicación sin información
    Entonces ella debe ver un mensaje indicando el detalle del error

  @Timezone
  Escenario: Consulta general de zona horaria con una latitud inválida
    Dado que Juan es un cliente activo en el API-REST de Geonames
    Cuando él realice la consulta de la zona horaria por latitud y longitud, con una latitud inválida
    Entonces él debe ver un mensaje indicando el detalle del error

  @Timezone
  Escenario: Consulta general de zona horaria con información para la latitud vacía
    Dado que Yeison es un cliente activo en el API-REST de Geonames
    Cuando él realice la consulta de la zona horaria por latitud y longitud, con latitud vacía
    Entonces él debe ver un mensaje indicando el detalle del error

  @Timezone
  Escenario: Consulta general de zona horaria sin información para la latitud
    Dado que Adriana es una cliente activa en el API-REST de Geonames
    Cuando ella realice la consulta de la zona horaria sólo por longitud
    Entonces él debe ver un mensaje indicando el detalle del error

  @Timezone
  Escenario: Consulta general de zona horaria con una longitud inválida
    Dado que Nancy es una cliente activa en el API-REST de Geonames
    Cuando ella realice la consulta de la zona horaria por latitud y longitud, con una longitud inválida
    Entonces ella debe ver un mensaje indicando el detalle del error

  @Timezone
  Escenario: Consulta general de zona horaria con información para la longitud vacía
    Dado que Yeison es un cliente activo en el API-REST de Geonames
    Cuando él realice la consulta de la zona horaria por latitud y longitud, con longitud vacía
    Entonces él debe ver un mensaje indicando el detalle del error

  @Timezone
  Escenario: Consulta general de zona horaria sin información para la longitud
    Dado que Juan es un cliente activo en el API-REST de Geonames
    Cuando él realice la consulta de la zona horaria sólo por latitud
    Entonces él debe ver un mensaje indicando el detalle del error

  @Timezone
  Escenario: Intentar realizar una consulta general de zona horaria con un usuario sin créditos
    Dado que Andrea es una cliente activa en el API-REST de Geonames
    Cuando ella realice la consulta de la zona horaria por latitud y longitud
    Entonces ella debe ver un mensaje indicando el detalle del error

  @Timezone
  Escenario: Intentar realizar una consulta general de zona horaria con un usuario sin confirmar
    Dado que Alejandro es un cliente activo en el API-REST de Geonames
    Cuando él realice la consulta de la zona horaria por latitud y longitud
    Entonces él debe ver un mensaje indicando el detalle del error, con el código de respuesta esperado

  @Timezone
  Escenario: Intentar realizar una consulta general de zona horaria con un usuario que no existe
    Dado que Diana es una cliente activa en el API-REST de Geonames
    Cuando ella realice la consulta de la zona horaria por latitud y longitud
    Entonces él debe ver un mensaje indicando el detalle del error, con el código de respuesta esperado

  @Timezone
  Escenario: Intentar realizar una consulta general de zona horaria con información para el usuario vacía
    Dado que Andrea es una cliente activa en el API-REST de Geonames
    Cuando ella realice la consulta de la zona horaria por latitud y longitud, con usuario vacío
    Entonces él debe ver un mensaje indicando el detalle del error, con el código de respuesta esperado

  @Timezone
  Escenario: Intentar realizar una consulta general de zona horaria sin información para el usuario
    Dado que Alejandro es una cliente activa en el API-REST de Geonames
    Cuando ella realice la consulta de la zona horaria por latitud y longitud, sin enviar usuario
    Entonces él debe ver un mensaje indicando el detalle del error, con el código de respuesta esperado