package Data_Structures;

public class ComparatorUse implements Comparable<ComparatorUse> {

	int size; 
	String type; 
	
	ComparatorUse(int size, String type)
	{
		this.size = size; 
		this.type = type; 
		
	}
	
	public int getsize()
	{
		return size; 
	}
	public String gettype()
	{
		return type; 
	}
	
	@Override
	public int compareTo(ComparatorUse cc)
	{
		if(this.getsize()>cc.getsize())
		{
			return 1;
			
		}
		else if(this.getsize()<cc.getsize())
		{
			return -1;
		}
		else return 0; 
		
	}
	public static void main(String[] args) {
		ComparatorUse tv1 = new ComparatorUse(55, "Samsung");
		ComparatorUse tv2 = new ComparatorUse(55, "Sony");
 
		if (tv1.compareTo(tv2) > 0) {
			System.out.println(tv1.gettype() + " is better.");
		} else {
			System.out.println(tv2.gettype() + " is better.");
		}
	}
}
