package com.kooujin.course.resources;

import com.kooujin.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findall() {
        User user = new User(1L, "Gabriel", "gabriel@icloud.com", "489999", "123");
        return ResponseEntity.ok().body(user);
    }
}
