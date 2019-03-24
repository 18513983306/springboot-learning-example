package demo.springboot.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Spring Boot Hello案例
 *
 * Created by bysocket on 26/09/2017.
 */
@Controller
public class HelloController {

    @Autowired
    private Myaaa myaaa;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    @ResponseBody
    public String sayHello() {
        System.out.println("请求进来后打印日志！");
        System.out.println("请求进来==="+myaaa.getMyname());
        return "Hello，Spring Boot！";
    }
}
