package algorithms.SearchingAlgorithms;

public class PivotedBinarySearch {

	public int BinarySearch(int arr[], int num, int l, int r )
	{
		if(l>r)
			return -1; 
		int mid = (l+r)/2 ; 
		if(arr[mid] == num)
			return mid+1;
		if(arr[mid] > num)
		{
			if(arr[l] <=num && arr[mid] >=num)
			{
				return BinarySearch(arr,num,l, mid-1); 
			}
			else return BinarySearch(arr,num,mid+1, r); 
		}
		
		if(arr[mid]<num)
		{
			if(arr[mid]<=num && arr[r] >= num)
			{
				return BinarySearch(arr, num, mid+1, r); 
				
			}
			return BinarySearch(arr,num, l , mid-1); 
		}
		return -1; 
	}
	
	public static void main(String args[])
	{
		int list[] = {3,4,5,6,7,1,2}; 
		PivotedBinarySearch bs = new PivotedBinarySearch();
		
		System.out.println("the position is " + bs.BinarySearch(list,3,0, list.length-1));
		return ; 
	}
	
}
