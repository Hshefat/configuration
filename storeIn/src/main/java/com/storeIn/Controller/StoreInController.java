package com.storeIn.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/storein")
public class StoreInController {
    @GetMapping
    public String hello(){
        return "hello";
    }

}
