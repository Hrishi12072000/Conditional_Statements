//WAP to calculate Percentage of Student
package Basic;

import java.util.Scanner;

public class Percentage_user_input 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int sub1,sub2,sub3,sub4,sub5,sub6,sum,total,per;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks of your English subject");
		sub1 = sc.nextInt();
		System.out.println("Enter marks of your Hindi subject ");
		sub2 = sc.nextInt();
		System.out.println("Enter marks of your Marathi subject");
		sub3 = sc.nextInt();
		System.out.println("Enter marks of your Social Science subject");
		sub4 = sc.nextInt();
		System.out.println("Enter marks of your Science subject");
		sub5 = sc.nextInt();
		System.out.println("Enter marks of your Maths subject");
		sub6 = sc.nextInt();
		
		sum = (sub1 + sub2 + sub3 + sub4 + sub5 + sub6);
		System.out.println("Enter total number of mark");
		total=sc.nextInt();
	    per = (sum*100)/total;
		System.out.println("Your percentage is: " +per+ " %");
		if(per>=80)
		{
			System.out.println("Your grade is A");
		}
		else if(per>=60)
		{
			System.out.println("Your grade is B");
		}
		else if(per>=50)
		{
			System.out.println("Your grade is C");
		}
		else if(per>40)
		{
			System.out.println("Your grade is D");
		}
		else
		{
			System.out.println("Your are fail");
		}
	}
}
