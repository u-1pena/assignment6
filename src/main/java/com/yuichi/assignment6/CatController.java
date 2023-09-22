package com.yuichi.assignment6;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CatController {
    @GetMapping("/cat")

    public List<Cat> pet() {
        List<Cat> cats = List.of(
                new Cat("tom", "american shorthair"),
                new Cat("tama", "mike"));

        return cats;
    }
}
