package org.javaboy.helloworld;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice//表示这是一个增强版的 Controller，主要用来做全局数据处理
public class MyException {
    /*@ExceptionHandler(Exception.class)
    public ModelAndView fileuploadException(Exception e) {
        ModelAndView error = new ModelAndView("error");
        error.addObject("error", e.getMessage());
        return error;
    }*/

    @ExceptionHandler(MaxUploadSizeExceededException.class)
    public ModelAndView fileuploadException(MaxUploadSizeExceededException e) {
        ModelAndView error = new ModelAndView("error");
        error.addObject("error", e.getMessage());
        return error;
    }
}
