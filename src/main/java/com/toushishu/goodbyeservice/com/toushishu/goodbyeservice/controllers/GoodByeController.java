package com.toushishu.goodbyeservice.com.toushishu.goodbyeservice.controllers;

import com.toushishu.goodbyeservice.com.toushishu.goodbyeservice.models.GoodBye;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * The type Good bye controller.
 */
@RestController
@RequestMapping("/api/v1/goodbye")
public class GoodByeController {

    /**
     * Name good bye.
     *
     * @param name the name
     * @return the good bye
     */
    @RequestMapping(value = "/name/{name}", produces = "application/json")
    public GoodBye name(@PathVariable String name) {
        GoodBye goodbye = new GoodBye(name, "unknown", 1, new Date());
        return goodbye;
    }

    /**
     * Genre good bye.
     *
     * @param genre the genre
     * @return the good bye
     */
    @RequestMapping(value = "/genre/{genre}", produces = "application/json")
    public GoodBye genre(@PathVariable String genre) {
        GoodBye goodbye = new GoodBye("Franklin", genre, 1, new Date());
        return goodbye;
    }


    /**
     * Times good bye.
     *
     * @param times the times
     * @return the good bye
     */
    @RequestMapping(value = "/times/{times}", produces = "application/json")
    public GoodBye times(@PathVariable int times) {
        GoodBye goodbye = new GoodBye("Franklin", "unknown", times, new Date());
        return goodbye;
    }


    /**
     * Home good bye.
     *
     * @return the good bye
     */
    @RequestMapping(value = "/", produces = "application/json")
    public GoodBye home() {
        GoodBye goodbye = new GoodBye("Test", "female", 300, new Date());
        return goodbye;
    }
}
