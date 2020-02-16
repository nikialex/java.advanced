package lecture7.homework.language.translator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestTranslateApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestTranslateApplication.class, args);
        //example => http://localhost:8080/translate?textForTranslate=%D1%87%D0%B8%D1%81%D0%BB%D0%BE&translateFrom=bg&translateTo=en
    }
}
