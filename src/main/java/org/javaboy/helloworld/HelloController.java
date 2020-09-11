package org.javaboy.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
@RequestMapping("/user")
public class HelloController {
    //@RequestMapping("/hello")
    //@RequestMapping({"/hello","/hello2"})//地址可以是多个，就是可以多个地址映射到同一个方法。
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    // @RequestMapping(value = "/hello",method = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
    //这个接口就可以被 GET、POST、PUT、以及 DELETE 访问到了。但是，由于 JSP 支支持 GET、POST 以及 HEAD ，所以这个测试，不能使用 JSP 做页面模板。可以讲视图换成其他的，或者返回 JSON，这里就不影响了
    public ModelAndView hello() {
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("name", "javaboy");
        return mv;
    }

    //通过 HttpServletRequest 做服务端跳转
    @RequestMapping("/hello2")
    public void hello2(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/views/hello2.jsp").forward(req,resp);//服务器端跳转
    }

    @RequestMapping("/hello3")
    public void hello3(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        /*//通过 HttpServletResponse 做重定向
        resp.sendRedirect("/user/hello2");*/
        //自己手动指定响应头去实现重定向
        resp.setStatus(302);
        resp.addHeader("Location", "/user/hello2");
    }

    @RequestMapping("/hello4")
    public void hello4(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        out.write("hello javaboy!");
        out.flush();
        out.close();
    }

    @RequestMapping("/hello5")
    public String hello5(Model model) {
        model.addAttribute("name", "javaboy");//这是数据模型
        return "hello";//表示去查找一个名为 hello 的视图
    }

    //服务端跳转
    @RequestMapping("/hello6")
    public String hello6() {
        return "forward:/WEB-INF/views/hello2.jsp";
    }

    //客户端跳转
    @RequestMapping("/hello7")
    public String hello7() {
        return "redirect:/user/hello";
    }

    //@RequestMapping("/hello8")
    //这里如果单纯的返回一个中文字符串，是会乱码的，可以在 @RequestMapping 中添加 produces 属性来解决
    @RequestMapping(value = "/hello8",produces = "text/html;charset=utf-8")
    @ResponseBody //返回值就是要展示出来返回值，真的返回一个字符串
    public String hello8() {
        //return "redirect:/user/hello";
        return "Java 语言程序设计";
    }
}
