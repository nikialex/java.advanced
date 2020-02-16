package lecture7.homework.calculator.controllers;

import lecture7.homework.calculator.Input;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    private static final String template = "result is ---> %s <------";


    @GetMapping("/plus")
    public Input plus(@RequestParam(value = "firstNum", defaultValue = "0") long firstNum, @RequestParam(value = "secondNum", defaultValue = "0") long secondNum) {

        return new Input(firstNum, secondNum, String.format(template, (firstNum + secondNum) ));
    }


    @GetMapping("/minus")
    public Input minus(@RequestParam(value = "firstNum", defaultValue = "0") long firstNum, @RequestParam(value = "secondNum", defaultValue = "0") long secondNum) {

        return new Input(firstNum, secondNum, String.format(template, (firstNum - secondNum) ));
    }

    @GetMapping("/delete")
    public Input delete(@RequestParam(value = "firstNum", defaultValue = "1") long firstNum, @RequestParam(value = "secondNum", defaultValue = "1") long secondNum) {

        return new Input(firstNum, secondNum, String.format(template, (firstNum / secondNum) ));
    }


    @GetMapping("/multiply")
    public Input multiply(@RequestParam(value = "firstNum", defaultValue = "1") long firstNum, @RequestParam(value = "secondNum", defaultValue = "1") long secondNum) {

        return new Input(firstNum, secondNum, String.format(template, (firstNum * secondNum) + ""));
    }

}
