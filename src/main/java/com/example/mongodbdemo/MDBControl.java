package com.example.mongodbdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
public class MDBControl {

    @Autowired
    private EventServicebyRepo eventService;

    @RequestMapping(value = "/dbdata")
    public String dbview(Model model) {


        EventDoc ed = new EventDoc("asdf", "asdf1");
        eventService.insertEvent(ed);

        model.addAttribute("eventdocList", eventService.getEventList("asdf"));

        return "/index.html";
    }

}
