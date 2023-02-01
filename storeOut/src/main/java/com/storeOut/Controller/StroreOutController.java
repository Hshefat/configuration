package com.storeOut.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/storeout")
public class StroreOutController {
    public String hello(){
        return "hello store out";
    }

}
