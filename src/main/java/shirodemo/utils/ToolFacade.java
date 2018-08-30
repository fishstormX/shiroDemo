package shirodemo.utils;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import shirodemo.Controller.DemoController;

@Repository
public class ToolFacade {
    private static Logger log = LoggerFactory.getLogger(DemoController.class);
    private static org.apache.logging.log4j.Logger logger = org.apache.logging.log4j.LogManager.getLogger(ToolFacade.class);
    public static Logger getLogger() {
        return log;
    }
}
