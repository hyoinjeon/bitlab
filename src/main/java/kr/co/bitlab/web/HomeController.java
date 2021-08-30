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

    @GetMapping("/solutions/test1")
    public String solution1() {
        return "solution";
    }

    @GetMapping("/solutions/test2")
    public String solution2() {
        return "solution";
    }

    @GetMapping("/solutions/test3")
    public String solution3() {
        return "solution";
    }

}
