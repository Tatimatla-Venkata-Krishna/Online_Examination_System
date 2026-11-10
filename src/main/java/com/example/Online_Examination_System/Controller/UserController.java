package com.example.Online_Examination_System.Controller;

import com.example.Online_Examination_System.Entity.UserDetails;
import com.example.Online_Examination_System.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/")
    public String index() {
        return "Index";
    }

    @GetMapping("/login")
    public String login() {
        return "Login";
    }

    @PostMapping("/check")
    public  String check(@RequestParam String rollno ,@RequestParam String password){

        List<UserDetails> allUser=userRepository.findAll();
        UserDetails user =allUser.stream().filter(s-> s.getRollno().equals(rollno) && s.getPassword().equals(password)).findFirst().orElse(null);
        if(user !=null) {
            return "Permition";
        }else{
            return "Login";
        }
    }


    @GetMapping("/register")
    public String register(){
        return "register";
    }

    @PostMapping("create")
    public String create(@ModelAttribute UserDetails userDetailes){
        UserDetails user=userRepository.save(userDetailes);
        return "Login";
    }

    @GetMapping("/permition")
    public  String exam(){
        return "Exam";
    }



    @ResponseBody
    @GetMapping("/registerdetailes")
    public String saveStudent(@ModelAttribute UserDetails user) {
        return user.toString();

    }

}