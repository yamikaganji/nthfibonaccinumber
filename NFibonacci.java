package basicjavaprograms;

import java.util.Scanner;

public class NFibonacci {
		
		public static int fibonacci(int n)
		{
			if(n<=1)
			{
				return n;
			}
			int n1=0;int n2=1;int n3;
		
			for(int i=0;i<n-1;i++)
			{
				n3=n1+n2;
				n1=n2;
				n2=n3;
			}
			
			
			return n2;
		}

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter n value:");
			int n=sc.nextInt();
			int m=fibonacci(n);
			System.out.println("the nth fibonacci number is:" + m);

	}

}

