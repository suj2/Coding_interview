package Data_Structures;
import java.util.*;

public class ArrayListDemo {
	public static void main(String args[])
	{
		ArrayList<String> b  = new ArrayList<String>();
		b.add("h");;
		ArrayList<String> a1 = new ArrayList<String>(); 
		System.out.println("the size of array is "+ a1.size());
		a1.add("S");
		a1.add("d");
		a1.add(1,"l");
		System.out.println("Content of list is" + a1);
		System.out.println("the size of array is "+ a1.size());
		a1.remove(2); 
		a1.remove(1);
		System.out.println("Content of list is" + a1);
		System.out.println("the size of array is "+ a1.size());
 
 
	}
}
