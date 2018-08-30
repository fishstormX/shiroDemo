package shirodemo.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import shirodemo.exception.DemoException;

@RestController
public class ExceptionController {
    @RequestMapping("/exception")
    public String mainController(){
        throw new DemoException("抛出了一个简单的测试异常");
    }



}
