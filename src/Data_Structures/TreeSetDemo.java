package Data_Structures;

import java.util.*;
public class TreeSetDemo {

	public static void main(String args[])
	{
		TreeSet<Double> ts = new TreeSet<Double> (); 
		ts.add(434.343);
		ts.add(433.433);
		ts.add(677.77);
		ts.add(434.343);
		
	
	System.out.println("the contents of trrrset are " + ts);
	
	TreeSet<Boolean> t = new TreeSet<Boolean>();
	t.add(true); 
	t.add(false); 
	t.add(true); 
	t.add(true); 
	System.out.println("the contents of trrrset are " + t );
	System.out.println("the subset is " + ts.subSet(300.4, 499.3));
	}
}
