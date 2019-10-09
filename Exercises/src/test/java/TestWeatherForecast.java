import WeatherForecast.WeatherForecast;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestWeatherForecast{

    @Test
    public void testWeather() {
        WeatherForecast c = new WeatherForecast();
        Boolean t = true;
        assertEquals(true, t);
    }
}