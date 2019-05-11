package java_programs;

public class Stringreverse {
public static void main(String args[]) {
	
	String s1="hello";
    String s2="world";
    String s3=s1.concat(s2);
    System.out.println(s3);
    s1=s3.substring(5,s3.length());
    System.out.println(s1);
	s2=s3.substring(0,5);
	System.out.println(s2);
	StringBuffer b=new StringBuffer("abhijeet");
	System.out.println(b.reverse());
}
}
