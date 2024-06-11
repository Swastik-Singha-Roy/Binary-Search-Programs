import java.util.*;
public class floorAndCeilOfANumberUsingBS
{
    public static void main(String args[])
    {
        int[] arr = {1,2,4,5,6,7,8,10,13,15,16};
        int Ceil = arr[floorCeil(arr,14,true)];
        int Floor = arr[floorCeil(arr,14,false)];
        System.out.println(Ceil + " " + Floor);
    }
    public static int floorCeil(int[] arr, int target, boolean isCeil)
    {
        if(target>arr[arr.length - 1])
            return -1;
        int start = 0;
        int end = arr.length - 1;
        while(start<=end)
        {
            int mid = start + (end - start)/2;
            if(target<arr[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        if(isCeil)
            return start;
        else
            return end;
    }
}
