package com.benly.coinbot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

/**
 * Created by jacob.p on 2017. 7. 7..
 */
@Controller
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
