package java_programs;

public class Array {

	public static void main(String[] args) {
		int sum=0,sum1=0;
		int a[]= {1,2,3,4,5};
		int b[]= {1,2,4,5};
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
			
		for(int j=0;j<b.length;j++) {
			sum1=sum1+b[j];
		}
			System.out.println(sum1);
			System.out.println("missing number is:"+(sum-sum1));
			
			
		}
		
		
		
	}


