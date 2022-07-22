package array;

import java.util.Scanner;

public class Prime_or_not 
{
	public static void main(String[] args) 
	{
				Scanner sc = new Scanner(System.in);
				int num,temp=0;
				System.out.println("Enter a number:");
				num=sc.nextInt();
				for(int i=2; i<num; i++) 
				{
					if(num%i == 0)
					{
						temp=temp+1;
					}
				}
				if(temp==0) 
				{
					System.out.println("Is a prime no.");
				}
				else 
				{
					System.out.println("Not a prime no.");
				}
	}
}

