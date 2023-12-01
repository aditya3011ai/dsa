import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{	
	public static int chef(int a,int b){
		if(b==0){
		return 1001;	
		}
		int movs = 0;
		if(a==0){
			movs++;
			a++;
			b--;
		}
		int x= b;
		while(b>0){
			if(a%b==0){
				return movs;
			}
			movs++;
			b--;
			a++;
		}
		return 1001;
	}
	public static int frnd(int a,int b){
		int movs = 0;
		if(a==0){
			return 1001;
		}
		if(b==0){
			movs++;
			b++;
			a--;
		}
		int x = a;
		while(a>0){
			if(a%b==0){
				return movs;
			}
			movs++;
			a--;
			b++;
		}
		return 1001;
	}
	public static int transfer(int chef,int frnd){
		
		return Math.min(chef(chef,frnd), frnd(chef,frnd));
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
	 Scanner sc = new Scanner(System.in);
	 int T = sc.nextInt();

	 int arr[]= new int[T];
	 for (int i = 0; i < T; i++) {
		int t= sc.nextInt();
		int x = sc.nextInt();
		arr[i]= transfer(t, x);
	 }
	 for (int i = 0; i < T; i++) {
		System.out.println(arr[i]);
	 }
	
	}
}
