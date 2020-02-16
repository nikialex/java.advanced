package lecture8.homework.controllers;

import lecture8.homework.pojos.city.weather.CityWeathger;
import lecture8.homework.pojos.forecast.Forecast;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WeatherController {

    @GetMapping("/localWeather")
    public CityWeathger localWeather(@RequestParam(value = "name", defaultValue = "Sofia") String name) {

        CityWeathger cityWeathger = new RestTemplate().getForObject(
                "http://api.openweathermap.org/data/2.5/weather?q=" + name + "&appid=29a65ecd3442c0498ce1a8796803dcf4", CityWeathger.class);

        return cityWeathger;
    }


    @GetMapping("/forecast")
    public Forecast forecast(@RequestParam(value = "name", defaultValue = "Sofia") String name) {

        Forecast forecast = new RestTemplate().getForObject(
                "http://api.openweathermap.org/data/2.5/forecast?q=" + name + "&appid=29a65ecd3442c0498ce1a8796803dcf4", Forecast.class);

        return forecast;
    }

}


