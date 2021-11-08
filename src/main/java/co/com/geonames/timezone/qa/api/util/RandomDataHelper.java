/**
 * ©2021 CONFIDENCIAL©
 * Todos los derechos reservados.
 *
 * @Autor: Alejandro Malaver
 */
package co.com.geonames.timezone.qa.api.util;

import com.github.javafaker.Faker;
import java.util.Locale;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class RandomDataHelper {

    static Faker faker = new Faker(new Locale("es"));

    public static Double getRandomLatitude() {
        int minValue = (int) -90;
        int maxValue = (int) 90;
        return faker.number().randomDouble(7, minValue, maxValue);
    }

    public static Double getRandomInvalidLatitude() {
        int minValue = (int) -91;
        int maxValue = (int) -180;
        return faker.number().randomDouble(7, minValue, maxValue);
    }

    public static Double getRandomLength() {
        int minValue = (int) -180;
        int maxValue = (int) 180;
        return faker.number().randomDouble(7, minValue, maxValue);
    }

    public static Double getRandomInvalidLength() {
        int minValue = (int) 180;
        int maxValue = (int) 360;
        return faker.number().randomDouble(7, minValue, maxValue);
    }
}
