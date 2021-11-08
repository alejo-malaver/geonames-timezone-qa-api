/**
 * ©2021 CONFIDENCIAL©
 * Todos los derechos reservados.
 *
 * @Autor: Alejandro Malaver
 */
package co.com.geonames.timezone.qa.api.model.timezone;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TimezoneResponseDto {

    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime sunrise;

    private int lng;
    private String US;
    private int gmtOffset;
    private int rawOffset;

    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime sunset;

    private String timezoneId;
    private int dstOffset;
    private String countryName;

    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime time;

    private int lat;
}
