package lecture7.homework.today.converter.controllers;

import lecture7.homework.today.converter.InputData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

@RestController
public class DateConvertController {


    @GetMapping("/today")
    public InputData today(@RequestParam(value = "date", defaultValue = "01.01.1970") String date) {

        LocalDate ld = null;

        try {
            String year = date.substring(6);
            String month = date.substring(3, 5);
            String day = date.substring(0, 2);
            ld = LocalDate.parse(year + "-" + month + "-" + day);
        } catch (DateTimeParseException e) {
            return new InputData(date, "Data Format is not as expected. => Expected dd.mm.yyyy");


        }
        return new InputData(date, ld.getDayOfWeek().toString());

    }
}
