import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("enter a number:");
		int n=s.nextInt();
		if(n%2==0)           
        {
        if(n>=2 && n<=5){
        System.out.println("not weird");
                        }
               else if(n>=6 && n<=20)

                         {
            System.out.println("weird");

                         }
                else if(n>20){
                    System.out.println("not weird");
                }
        

        }

       
    else
    {
        System.out.println("weird");
    }
}

    //scan.close();


	}


