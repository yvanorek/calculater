package com.example.swlc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculaterController {
    /*
            * add two
     */



                                                                    //localhost:8080 zum Aufrufen der Webseite

    @RequestMapping("/calc/sum")                                  // mit @RequestMapping ändert/erstellt man den Pfad der Webseite -->http://localhost:8080/calc/sum
    public int sum (@RequestParam int a, @RequestParam int b){      // http://localhost:8080/calc/sum?a=3&b=4
        return a+b;
    }





}
