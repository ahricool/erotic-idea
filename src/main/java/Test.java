import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

class A {}
class B extends A{}

public class Test extends Thread{
    long interval=10;
    public static void main(String[] args) throws Exception{

        Map<String,Integer> hm=new HashMap<>();
        hm.put("asdsad",1);
        hm.put("sdad",2323);
        System.out.println(hm);

        A b=new B();



        System.out.println(b.getClass());
        System.out.println(4566456999L/1000);

        B c=(B)b;
        System.out.println(c);

        Thread t= new Test();

        t.start();

        Thread.sleep(1000);
        System.out.println(t);
        System.out.println(t.getState());
        System.out.println(t.isAlive());
        Thread.sleep(100);
        System.out.println(t);
        System.out.println(t.getState());
        System.out.println(t.isAlive());

//        Map<String,Integer> blackListSet=new HashMap<>();
//        blackListSet.put("asd",blackListSet.getOrDefault("asd",0)+1);
//        System.out.println(blackListSet.get("asd"));

    }


    @Override
    public void run() {

            // When isBloomLoaderRunning is false, this thread will be terminated in a minute.
            final long checkInterval = 60L; //seconds
            long loadCountDown = 0L;
            while (true) {
                System.out.println("in agin");
                if (loadCountDown <= 0L) {
                    System.out.println("hello");
                    loadCountDown = this.interval;
                } else {
                    loadCountDown -= checkInterval;
                }

                try {
                    Thread.sleep(checkInterval * 1000);
                } catch (Exception ignored) {
                }
            }
        }
    }
