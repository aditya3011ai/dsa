import java.util.HashMap;

public class romanToInt {
    public static int roman(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int num=0;
        int i;
        for ( i=0; i < s.length()-1; i++) {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(i+1);
            if(i==s.length()-1){
                num+=map.get(ch1);
            }
            if(map.get(ch1)<map.get(ch2)){
                num += map.get(ch2)-map.get(ch1);
                i++;
            }else{
                num+= map.get(ch1);
            }
        }
        if(i==s.length()-1){
            num+= map.get(s.charAt(i));
        }
        return num;
    }

    public static void main(String[] args) {
      System.out.println(roman("MCMXCIV"));
    }
}
