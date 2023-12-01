import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class students
{   
    public static void transfer(int x,int y){
        int ans1 = 0;
        int ans2 =0;
        int x2 = x;
        int y2 = y;
        if(x==0){
            x2++;
            y2--;
            ans2++;
        }
        if(y==0){
            x--;
            y++;
            ans1++;
        }
        while (x%y!=0) {
            x--;
            y++;
            ans1++;
        }
        if (x<1) {
            ans1 = -1;
        }
        while (x2%y2!=0) {
            x2++;
            y2--;
            ans2++;
        }
        if(y2<1) ans2 =-1;
        if(ans1<ans2 && ans1!=-1){
            System.out.println(ans1);
        }else if(ans2<ans1 && ans2 != -1){
            System.out.println(ans2);
        }else{
            System.out.println(-1);
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc = new Scanner(System.in);
	 int T = sc.nextInt();
	 for (int i = 0; i < T; i++) {
		int x = sc.nextInt();
		int y = sc.nextInt();
		transfer(x,y);
	 }
	}
}
