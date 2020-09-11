package org.javaboy.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class Student1Controller {
    @RequestMapping("/Student1")
    public String Student1() {
        return "Student1";
    }

    /*@RequestMapping("/addstudent")
    @ResponseBody
    public void addStudent(@Validated(ValidationGroup2.class) Student1 student1, BindingResult result) {
        if (result != null) {
            //校验未通过，获取所有的异常信息并展示出来
            List<ObjectError> allErrors = result.getAllErrors();
            for (ObjectError allError : allErrors) {
                System.out.println(allError.getObjectName()+":"+allError.getDefaultMessage());
            }
        }
    }*/

    /*@RequestMapping("/addstudent")
    public String addStudent(@Validated(ValidationGroup2.class) Student1 student1, BindingResult result) {
        if (result != null) {
            //校验未通过，获取所有的异常信息并展示出来
            List<ObjectError> allErrors = result.getAllErrors();
            for (ObjectError allError : allErrors) {
                System.out.println(allError.getObjectName()+":"+allError.getDefaultMessage());
            }
            return "Student1";
        }
        return "hello";
    }*/

    @RequestMapping("/addstudent")
    public String addStudent(@ModelAttribute("s") @Validated(ValidationGroup2.class) Student1 student1, BindingResult result) {
        if (result != null) {
            //校验未通过，获取所有的异常信息并展示出来
            List<ObjectError> allErrors = result.getAllErrors();
            for (ObjectError allError : allErrors) {
                System.out.println(allError.getObjectName()+":"+allError.getDefaultMessage());
            }
            return "Student1";
        }
        return "hello";
    }

    @ModelAttribute("info")
    public Map<String,Object> info() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("username", "javaboy");
        map.put("address", "www.javaboy.org");
        return map;
    }

    @RequestMapping("/addstudent2")
    public String addStudent2(Integer id, String name, String email, Integer age, Model model) {
        model.addAttribute("id", id);
        model.addAttribute("name", name);
        model.addAttribute("email", email);
        model.addAttribute("age", age);
        return "Student1";
    }
}
