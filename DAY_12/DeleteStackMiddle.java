import java.util.Stack;
public class DeleteMiddleStack {
    public static void del(Stack stack, int n, int i)
    {
      	if(stack.isEmpty()||i==n)
      		return;
      	
      	int temp=(int)stack.pop();
      	//stack.pop();
      	del(stack,n,i+1);
      	if(i!=n/2)
      	stack.push(temp);
       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack=new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		//stack.push(7);
		//stack.push(8);
		del(stack, stack.size(), 0);
		for(int i=0;i<5;i++)
		{
			System.out.print(stack.pop()+" ");
		}

	}

}
