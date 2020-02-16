package lecture7.homework.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestServiceApplication.class, args);

        //examples
        //http://localhost:8080/plus?firstNum=3&secondNum=2
        //http://localhost:8080/minus?firstNum=3&secondNum=2
        //http://localhost:8080/delete?firstNum=4&secondNum=2
        //http://localhost:8080/multiply?firstNum=4&secondNum=2
    }

}
