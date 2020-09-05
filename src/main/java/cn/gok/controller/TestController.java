package cn.gok.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: hq
 * @create time:2020/9/5 15:45
 * @desc:
 */
@Controller
@RequestMapping("/test")
public class TestController {
    @GetMapping("")
    public String test1(){
        return "test";
    }
}
