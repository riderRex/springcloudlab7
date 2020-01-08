package com.szit.webclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by deng on 2017/12/24.
 */
@Controller
public class ViewController {
    @Value("${gateway.url}")
    private String gateway;

    @RequestMapping(value = "/index")
    public String getIndex() {
        return "index";
    }

    @RequestMapping(value = "/blog")
    public String getBlog() {
        return "blog";
    }

    @RequestMapping(value = "/work")
    public String getWork(Model model) {
        model.addAttribute("gateway", gateway);
        return "work";
    }
}
