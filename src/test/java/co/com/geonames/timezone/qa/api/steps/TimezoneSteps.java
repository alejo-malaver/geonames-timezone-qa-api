/**
 * ©2021 CONFIDENCIAL©
 * Todos los derechos reservados.
 *
 * @Autor: Alejandro Malaver
 */
package co.com.geonames.timezone.qa.api.steps;

import static co.com.geonames.timezone.qa.api.builders.QueryParamRequestBuilder.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.geonames.timezone.qa.api.screenplay.tasks.timezone.GetTimezoneInformation;

public class TimezoneSteps {

    public void getTimezoneInfo() {

        theActorInTheSpotlight().attemptsTo(GetTimezoneInformation.all(buildTimezoneQueryParam()));
    }

    public void getTimezoneWithoutInfo() {

        theActorInTheSpotlight()
                .attemptsTo(GetTimezoneInformation.all(buildTimezoneQueryParamWithoutInfo()));
    }

    public void getTimezoneWithInvalidLatitude() {

        theActorInTheSpotlight()
                .attemptsTo(
                        GetTimezoneInformation.all(buildTimezoneQueryParamWithInvalidLatitude()));
    }

    public void getTimezoneWithEmptyLatitude() {

        theActorInTheSpotlight()
                .attemptsTo(GetTimezoneInformation.all(buildTimezoneQueryParamWithEmptyLatitude()));
    }

    public void getTimezoneWithoutLatitude() {

        theActorInTheSpotlight()
                .attemptsTo(GetTimezoneInformation.all(buildTimezoneQueryParamWithoutLatitude()));
    }

    public void getTimezoneWithInvalidLength() {

        theActorInTheSpotlight()
                .attemptsTo(GetTimezoneInformation.all(buildTimezoneQueryParamWithInvalidLength()));
    }

    public void getTimezoneWithEmptyLength() {

        theActorInTheSpotlight()
                .attemptsTo(GetTimezoneInformation.all(buildTimezoneQueryParamWithEmptyLength()));
    }

    public void getTimezoneWithoutLength() {

        theActorInTheSpotlight()
                .attemptsTo(GetTimezoneInformation.all(buildTimezoneQueryParamWithoutLength()));
    }

    public void getTimezoneWithEmptyUser() {

        theActorInTheSpotlight()
                .attemptsTo(GetTimezoneInformation.all(buildTimezoneQueryParamWithEmptyUser()));
    }

    public void getTimezoneWithoutUser() {

        theActorInTheSpotlight()
                .attemptsTo(GetTimezoneInformation.all(buildTimezoneQueryParamWithoutUser()));
    }
}
