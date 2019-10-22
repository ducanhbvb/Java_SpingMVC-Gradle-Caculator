package com.codegym.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class CalculatorController {

    @GetMapping("/calculator")
    public String showHome() {
        return "home";
    }

    @GetMapping("/calculators")
    public String division(Model model,@RequestParam int numberOne, @RequestParam int numberTwo,@RequestParam String operator ){
        int result = 0;
        switch (operator){
            case "+":
                result = numberOne + numberTwo;
                break;
            case "-":
                result = numberOne - numberTwo;
                break;
            case "*":
                result = numberOne * numberTwo;
                break;
            case "/":
                result = numberOne / numberTwo;
                break;
        }


        model.addAttribute("numberOne", numberOne);
        model.addAttribute("numberTwo", numberTwo);
        model.addAttribute("result",result);
        return "home";
    }

}
