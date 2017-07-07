package com.benly.coinbot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * Created by jacob.p on 2017. 7. 7..
 */
@RestController
public class DemoController {

    @RequestMapping("/keyboard")
    public Keyboard getKeyboard() {
        Keyboard keyboard = new Keyboard();
        keyboard.setType("buttons");
        keyboard.setButtons(Arrays.asList(
                "선택 1",
                "선택 2",
                "선택 3"
        ));
        return keyboard;
    }
}
