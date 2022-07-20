package cool.ahri.tutorial.log;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CommonsLogging {
    /*
    Commons Logging 是一个由 apache 提供的第三方日志API接口，它可以通过配置文件挂接不同的日志系统。
    默认情况下，Commons Logging 自动搜索并使用Log4j（Log4j是另一个流行的日志系统），如果没有找到Log4j，再使用JDK Logging。
     */

    static final Log log=LogFactory.getLog(CommonsLogging.class);


    public static void main(String[] args){

        /*
        Commons Logging 定义了6个日志级别，
        fatal error warning info debug trace
        默认是 info
         */

        log.info("start...");
        log.warn("123123");
    }
}
