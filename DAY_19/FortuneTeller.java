package fortuneteller;
import java.util.Scanner;
public class FortuneTeller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	String name;
	System.out.print("Enter your name : ");
	name=s.nextLine();
	System.out.print("Enter your age: ");
	int age=s.nextInt();
	System.out.println("Your Fortune : ");
	System.out.println("Initial alphabet of your future spouse= "+ spname());
	System.out.println("Your age when you'd get married = "+ spage(age));
	System.out.println("Number of children you would have = "+ children());
	System.out.println("BEST OF LUCK");
	
}
   private static char spname ()
   {
	  int x = (int)(Math.random() * (26 - 1 + 1) + 1);
	  x+=64;
	  char sn=(char) x;
	  return(sn);
   }
   
   private static int spage(int a)
   {
	   int x = (int)(Math.random() * (a + 25) + a);  
	   return(x);
   }
   
   private static int children()
   {
	   int x=(int)(Math.random() * (26 - 1 + 1) + 1);
	   return(x);
   }
   
}
