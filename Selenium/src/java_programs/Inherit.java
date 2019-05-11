package java_programs;

public class Inherit {
//public void A(int a,int b)  {
//	System.out.println(a);
//	System.out.println(b);
    public void f() 
	{
		System.out.println("hello");
	}

                 

public static class Inherited extends Inherit
{
	//public void A(int c) {
		//System.out.println(c);
	 //                    }
	public void f() {

		System.out.println("hello1");

					}
	public void f1() {
		System.out.println("hello2");
	}
}
public static void main(String[] args) {

		//Inherited ob=new Inherited();
		//ob.A(10,20);
		//ob.A(10);
		Inherit ob1=new Inherited();
		Inherited ob2=new Inherited();
		ob1.f();
		((Inherited)ob1).f1();
		ob2.f1();
		}	
		
	               
}

