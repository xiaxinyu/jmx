package com.xiaxinyu.jmx.controller;

import com.xiaxinyu.jmx.bean.SimpleBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JmxController {
    @Autowired
    private SimpleBean simpleBean;

    @GetMapping("/jmx")
    public SimpleBean simpleBean(@RequestParam(required = false) Long id,
                                 @RequestParam(required = false) String name,
                                 @RequestParam(required = false) Integer age) {
        if (id != null) {
            simpleBean.setId(id);
        }
        if (name != null) {
            simpleBean.setName(name);
        }
        if (age != null) {
            simpleBean.setAge(age);
        }
        return simpleBean;
    }
}
