package org.cg.rest;
import java.util.concurrent.atomic.AtomicLong;

import org.cg.Model.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {

    
    @RequestMapping("/")
    public String index() {
 
    	return "index";
    }
}


