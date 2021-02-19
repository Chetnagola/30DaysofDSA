package helloworld;
import java.util.*;
import java.util.ArrayList;
public class Days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		ArrayList<String> a = new ArrayList<String>();
		int n=1;
		while(!a.contains("Exit") || n>5)
		{
			System.out.println("Enter name of the day ");
			String str=s.next();
			a.add(str);
			n++;
		}
		a.remove("Exit");
		System.out.println(a);

	}

}