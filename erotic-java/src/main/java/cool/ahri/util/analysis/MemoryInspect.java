package cool.ahri.util.analysis;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class MemoryInspect {
    public static void main(String[] args) throws Exception{

        printMemory();
        Set<String> s=generateSet();
        printMemory();

    }

    private static Set<String> generateSet() throws Exception{
        String path="C:/Users/Ahri/Documents/black_user.txt";
        FileInputStream fileInputStream = new FileInputStream(path);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String uid;
        Set<String> blackListSet=new HashSet<>();
        while ((uid = bufferedReader.readLine()) != null) {
            blackListSet.add(uid);
        }
        return blackListSet;
    }
    private static void printMemory() {
        Runtime runtime = Runtime.getRuntime();
        long totalMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        System.out.println("Memory: Used=" + (totalMemory - freeMemory) + " Total=" + totalMemory + " Free=" + freeMemory);
    }

}
