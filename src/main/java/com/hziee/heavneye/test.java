package com.hziee.heavneye;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
    @RequestMapping("test")
    public void main(){
        System.out.println("test success");
    }
}
