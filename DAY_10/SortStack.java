import java.util.Stack;

public class SortStack {
	public static void insert(Stack<Integer> stack , int temp)
	{
		if(stack.isEmpty() || (int)stack.peek()<temp)
			{stack.push(temp);
			 return;
			}
		int val=stack.pop();
		insert(stack, temp);
		stack.push(val);
			
	}
    public static void sort(Stack<Integer> stack)
    {
    	if(!stack.isEmpty())
    	{int temp=(int) stack.pop();
    	sort(stack);
    	insert(stack, temp);
    	}
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer>stack =new Stack<>();
		stack.push(23);
		stack.push(12);
		stack.push(78);
		stack.push(2);
		stack.push(14);
        sort(stack);
        while(!stack.isEmpty())
        {
        	System.out.print(stack.pop()+" ");
        }
	}

}
