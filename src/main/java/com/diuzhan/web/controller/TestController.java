package com.diuzhan.web.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.diuzhan.web.business.TestBusiness;

@Controller 
@RequestMapping("/test.do") 
public class TestController {
	//将spring 配置文件中的bean 通过setter注入进来 
    @Resource(name="TestBusiness") 
    private TestBusiness testBusiness=null; 
    public void setTestBusiness(TestBusiness testBusiness) { 
        this.testBusiness = testBusiness; 
    }

    @RequestMapping 
    public String handle(HttpServletRequest request, ModelMap modelMap) 
            throws Exception { 
        System.out.println("$$$$$$$$$$$$$$$$$$$$$you want to check the test.jsp+++++++++++++");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$ ready to insert   +++++++++++++"); 
        testBusiness.add(); 
        System.out.println("$$$$$$$$$$$$$$$$$$$$$ insert completed +++++++++++++"); 
        return "test"; 
    } 
}
