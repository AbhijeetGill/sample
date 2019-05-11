package java_programs;


public class Static {
static int a=10;
int b=20;
public static void f() {
	int a=10;
	System.out.println(a);
}
public void f1() {
	//System.out.println(a);
}
	public static void main(String[] args) {
		System.out.println(a);
		f();
		//f1();
	}

}
