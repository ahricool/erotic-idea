package tutorial.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jLogging {

    /*
    slf4j 类似于 Commons Logging 也是一个第三方日志的API接口，比 Commons Logging 好用一点。
     */

    final static Logger logger= LoggerFactory.getLogger(Slf4jLogging.class);

    public static void main(String[] args){
        logger.info("hello");
    }

}
