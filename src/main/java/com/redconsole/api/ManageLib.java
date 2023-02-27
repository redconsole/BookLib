package com.redconsole.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/book")
public class ManageLib {

    private List<String> books = new ArrayList<>();

    ManageLib() {
        books.add("Wings of fire");
        books.add("Avengers");
    }

    @GetMapping(value = "/all")
    public List<String> showBooks() {
        return books;
    }
}
