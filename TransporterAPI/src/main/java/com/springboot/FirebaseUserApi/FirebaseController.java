package com.springboot.FirebaseUserApi;

import com.google.firebase.auth.FirebaseAuthException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;

@RestController
public class FirebaseController {

    @Autowired
    public Service service;

    @GetMapping("/email/{email}")
    public String getUserByEmail(@PathVariable String email) throws InterruptedException, ExecutionException, FirebaseAuthException {
       //returning uid as a response       
       return service.getByEmail(email);
    }

}
