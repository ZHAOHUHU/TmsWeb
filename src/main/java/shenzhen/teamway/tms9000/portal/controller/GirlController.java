package shenzhen.teamway.tms9000.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import shenzhen.teamway.tms9000.portal.domain.Girl;
import shenzhen.teamway.tms9000.portal.service.GirlService;

import java.util.List;

@Controller
public class GirlController {
    @Autowired
    GirlService girlservice;
     //显示首页
    @RequestMapping("/o")
    public String login() {
        return "girl";
    }
      //用户登录认证
    @RequestMapping("/girl")
    public void loginUser(String username, String password) {
        Girl girl = girlservice.checkGirl(new Girl(username, password));
        System.out.println(girl.toString());
    }

    @RequestMapping("/list/{id}")
    public String getList(ModelMap map,@PathVariable("id")int id){

        List<Girl> list=girlservice.selectById(id);
        System.out.println(list);
        map.put("list", list);
    return "success";
    }
}
