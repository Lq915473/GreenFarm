package cn.edu.nchu.gf.web.controller;

import cn.edu.nchu.gf.core.dao.TUserMapper;
import cn.edu.nchu.gf.core.model.TUser;
import cn.edu.nchu.gf.core.service.impl.UserServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
    @Autowired
    private UserServiceImpl userServiceImpl;
    private TUser user = new TUser();
    @RequestMapping("/login")
    public String login(@RequestParam("userid") String userId,
                        @RequestParam("password") String passWord,
                        @RequestParam("role") String role, Model model){
        System.out.println(userId);
        System.out.println(passWord);
        System.out.println(role);
        user = userServiceImpl.getLogin(userId,passWord,role);
        if(user != null){
            model.addAttribute("user",user);
            return "home";
        }
        return "index";
    }
    @RequestMapping("/register_1")
    public String register_1(){
        return "register_1";
    }
    @RequestMapping("/register_2")
    public String register_2(@RequestParam(name = "nick_name") String nickName,
                            @RequestParam(name = "password") String passWord
                            ){
        user.setNickName(nickName);
        user.setPassword(passWord);
        System.out.println(user.getNickName());
        return "register_2";
    }
    @RequestMapping("/register")
    public String register(@RequestParam(name = "user_name") String userName,
                           @RequestParam(name = "phone") String phone,
                           @RequestParam(name = "email") String email){
        user.setEmail(email);
        user.setPhone(phone);
        user.setUserName(userName);
        user.setRole("1");
        System.out.println(user.getUserName());
        userServiceImpl.getRegister(user);
        return "index";
    }
}
