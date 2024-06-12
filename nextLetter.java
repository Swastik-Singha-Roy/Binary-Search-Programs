import java.util.*;
public class nextLetter
{
    public static void main(String args[])
    {
        char[] arr = {'c','d','f','k'};
        System.out.println(arr[letter(arr,'k')]);
    }
    public static int letter(char[] arr, char target)
    {
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
        return start%arr.length;
    }
}
