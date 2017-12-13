package shenzhen.teamway.tms9000.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import shenzhen.teamway.tms9000.portal.domain.Girl;
import shenzhen.teamway.tms9000.portal.service.CheckGirl;

@Controller
public class CheckGirlController {
    @Autowired
    CheckGirl c;

    /*
     */
    @RequestMapping("/ok")
    public  String login(){
        return "girl";
    }
    @RequestMapping("/girl")
    public void loginUser(String username,String password){
         Girl girl = c.checkGirl(new Girl(1, username, password));
        System.out.println(girl.toString());
    }
}
