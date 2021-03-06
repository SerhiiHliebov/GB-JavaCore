package HomeWork7;

import java.awt.*;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)

public class ForecastsResponce {

    @JsonProperty("Headline")
    public Headline headline;
    @JsonProperty("DailyForecasts")
    public List<DayliForecast> dailyForecasts = null;

    @Override
    public String toString() {
        return dailyForecasts.toString() + "\r\n";
    }
}
