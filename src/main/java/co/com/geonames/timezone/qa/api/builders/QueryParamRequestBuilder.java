/**
 * ©2021 CONFIDENCIAL©
 * Todos los derechos reservados.
 *
 * @Autor: Alejandro Malaver
 */
package co.com.geonames.timezone.qa.api.builders;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.geonames.timezone.qa.api.model.authentication.ClientDto;
import co.com.geonames.timezone.qa.api.model.authentication.UserDto;
import co.com.geonames.timezone.qa.api.model.timezone.TimezoneRequestDto;
import co.com.geonames.timezone.qa.api.util.Constants;
import co.com.geonames.timezone.qa.api.util.RandomDataHelper;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class QueryParamRequestBuilder {

    public static TimezoneRequestDto buildTimezoneQueryParam() {
        ClientDto client = theActorInTheSpotlight().recall(Constants.CLIENT_INFO);
        UserDto myUser = client.getUser();
        Double latitude = RandomDataHelper.getRandomLatitude();
        Double length = RandomDataHelper.getRandomLength();

        return TimezoneRequestDto.builder()
                .lat(latitude)
                .lng(length)
                .username(myUser.getUsername())
                .build();
    }

    public static TimezoneRequestDto buildTimezoneQueryParamWithoutInfo() {
        ClientDto client = theActorInTheSpotlight().recall(Constants.CLIENT_INFO);
        UserDto myUser = client.getUser();
        Double latitude = Constants.LATITUDE_NO_DATA;
        Double length = Constants.LENGTH_NO_DATA;

        return TimezoneRequestDto.builder()
                .lat(latitude)
                .lng(length)
                .username(myUser.getUsername())
                .build();
    }

    public static TimezoneRequestDto buildTimezoneQueryParamWithInvalidLatitude() {
        ClientDto client = theActorInTheSpotlight().recall(Constants.CLIENT_INFO);
        UserDto myUser = client.getUser();
        Double latitude = RandomDataHelper.getRandomInvalidLatitude();
        Double length = RandomDataHelper.getRandomLength();

        return TimezoneRequestDto.builder()
                .lat(latitude)
                .lng(length)
                .username(myUser.getUsername())
                .build();
    }

    public static TimezoneRequestDto buildTimezoneQueryParamWithEmptyLatitude() {
        ClientDto client = theActorInTheSpotlight().recall(Constants.CLIENT_INFO);
        UserDto myUser = client.getUser();
        Double latitude = null;
        Double length = RandomDataHelper.getRandomLength();

        return TimezoneRequestDto.builder()
                .lat(latitude)
                .lng(length)
                .username(myUser.getUsername())
                .build();
    }

    public static TimezoneRequestDto buildTimezoneQueryParamWithoutLatitude() {
        ClientDto client = theActorInTheSpotlight().recall(Constants.CLIENT_INFO);
        UserDto myUser = client.getUser();
        Double length = RandomDataHelper.getRandomLength();

        return TimezoneRequestDto.builder().lng(length).username(myUser.getUsername()).build();
    }

    public static TimezoneRequestDto buildTimezoneQueryParamWithInvalidLength() {
        ClientDto client = theActorInTheSpotlight().recall(Constants.CLIENT_INFO);
        UserDto myUser = client.getUser();
        Double latitude = RandomDataHelper.getRandomLatitude();
        Double length = RandomDataHelper.getRandomInvalidLength();

        return TimezoneRequestDto.builder()
                .lat(latitude)
                .lng(length)
                .username(myUser.getUsername())
                .build();
    }

    public static TimezoneRequestDto buildTimezoneQueryParamWithEmptyLength() {
        ClientDto client = theActorInTheSpotlight().recall(Constants.CLIENT_INFO);
        UserDto myUser = client.getUser();
        Double latitude = RandomDataHelper.getRandomLatitude();
        Double length = null;

        return TimezoneRequestDto.builder()
                .lat(latitude)
                .lng(length)
                .username(myUser.getUsername())
                .build();
    }

    public static TimezoneRequestDto buildTimezoneQueryParamWithoutLength() {
        ClientDto client = theActorInTheSpotlight().recall(Constants.CLIENT_INFO);
        UserDto myUser = client.getUser();
        Double latitude = RandomDataHelper.getRandomLatitude();

        return TimezoneRequestDto.builder().lat(latitude).username(myUser.getUsername()).build();
    }

    public static TimezoneRequestDto buildTimezoneQueryParamWithEmptyUser() {
        ClientDto client = theActorInTheSpotlight().recall(Constants.CLIENT_INFO);
        String myUser = StringUtils.EMPTY;
        Double latitude = RandomDataHelper.getRandomLatitude();
        Double length = RandomDataHelper.getRandomLength();

        return TimezoneRequestDto.builder().lat(latitude).lng(length).username(myUser).build();
    }

    public static TimezoneRequestDto buildTimezoneQueryParamWithoutUser() {
        ClientDto client = theActorInTheSpotlight().recall(Constants.CLIENT_INFO);
        Double latitude = RandomDataHelper.getRandomLatitude();
        Double length = RandomDataHelper.getRandomLength();

        return TimezoneRequestDto.builder().lat(latitude).lng(length).build();
    }
}
