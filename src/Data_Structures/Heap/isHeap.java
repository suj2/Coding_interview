package Data_Structures.Heap;

public class isHeap {


boolean isHeapCheck(int a[], int l, int h)
{

    if(l> (h-2)/2)
    {
        return true;
    }
    if(a[l] > a[2*l+1] && a[l] > a[2*l+2] && isHeapCheck(a,2*l+1,h) && isHeapCheck(a,2*l+2,h))
    {
        return true;
    }
return false;
}

boolean iterativeMethod (int a[], int h)
{
    for(int i = 0; i <= (h-2)/2; i++)
    {
        if(a[i] < a[2*i+1])
            return false;
        if(a[i] < a[2*i+2])
            return false;
    }
    return true;
}
    public static void main(String args[])
    {
        int[] arr = new int[]{89,55,11,43,22,13};
        isHeap i = new isHeap();

        boolean t = i.isHeapCheck(arr, 0, arr.length-1);
        boolean l = i.iterativeMethod(arr,arr.length-1);
        System.out.println("Using recursive method "+ t);
        System.out.println("Using iteravtive method " + l );



    }
}
