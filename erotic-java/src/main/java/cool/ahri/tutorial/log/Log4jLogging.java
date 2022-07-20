package cool.ahri.tutorial.log;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Log4jLogging {


    /*
    Commons logging 会自动发现并加载 log4j 系统，因此Commons logging的代码不需要做任何更改。

*/
    /*
    Log4j 是一个组件化设计的日志系统，大概分为如下模块

    log.info("hello");
    -->appender-->filter-->layout-->console (File/ socket /jdbc)

    当我们输出一条日志的时候，
    appender 负责把日志 输出到同的目的地
    filter 过滤日志级别
    layout 格式化信息

    具体通过 classpath 的 log4j2.xml 文件来配置。

     */
    static final Log log = LogFactory.getLog(Log4jLogging.class);

    public static void main(String[] args) {

        /*
        Commons Logging 定义了6个日志级别，
        fatal error warning info debug trace
        默认是 info
         */

        log.info("start...");
        log.warn("123123");
        log.error("unknown");
        log.fatal("will exit");
    }

}
