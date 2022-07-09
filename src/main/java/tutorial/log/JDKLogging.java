package tutorial.log;

import java.util.logging.Logger;

public class JDKLogging {


    public static void main(String[] args){
        /*
        JDK logging 会在 JVM 启动时读取配置文件并完成初始化，一旦运行main()方法，就无法修改配置。
        一般不会用这个 JDK logging
         */


        Logger logger=Logger.getGlobal();
        /*  JDK logging 的日志级别
        severe warning info config fine finer finest
        默认值是 info
         */
        logger.info("start process...");
        logger.warning("memory is running out...");
        logger.fine("ignored.");
        logger.severe("process will be terminated...");


    }
}
