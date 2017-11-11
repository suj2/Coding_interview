package algorithms.SearchingAlgorithms;

public class FixedPoint {
	
	public int fixedbinaryPoint(int arr[], int l,int r)
	{
		if(l<= r)
		{
			int mid = l+ (r-l)/2; 
			if(arr[mid] == mid)
			{
				return mid; 
			}
			if(arr[mid]< mid)
				return fixedbinaryPoint(arr,mid+1, r); 
			if(arr[mid] > mid)
				return fixedbinaryPoint(arr,l, mid-1); 
		}
		return -1;
			
		
	}

	
	public static void main(String args[])
	{
		int arr[] = {-33,-23,-11,-3,0,3,5,6,83,9};
		FixedPoint f = new FixedPoint(); 
		System.out.println(f.fixedbinaryPoint(arr, 0, arr.length-1));
	}
}
