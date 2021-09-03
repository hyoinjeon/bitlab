package kr.co.bitlab.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/service")
    public String service() {
        return "service";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }

    @GetMapping("/business/solution")
    public String solution() {
        return "solution";
    }

    @GetMapping("/business/service")
    public String businessService() {
        return "business-service";
    }

    @GetMapping("/business/da-dw-si")
    public String daDwSi() {
        return "da-dw-si";
    }

}
