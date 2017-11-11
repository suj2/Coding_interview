package algorithms.SearchingAlgorithms;

import java.util.Arrays;
import java.util.Random;

public class LinearSearch {
	public int linearSearch(int arr[], int n, int x)
	{
		int i;
		for( i =0;i< x ;i++)
		{
			if(arr[i] == n)
			{
				return (i+1); 
			}
		}
		return -1;
	}
	
	public static void main(String args[])
	{
		int a[] = new int[20]; 
		LinearSearch ls = new LinearSearch(); 
		
		Random rand1 = new Random();
		for(int  i =0; i < 20;i++)
		{
			a[i] = rand1.nextInt(50)+1; 
		}
		
		Random rand = new Random();
		int ab = rand.nextInt(50)+1; 
		System.out.println(Arrays.toString(a));
		System.out.println(ab);
		System.out.println(ls.linearSearch(a, ab, 20));
	}

}
