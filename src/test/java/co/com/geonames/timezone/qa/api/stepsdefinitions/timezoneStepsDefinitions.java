/**
 * ©2021 CONFIDENCIAL©
 * Todos los derechos reservados.
 *
 * @Autor: Alejandro Malaver
 */
package co.com.geonames.timezone.qa.api.stepsdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.geonames.timezone.qa.api.screenplay.questions.ServiceResponse;
import co.com.geonames.timezone.qa.api.steps.CommonSteps;
import co.com.geonames.timezone.qa.api.steps.TimezoneSteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import org.apache.http.HttpStatus;

public class timezoneStepsDefinitions {

    @Steps CommonSteps commonSteps;
    @Steps TimezoneSteps timezoneSteps;

    @Dado("que {word} es un/una cliente activo/activa en el API-REST de Geonames")
    public void usuarioEsUnClienteAutenticadoDelApiGeonames(String clientName) {

        commonSteps.userHasPersonalInformationToLogin(clientName);
    }

    @Cuando("él/ella realice la consulta de la zona horaria por latitud y longitud")
    public void usuarioConsultaZonaHorariaPorLatitudYLongitud() {

        timezoneSteps.getTimezoneInfo();
    }

    @Cuando(
            "él/ella realice la consulta de la zona horaria por latitud y longitud de una ubicación sin información")
    public void usuarioConsultaZonaHorariaPorLatitudYLongitudParaUbicacionSinInformacion() {

        timezoneSteps.getTimezoneWithoutInfo();
    }

    @Cuando(
            "él/ella realice la consulta de la zona horaria por latitud y longitud, con una latitud inválida")
    public void usuarioConsultaZonaHorariaPorLatitudYLongitudConLatitudInvalida() {

        timezoneSteps.getTimezoneWithInvalidLatitude();
    }

    @Cuando(
            "él/ella realice la consulta de la zona horaria por latitud y longitud, con latitud vacía")
    public void usuarioConsultaZonaHorariaPorLatitudYLongitudConLatitudVacia() {

        timezoneSteps.getTimezoneWithEmptyLatitude();
    }

    @Cuando("él/ella realice la consulta de la zona horaria sólo por longitud")
    public void usuarioConsultaZonaHorariaSoloPorLongitud() {

        timezoneSteps.getTimezoneWithoutLatitude();
    }

    @Cuando(
            "él/ella realice la consulta de la zona horaria por latitud y longitud, con una longitud inválida")
    public void usuarioConsultaZonaHorariaPorLatitudYLongitudConLongitudInvalida() {

        timezoneSteps.getTimezoneWithInvalidLength();
    }

    @Cuando(
            "él/ella realice la consulta de la zona horaria por latitud y longitud, con longitud vacía")
    public void usuarioConsultaZonaHorariaPorLatitudYLongitudConLongitudVacia() {

        timezoneSteps.getTimezoneWithEmptyLength();
    }

    @Cuando("él/ella realice la consulta de la zona horaria sólo por latitud")
    public void usuarioConsultaZonaHorariaSoloPorLatitud() {

        timezoneSteps.getTimezoneWithoutLength();
    }

    @Cuando(
            "él/ella realice la consulta de la zona horaria por latitud y longitud, con usuario vacío")
    public void usuarioConsultaZonaHorariaPorLatitudYLongitudConUsuarioVacio() {

        timezoneSteps.getTimezoneWithEmptyUser();
    }

    @Cuando(
            "él/ella realice la consulta de la zona horaria por latitud y longitud, sin enviar usuario")
    public void usuarioConsultaZonaHorariaPorLatitudYLongitudSinUsuario() {

        timezoneSteps.getTimezoneWithoutUser();
    }

    @Entonces("él/ella debe ver la información detallada de la zona horaria consultada")
    public void usuarioDebeVerInformacionDetalladaDeLaZonaHoraria() {

        if (theActorInTheSpotlight().asksFor(ServiceResponse.sentBackByService()).statusCode()
                == HttpStatus.SC_NO_CONTENT)
            commonSteps.shouldSeeSuccessResponse(HttpStatus.SC_NO_CONTENT, null);
        else commonSteps.shouldSeeSuccessResponse(HttpStatus.SC_OK, "timezone/timezoneInformation");
    }

    @Entonces("él/ella debe ver un mensaje indicando el detalle del error")
    public void usuarioDebeVerMensajeDeErrorEsperado() {

        if (theActorInTheSpotlight().asksFor(ServiceResponse.sentBackByService()).statusCode()
                == HttpStatus.SC_NO_CONTENT)
            commonSteps.shouldSeeSuccessResponse(HttpStatus.SC_NO_CONTENT, null);
        else commonSteps.shouldSeeSuccessResponse(HttpStatus.SC_OK, "timezone/timezoneErrorStatus");
    }

    @Entonces(
            "él/ella debe ver un mensaje indicando el detalle del error, con el código de respuesta esperado")
    public void usuarioDebeVerMensajeDeErrorYCodigoDeRespuestaEsperado() {

        if (theActorInTheSpotlight().asksFor(ServiceResponse.sentBackByService()).statusCode()
                == HttpStatus.SC_NO_CONTENT)
            commonSteps.shouldSeeSuccessResponse(HttpStatus.SC_NO_CONTENT, null);
        else
            commonSteps.shouldSeeSuccessResponse(
                    HttpStatus.SC_UNAUTHORIZED, "timezone/timezoneErrorStatus");
    }
}
