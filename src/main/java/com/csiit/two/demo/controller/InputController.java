package com.csiit.two.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.constraints.NotEmpty;


@Controller
@RequestMapping("/input")
public class InputController {
    @RequestMapping("")
    public String home(){
        return "input";
    }

    @RequestMapping("/call")
    public String callMe(@RequestParam("name") @NotEmpty String name, Model model){
        model.addAttribute("name",name);
        return "output";
    }
}
