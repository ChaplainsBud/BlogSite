package com.matthew.blogsite;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home() {
        return "index";
    }
    @RequestMapping("/blog1")
    public String blog1() {
        return "blog1";
    }
    @RequestMapping("/blog2")
    public String blog2() {
        return "blog2";
    }
    @RequestMapping("/blog3")
    public String blog3 () {
        return "blog3";
    }
    @RequestMapping("/blog4")
    public String blog4() {
        return "blog4";
    }
    @RequestMapping("/blog5")
    public String blog5() {
        return "blog5";
    }
    @RequestMapping("/blog6")
    public String blog6() {
        return "blog6";
    }
    @RequestMapping("/author")
    public String author() {
        return "author";
    }
    @RequestMapping("/bootcamp")
    public String boot() {
        return "bootc-desc";
    }
}
