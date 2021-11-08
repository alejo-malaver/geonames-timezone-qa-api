/**
 * ©2021 CONFIDENCIAL©
 * Todos los derechos reservados.
 *
 * @Autor: Alejandro Malaver
 */
package co.com.geonames.timezone.qa.api.screenplay.tasks.timezone;

import static co.com.geonames.timezone.qa.api.util.RestBuilder.noBodyInfo;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.geonames.timezone.qa.api.model.timezone.TimezoneRequestDto;
import co.com.geonames.timezone.qa.api.util.Constants;
import co.com.geonames.timezone.qa.api.util.ManageConfig;
import java.util.HashMap;
import java.util.Map;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class GetTimezoneInformation implements Task {

    private TimezoneRequestDto allInformationForTimezoneRequestDto;
    private Map<String, Object> parameters;

    public GetTimezoneInformation(TimezoneRequestDto allInformationForTimezoneRequestDto) {

        this.allInformationForTimezoneRequestDto = allInformationForTimezoneRequestDto;
        parameters = new HashMap<>();
        parameters.put(Constants.LATITUDE, allInformationForTimezoneRequestDto.getLat());
        parameters.put(Constants.LENGTH, allInformationForTimezoneRequestDto.getLng());
        parameters.put(Constants.USER_NAME, allInformationForTimezoneRequestDto.getUsername());
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Get.resource(ManageConfig.TIMEZONE_SERVICE).with(noBodyInfo(parameters)));
    }

    public static GetTimezoneInformation all(
            TimezoneRequestDto allInformationForTimezoneRequestDto) {
        return instrumented(GetTimezoneInformation.class, allInformationForTimezoneRequestDto);
    }
}
