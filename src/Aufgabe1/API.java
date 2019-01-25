package Aufgabe1;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.URL;

public class API
{

    private static final String OPENWEATHER_API = "https://api.openweathermap.org/data/2.5/weather?q=6393,at";
    private static final String OPENWEATHER_APIKEY = "1e164b7039160f9747882343e7e760c8";

    public static void getCurrentWeather(){

        try {

            ObjectMapper mapper = new ObjectMapper();
            Weather currWeather = mapper.readValue(new URL(OPENWEATHER_API + "&appid=" + OPENWEATHER_APIKEY), Weather.class);

            System.out.println(currWeather.getCoord());

        } catch (Exception ex){
            ex.printStackTrace();
        }

    }

}
