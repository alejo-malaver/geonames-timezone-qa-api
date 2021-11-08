/**
 * ©2021 CONFIDENCIAL©
 * Todos los derechos reservados.
 *
 * @Autor: Alejandro Malaver
 */
package co.com.geonames.timezone.qa.api.screenplay.facts;

import static co.com.geonames.timezone.qa.api.util.PropertyHelper.getAClientFromConfig;

import co.com.geonames.timezone.qa.api.model.authentication.ClientDto;
import co.com.geonames.timezone.qa.api.util.Constants;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.facts.Fact;

public class PersonalInformation implements Fact {
    public static PersonalInformation toLogin() {
        return new PersonalInformation();
    }

    @Override
    public void setup(Actor actor) {

        ClientDto clientDTO = getAClientFromConfig(actor.getName());
        if (clientDTO != null) {
            actor.remember(Constants.CLIENT_INFO, clientDTO);
        }
    }
}
