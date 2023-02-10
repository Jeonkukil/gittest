package shop.mtcoding.reblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class home {
    
    @GetMapping("/")
    public String homa() {
        return "main";
    }
}
