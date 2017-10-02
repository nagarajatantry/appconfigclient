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

    @Value("${greetings}")
    private String greetingsFromCSM;

    @Value("${greetings-local}")
    private String greetingsManagedLocally;

    @GetMapping("/greetings")
    public String getGreetingsFromCSM() {
        System.out.println("i am here!!!");
        return greetingsFromCSM;
    }

    @GetMapping("/greetings-local")
    public String getGreetingsFromLocal() {
        return greetingsManagedLocally;
    }

}
