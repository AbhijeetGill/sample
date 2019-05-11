package java_programs;

public class Largest_smallest {

	public static void main(String[] args) {
		int a[]= {-1,2,3,6,5,6,6,6};
		int largest=a[0];
		int smallest=a[0];
		for(int i=0;i<a.length;i++) {
			if(largest<a[i]) {
				largest=a[i];
							 }
			else if(smallest>a[i])
			{
				smallest=a[i];
	     	  }
		}
	System.out.println("smallest value is:"+smallest);
	System.out.println("largest value is:"+largest);
	}

}
