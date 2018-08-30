package shirodemo.Controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;
import shirodemo.DTO.Demo;
import shirodemo.utils.ToolFacade;

import javax.validation.Valid;


@RestController
public class DemoController {
    @Autowired
    ToolFacade toolPackage;
    Logger log=toolPackage.getLogger();

    @ModelAttribute
    public String easyTest2(){
        log.info("必然经过的");
        return "222ss";
    }

    @RequestMapping(value="/ceshi/{xxx}", method= RequestMethod.GET)
    public Integer easyTest0(@PathVariable Integer xxx){
        log.info("简单测试"+xxx);
        return xxx;
    }

    @RequestMapping("demoTest")
    public Demo demoTest(){
        return new Demo("mumu",1L);
    }

    @RequestMapping(value="TestValidator", method = RequestMethod.GET)
    public String testV(@ModelAttribute @Valid Demo demo,
                        BindingResult result){
        if(result.hasErrors()){
            for(ObjectError error:result.getAllErrors()){
                log.error(error.getDefaultMessage());
            }
        }

        return  "error";
    }
}
