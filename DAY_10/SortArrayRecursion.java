public class SortArray {
public static void insert(int arr[], int n, int temp)
{
	if(n<0 || temp>=arr[n])
		{ arr[n+1]=temp;
		  return;
		}
	int val=arr[n];
	insert(arr,n-1,temp);
	arr[n+1]=val;
}
public static void sort(int arr[], int n)
{
	if(n<0)
		return;
	int temp=arr[n+1];
	sort(arr,n-1);
	insert(arr,n,temp);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {0,5,4,2,6};
		sort(a,3);
		for(int i=0;i<5;i++)
		System.out.print(a[i]+" ");
}

}
