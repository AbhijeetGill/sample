package java_programs;

public class Reversenumber {

	public static void main(String[] args) {
		int rev=0;
		int sum=0;
		int a=123;
		int num=a;
		while(num>0) {
			rev=rev*10+num%10;
			
			num=num/10;
		}
		
		System.out.print(rev);
		
		
		
		
	}

}
