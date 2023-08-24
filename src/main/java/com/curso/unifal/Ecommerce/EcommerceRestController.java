package com.curso.unifal.Ecommerce;

import org.springframework.web.bind.annotation.*;

@RestController
public class EcommerceRestController {
    @GetMapping(path = "/v1/ecommerce/users/{user}")
    public String getEcommerce(@PathVariable String user){
        return "Olá" + user;
    }
    @PostMapping(path = "/v1/ecommerce/users")
    public String createUser(@RequestBody(required = false) User user){
        return "user created" + " " + "Olá " + user.getName();
    }
}
