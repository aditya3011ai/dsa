import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class plane
{   
    public static void palneNeed(int x,int p){
        int remain = (x*100) - p;
        if(remain<0){
            float ans = Math.abs(remain);
            ans = ans/100;
            int n =(int) Math.ceil(ans);
            System.out.println(n);
        }else{
            System.out.println(0);
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc = new Scanner(System.in);
	 int T = sc.nextInt();
	 for (int i = 0; i < T; i++) {
		int x= sc.nextInt();
		int p = sc.nextInt();
		palneNeed(x,p);
	 }
	}
}
