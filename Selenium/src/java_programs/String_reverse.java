package java_programs;

public class String_reverse {
public static void main(String args[]) {
	String s="abhijeet";
int l=s.length();
String rev = "";
for(int i=l-1;i>=0;i--) {
	
	rev=rev+s.charAt(i);
	
}
System.out.println(rev);
}

}