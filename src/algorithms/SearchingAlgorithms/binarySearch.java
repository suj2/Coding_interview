package algorithms.SearchingAlgorithms;


import java.util.Arrays;
//import java.util.Random; 
public class binarySearch {
	
 public int binarySearchMethod(int arr[], int num, int l, int r)
 {
	if(l<=r)
	{
		int mid =(l+ (r))/2; 
		System.out.println(mid);
		if( arr[mid] > num)
		{
			r = mid-1;
			return binarySearchMethod(arr,num,l,r); 
			
		}
		else if(arr[mid] < num)
		{
			l = mid+1; 
			 return binarySearchMethod(arr,num,l,r); 
		}
		else if(arr[mid] == num)
		{
			return mid+1; 
		}
		
	}
	return -1;
 }
 
 
 public static void main(String args[])
 {
	 int arr[] = {2,45,54,50,62,78,85,87,89,90,99,800,776,9090};
	 
	
	 int num = 50;
	 System.out.println(Arrays.toString(arr));
	 System.out.println(num);
	 binarySearch bs = new binarySearch(); 
	 System.out.println(arr.length);
	 System.out.println("the binary search result is"+bs.binarySearchMethod(arr, num, 0, arr.length));
	 
 }

}

