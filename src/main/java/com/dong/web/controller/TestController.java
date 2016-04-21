package com.dong.web.controller;

import com.dong.web.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
public class TestController {

    @Resource
    private TestService testService;

    @RequestMapping("hello")
    public ModelAndView index() {

        ModelAndView mv = new ModelAndView("/WEB-INF/index.jsp");
        mv.addObject("count", testService.getRowCount());
        mv.addObject("users", testService.getAllUsers());

        return mv;

    }

}
