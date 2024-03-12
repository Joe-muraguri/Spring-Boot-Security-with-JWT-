package com.joes.JWT.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/secured")
public class SecureController {

    @GetMapping
    public ResponseEntity<String> saySomething(){
        return ResponseEntity.ok("Hello from a secure endpoint!!");
    }
}
