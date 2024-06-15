import java.util.*;
public class mountainPeakBS
{
    public static void main(String args[])
    {
        int[] arr = {1,2,3,4,6,8,4,3,2,1,0};
        System.out.println(arr[getPeakIndex(arr)]);
    }
    public static int getPeakIndex(int[] arr)
    {
        int s = 0;
        int e = arr.length - 1;
        while(s<e)
        {
            int mid = s + (e - s)/2;
            if(arr[mid] > arr[mid + 1])
                e = mid;
            else
                s = mid + 1;
        }
        return s;
    }
}
