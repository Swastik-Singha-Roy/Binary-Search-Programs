import java.util.*;
public class Matrix2dBS
{
    public static void main(String args[])
    {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(Arrays.toString(BSin2D(arr,7)));
    }
    public static int[] BSin2D(int[][] mat, int t)
    {
        int rows = mat.length;
        int cols = mat[0].length;
        int left = 0;
        int right = rows*cols - 1;
        while(left<=right)
        {
            int mid = left + (right - left) / 2;
            int midValue = mat[mid/cols][mid%cols];
            if(midValue==t)
                return new int[]{mid/cols,mid%cols};
            if(midValue<t)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return new int[]{-1,-1};
    }
}
