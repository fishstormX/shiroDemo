package shirodemo.Controller;


import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import shirodemo.utils.ToolFacade;

@RestController
public class loginController {
    @Autowired
    ToolFacade toolPackage;

    Logger logger=toolPackage.getLogger();
    @RequestMapping("testLogin")
    public String testLogin(String name){
        logger.info("用户登录");
        return name;
    }
}
