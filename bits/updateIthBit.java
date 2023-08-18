import java.util.*;

public class updateIthBit {
    public static int setBit(int n, int i) {
       return n | (n<<i);
    }
    
    public static int clearBit(int n, int i) {
        return n & ~(1 << i);
    }
    
    public static int updateBit(int n, int i,int newBit) {
        if(newBit==0){
            return clearBit(n, i);
        }else{
            return setBit(n, i);
        }

    }
    public static void main(String[] args) {
    
  }
}