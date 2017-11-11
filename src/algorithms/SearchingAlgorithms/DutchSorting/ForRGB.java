package algorithms.SearchingAlgorithms.DutchSorting;

public   class ForRGB {

        static char[] rgbSort(char[] arr)
        {
            int l =0, mid = 0, r = arr.length -1;
            char temp;
            while(mid<= r)
            {
                switch(arr[mid])
                {
                    case 'R':
                    {
                        temp = arr[l];
                        arr[l] = arr[mid];
                        arr[mid] = temp;
                        l++;
                        mid++;
                        break;

                    }
                    case 'G':
                    {
                        mid++;
                        break;
                    }
                    case 'B':
                    {
                        temp = arr[mid];
                        arr[mid] = arr[r];
                        arr[r] = temp;
                        r--;

                        break;
                    }
                }
            }

            return arr;

        }


    public static void main(String args[])
    {
        char list[] = new char[]{'R','R','B','G','G','R','B','R','B','G'};
        char ret[];
        ret = rgbSort(list);
        for(char g :ret)
        {
            System.out.print(g  + " ");
        }
    }
}
