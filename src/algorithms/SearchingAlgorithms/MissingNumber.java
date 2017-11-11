package algorithms.SearchingAlgorithms;

public class MissingNumber {
	
	int sum1, sum2;

	public int BySum(int arr[], int n)
	{
		 sum2 = 0;; 
		 sum1 = ((arr.length+1)*((arr.length+1)+1))/2; 
		for(int i = 0; i < arr.length;i++)
		{
			
			sum2 += arr[i];
		}
		return sum1-sum2; 
	}
	
	public int ByXOR(int a[], int len)
	{
		sum1 = a[0];
		sum2 = 1;
		for(int i =1;i< len;i++)
		{
			sum1 =sum1^a[i]; 
		
		}
		
		for(int i = 2;i<=len+1;i++)
		
		{
			sum2 = sum2^i; 
			
		}
		return sum2-sum1;
	}
	public static void main(String args[])
	{
		int list[] = {1,3,4,6,7,9,2,5,10};
		MissingNumber m = new MissingNumber(); 
		int a = m.BySum(list,list.length);	
		int b = m.ByXOR(list,list.length);
		System.out.println("for sum method "+  a ); 
		System.out.println("By XOR method "+ b );
	
	}

}
