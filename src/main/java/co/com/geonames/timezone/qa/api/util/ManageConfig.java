/**
 * ©2021 CONFIDENCIAL©
 * Todos los derechos reservados.
 *
 * @Autor: Alejandro Malaver
 */
package co.com.geonames.timezone.qa.api.util;

import java.io.File;
import java.nio.file.Paths;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.configuration.SystemPropertiesConfiguration;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
import net.thucydides.core.webdriver.Configuration;

public class ManageConfig {
    @SuppressWarnings("rawtypes")
    private static final Configuration CONFIGURATION =
            new SystemPropertiesConfiguration(
                    SystemEnvironmentVariables.createEnvironmentVariables());

    private static final EnvironmentVariables environmentVariables =
            CONFIGURATION.getEnvironmentVariables();
    private static final String CONFIG_PATH =
            Paths.get(new File("").getAbsolutePath(), "src", "main", "resources").toString();

    // URL base de los EndPoint y Path base del archivo de usuarios
    public static final String BASE_URL =
            EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("base.url");
    public static final String USERS_PATH =
            Paths.get(
                            CONFIG_PATH,
                            EnvironmentSpecificConfiguration.from(environmentVariables)
                                    .getProperty("users.file"))
                    .toString();

    // Path base de cada servicio
    public static final String TIMEZONE_SERVICE =
            EnvironmentSpecificConfiguration.from(environmentVariables)
                    .getProperty("timezone.path");
}
