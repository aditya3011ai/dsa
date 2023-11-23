import java.util.*;

public class minAbsoluteDiff {
    public static void main(String[] args) {
        int a[] = { 1,2,1 };
        int b[] = { 2,1,1};

        Arrays.sort(a);
        Arrays.sort(b);
        int minAbsolute=0;
        for (int i = 0; i < b.length; i++) {
            minAbsolute += Math.abs(a[i]-b[i]);
        }
        System.out.println(minAbsolute);
    }
}