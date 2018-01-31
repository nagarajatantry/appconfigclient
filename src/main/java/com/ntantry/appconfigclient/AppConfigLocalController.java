package com.ntantry.appconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ntantry on 10/2/17.
 */
@RestController
@RefreshScope
public class AppController {


    @Value("${greetings-local}")
    private String greetingsManagedLocally;



    @GetMapping("/greetings-local")
    public String getGreetingsFromLocal() {
        return greetingsManagedLocally;
    }

}
