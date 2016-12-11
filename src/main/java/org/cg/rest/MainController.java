package org.cg.rest;
import java.util.concurrent.atomic.AtomicLong;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {

    
    @RequestMapping("/")
    public String index() {
 
    	return "index";
    }
    
    @RequestMapping("/login")
    public String login() {
    	return "apps/login/Login";
    }
    
    @RequestMapping(value = {"/404"}, method = RequestMethod.GET)
    public String NotFoudPage() {
        return "404";

    }
    
}


