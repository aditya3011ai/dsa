import java.util.*;
import java.lang.*;
import java.io.*;
public class MapTraverse {
            public static void main (String[] args) throws java.lang.Exception{
            Scanner sc = new Scanner(System.in);
            HashMap<Integer,Integer> map = new HashMap<>();
            map.put(1,5);
            map.put(2,15);
            map.put(3,10);
            map.put(4,15);
            map.forEach((key,value)->{
                System.out.println("key: " + key + " value: " + value);
            });
            sc.close();
            
  }
}