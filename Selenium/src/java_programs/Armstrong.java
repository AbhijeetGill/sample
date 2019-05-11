package java_programs;

public class Armstrong {

	public static void main(String[] args) {
			int a=153;
			int sum=0;
			int a1=153;
			while(a!=0)
			{
				int rem=a%10;
				sum=sum+rem*rem*rem;
				a=a/10;
			}
			if(sum==a1)
				System.out.println("yes");
			else
				System.out.println("no");
	
	}

}
