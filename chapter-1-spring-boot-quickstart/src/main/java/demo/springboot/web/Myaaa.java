package demo.springboot.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Myaaa {
    @Value("myname")
    private String myname;

    public String getMyname() {
        return myname;
    }

}
