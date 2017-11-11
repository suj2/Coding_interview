package algorithms.SearchingAlgorithms;
import java.util.Arrays;
import java.util.Random; 

public class recursiveSearch {

	public int recursiveSearching(int arr[], int n, int l,int r){
		
	
		
		if(l<r)
		{
			if(arr[l] == n)
			{
				return l+1; 
			}
			return recursiveSearching(arr, n,l+1,r); 
		}
		return -1;
		
		
	}
	public static void main(String args[])
	{
		Random rd = new Random(); 
		int array[] = new int[20];
		for(int i = 0;i< 20; i++)
		{
			array[i] = rd.nextInt(50)+1; 
		}
		int number = rd.nextInt(50)+1; 
		recursiveSearch rs = new recursiveSearch(); 
		System.out.println("the number to find is" + number);
		System.out.println(Arrays.toString(array));		
		System.out.println(rs.recursiveSearching(array,number,0, array.length-1));
		
	}
	
	
}
