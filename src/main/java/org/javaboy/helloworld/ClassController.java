package org.javaboy.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;

@Controller
public class ClassController {
    @RequestMapping("/class")
    public String addBook() {
        return "addclass";
    }

    @RequestMapping("/addclass")
    @ResponseBody
    public void addClass(MyClass myClass) {
        System.out.println(myClass);
    }
}
