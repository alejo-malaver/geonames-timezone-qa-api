/**
 * ©2021 CONFIDENCIAL©
 * Todos los derechos reservados.
 *
 * @Autor: Alejandro Malaver
 */
package co.com.geonames.timezone.qa.api.util;

import static org.assertj.core.api.Assertions.assertThat;

import co.com.geonames.timezone.qa.api.model.authentication.ClientDto;
import com.esotericsoftware.yamlbeans.YamlException;
import com.esotericsoftware.yamlbeans.YamlReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PropertyHelper {
    private static ClientDto activeClient = null;
    private static Set<ClientDto> allClients = new HashSet<>();

    public static ClientDto getAClientFromConfig(String clientName) {
        generatedClientList();
        for (ClientDto client : allClients) {
            if (client.getName().equals(clientName)) {
                activeClient = client;
            }
        }
        assertThat(activeClient).isNotNull();
        return activeClient;
    }

    public static Set<ClientDto> generatedClientList() {
        YamlReader reader = null;
        ClientDto client = null;
        try {
            reader = new YamlReader(new FileReader(ManageConfig.USERS_PATH));
            while ((client = reader.read(ClientDto.class)) != null) {
                allClients.add(client);
            }
        } catch (FileNotFoundException | YamlException exception) {
            log.error("Error loading files from " + ManageConfig.USERS_PATH, exception);
            exception.getStackTrace();
        }
        assertThat(allClients).isNotNull().isNotEmpty();
        return allClients;
    }
}
