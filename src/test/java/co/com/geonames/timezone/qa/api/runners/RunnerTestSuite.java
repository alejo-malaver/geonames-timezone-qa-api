/**
 * ©2021 CONFIDENCIAL©
 * Todos los derechos reservados.
 *
 * @Autor: Alejandro Malaver
 */
package co.com.geonames.timezone.qa.api.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features/",
        tags = "@Timezone",
        glue = {"co.com.geonames.timezone.qa.api.stepsdefinitions"})
public class RunnerTestSuite {

    private RunnerTestSuite() {}

    @AfterClass
    public static void afterAll() {}
}
