package com.pjkfckr.helmdeploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public Map<String, String> greeting() {
        Map<String, String> map = new HashMap<>();
        map.put("message", "greeting");
        return map;

    }
}
