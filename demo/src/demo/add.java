package demo;

public class add {

	
	public static void main(String args[])
	{
		int arr[]=new int[]{1,511,487};
		
		int sum=sumfun(arr);
		
		System.out.println("sum="+sum);
//	int	sum=arr[0]+arr[1]+arr[2];
//		System.out.println("sum="+sum);
		
		
	}

	private static int sumfun(int[] arr) {
		// TODO Auto-generated method stub
		
		int sum=arr[0]+arr[1]+arr[2];		
		return sum;
	}

	




	
	
	

	
	
}
