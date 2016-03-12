package com.vector.tfriend.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * author: vector.huang
 * date：2016/3/11 15:55
 */
@RequestMapping("hello")
@Controller
public class HelloController {

    @RequestMapping(value = "say",method = {RequestMethod.GET})
    public String hello(){
        System.out.println("Hello Maven SpringMVC");
        return "success";
    }

}
