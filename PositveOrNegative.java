package Basic;
import java.util.Scanner;
public class PositveOrNegative 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num;    
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter a number: ");  
		num = sc.nextInt();  
		//checks the number is greater than 0 or not  
		if(num>0)  
		{  
		System.out.println("The number is positive.");  
		}  
		//checks the number is less than 0 or not  
		else if(num<0)  
		{  
		System.out.println("The number is negative.");  
		}  
		//executes when the above two conditions return false  
		else  
		{  
		System.out.println("The number is zero.");  
		}  
	}  
}