package java_programs;

public class Palindrome {
	static int num=121;

	public static void main(String[] args) {
		int num1=num;
		int sum=0;
		while( num>0 )
        {
            int remainder = num % 10;
            sum = sum * 10 + remainder;
            num=num/10;
        }
System.out.println(sum);
		// palindrome if orignalInteger and reversedInteger are equal
       System.out.println(num1);
if(sum==num1)
            System.out.println(num1 + " is a palindrome.");
        else
            System.out.println(num1 + " is not a palindrome.");
    }

		
	}


