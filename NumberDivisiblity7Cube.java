package conditionalSentence;

import java.util.Scanner;

public class NumberDivisiblity7Cube 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num;
		System.out.println("Enter an Integer number:");

        //The input provided by user is stored in num
	    Scanner input = new Scanner(System.in);
 	    num = input.nextInt();

	    /* If number is divisible by 2 then it's an even number else odd number*/
	    if ( num % 7 == 0 )
	    {
	        System.out.println("Cube of the number "+num+" is : "+num*num*num+".");
	    }
	    else
	    {
	        System.out.println("Invalide number "
	       		+ " Please Enter the number which is divisible by 7");
        }
	}

}
