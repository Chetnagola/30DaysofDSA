import java.util.ArrayList;
public class UniquePermutations {
	static ArrayList <String> list= new ArrayList<String>();
	public static void uniquesubsets(String ip, String op)
	{
		if(ip.length()==0)
		{    if(!list.contains(op))
		{
			list.add(op);
			
		}
			 return;
		}
		uniquesubsets(ip.substring(1),op);
		uniquesubsets(ip.substring(1), op+ip.charAt(0));
	}
	
	public static void main(String agrs[])
	{
		uniquesubsets("aab","");
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
	}

}
