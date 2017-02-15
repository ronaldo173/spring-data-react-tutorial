package software.sigma.tutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by alexandr.efimov on 2/14/2017.
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String index() {
        System.out.println("/ mapping");
        return "index";
    }
}
