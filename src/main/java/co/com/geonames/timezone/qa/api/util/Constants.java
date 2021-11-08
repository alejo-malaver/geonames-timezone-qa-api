/**
 * ©2021 CONFIDENCIAL©
 * Todos los derechos reservados.
 *
 * @Autor: Alejandro Malaver
 */
package co.com.geonames.timezone.qa.api.util;

public class Constants {
    private Constants() {
        super();
    }

    /* Timezone */
    /* Query Params */
    public static final String LATITUDE = "lat";
    public static final String LENGTH = "lng";
    public static final String USER_NAME = "username";
    public static final Double LATITUDE_NO_DATA = 90.0;
    public static final Double LENGTH_NO_DATA = -180.0;
    /* Mansajes de las validaciones */
    public static final String RESPONSE_CODE_MESSAGE = "El código de respuesta es el esperado";
    public static final String SCHEMA_VALIDATION_MESSAGE =
            "La estructura de la respuesta coincide con la definida en el esquema del servicio";
    /* Generales */
    public static final String CLIENT_INFO = "clientInfo";
}
