package test2;

import java.util.Scanner;

public class twonumber {
	public static void main (String[] args) 
	{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
         int a;
         int b;
         int n;
         int min;
         int max;
        for(int i=0;i<t;i++)
        {
            a=sc.nextInt();
            b=sc.nextInt();
            n=sc.nextInt();
                   if(n%2!=0){
                    a=a*2;   
       }
      max=Math.max(a,b);
      min=Math.min(a,b);
      int ans=max/min;
      System.out.println(ans);
        }
	}

}
