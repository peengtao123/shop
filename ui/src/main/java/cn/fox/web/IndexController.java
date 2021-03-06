package cn.fox.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Value("${book.name}")
    private String bookName;

    @RequestMapping("/")
    public String index(){
        return "hello" + " " + bookName;
    }
}
