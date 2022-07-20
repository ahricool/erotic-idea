package cool.ahri.api;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TimeAspect {

    static final SimpleDateFormat datetimeFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static void main(String[] args) throws ParseException {

        System.out.println(datetimeFormat.parse("2022-07-18 17:21:41").getTime());

    }

}
