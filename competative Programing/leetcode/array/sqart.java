import java.util.*;

public class sqart {
    public static int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        long idx = 1;
        while ((idx * idx) <= x) {
            idx++;
        }

        return (int) idx - 1;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(2147395600));
    }
}