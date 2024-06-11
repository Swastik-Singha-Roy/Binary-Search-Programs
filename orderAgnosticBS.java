import java.util.*;
public class orderAgnosticBS
{
    public static void main(String args[]) {
        int[] arr = {10,9,8,7,6,5,4,3,2,1,0};
        int target = 10;
        System.out.println(BS(arr,target));
    }
    public static int BS(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while(start<=end)
        {
            int mid = start + (end - start)/2;
            if(isAsc)
            {
                if(target>arr[mid])
                    start = mid + 1;
                else if(target<arr[mid])
                    end = mid - 1;
                else
                    return mid;
            }
            else
            {
                if(target>arr[mid])
                    end = mid - 1;
                else if(target<arr[mid])
                    start = mid + 1;
                else
                    return mid;
            }
        }
        return -1;
    }
}
