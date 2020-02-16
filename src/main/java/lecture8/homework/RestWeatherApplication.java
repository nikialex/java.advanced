package lecture8.homework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestWeatherApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestWeatherApplication.class, args);
        //example => http://localhost:8080/localWeather?name=tokio
        //example => http://localhost:8080/forecast?name=tokio
    }
}
