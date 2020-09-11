package org.javaboy.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

//@Controller
@RestController
public class BookController {
    @GetMapping("/book/{id}")//http://localhost:8080/book/2
    public Book2 getBookById(@PathVariable Integer id) {
        Book2 book = new Book2();
        book.setId(id);
        return book;
    }

    @RequestMapping("/book")
    public String addBook() {
        //return "addbook";
        return "addbook1";
    }

    @RequestMapping("/book2")
    @ResponseBody
    public Book2 getBookById() {
        Book2 book2 = new Book2();
        book2.setId(1);
        book2.setName("三国演义");
        book2.setAuthor("罗贯中");
        book2.setPublish(new Date());
        return book2;
    }

    @RequestMapping("/book3")
    public String addBook3() {
        return "book";
    }

    @RequestMapping("/addbook3")
    @ResponseBody
    public void addBook3(@RequestBody Book2 book) {
        System.out.println(book);
    }

    @RequestMapping("/books")
    @ResponseBody
    public List<Book2> getAllBooks() {
        List<Book2> list = new ArrayList<Book2>();
        for (int i = 0; i < 10; i++) {
            Book2 book = new Book2();
            book.setId(i);
            book.setName("三国演义:" + i);
            book.setAuthor("罗贯中:" + i);
            book.setPublish(new Date());
            list.add(book);
        }
        return list;
    }

    /*@RequestMapping(value = "/doAdd",method = RequestMethod.POST)
    @ResponseBody
    public void doAdd(String name,String author,Double price,Boolean ispublic) {
        System.out.println(name);
        System.out.println(author);
        System.out.println(price);
        System.out.println(ispublic);
    }*/

    /*@RequestParam
    这个注解的的功能主要有三方面：
    1.给变量取别名 2.设置变量是否必填 3.给变量设置默认值*/
    /*@RequestMapping(value = "/doAdd",method = RequestMethod.POST)
    @ResponseBody
    public void doAdd(@RequestParam("name") String bookname, String author, Double price, Boolean ispublic) {
        System.out.println(bookname);
        System.out.println(author);
        System.out.println(price);
        System.out.println(ispublic);
    }*/
    /*@RequestMapping(value = "/doAdd",method = RequestMethod.POST)
    @ResponseBody
    public void doAdd(@RequestParam(value = "name",required = true,defaultValue = "三国演义") String bookname, String author, Double price, Boolean ispublic) {
        System.out.println(bookname);
        System.out.println(author);
        System.out.println(price);
        System.out.println(ispublic);
    }*/

    //实体类接收前端传来的数据
    /*@RequestMapping(value = "/doAdd",method = RequestMethod.POST)
    @ResponseBody
    public void doAdd(Book book) {
        System.out.println(book);
    }*/
    //对象中可能还有对象
    @RequestMapping(value = "/doAdd",method = RequestMethod.POST)
    @ResponseBody
    public void doAdd(Book1 book,String[] favorites) {//前端传来的数组对象，服务端不可以使用 List 集合去接收。
        System.out.println(Arrays.toString(favorites));
        System.out.println(book);
    }
}
