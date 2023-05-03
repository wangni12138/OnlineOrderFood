package wn.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FrontPage {

    @RequestMapping("/")
    public String Portal(){
        return "index";
    }
}
