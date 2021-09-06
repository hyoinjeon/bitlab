package kr.co.bitlab.web;

import kr.co.bitlab.service.MailService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
public class MailController {

    @Resource
    private MailService mailService;

    @PostMapping("/contact/mail")
    public String sendMail(@RequestParam(required = false) String name, @RequestParam(required = false) String email
                            , @RequestParam(required = false) String subject, @RequestParam(required = false) String message) {
        mailService.sendMail(name, email, subject, message);

        return "contact";
    }

}
