package recursion;

public class sumOfNumbers {

	
		// TODO Auto-generated method stub

		// static int sumNum = 0; 
		 public static int sum(int n)
		{
			if(n ==0) return n; 
			else 
			{
				
				 return n +sum(--n);
			}
		}
	


public static void main(String[] args) {

int a = sum(10); 
System.out.println(a); 
}

}
