package cool.ahri.api;

public class StringAspect {
    public static void main(String[] args){
        String s="Hello";
        System.out.println(s.length());
        System.out.println(s.substring(s.length()-1));

        s="1212  231_2323 sad_0";
        String[] sArray=s.split("_");
        System.out.println(sArray.length);
        for (String value : sArray) {
            System.out.println(value);
        }
        System.out.println(String.join("_",null,null,"asdas"));

    }

}
