import java.util.*;
public class SearchRowWiseColumnWiseSortedArray
{
    public static int[] search(int [][] mat, int t)
    {
        int r = 0;
        int c = mat.length - 1;
        while(r<mat.length && c>=0)
        {
            if(mat[r][c] == t)
                return new int[]{r,c};
            if(mat[r][c] < t)
                r++;
            else
                c--;
        }
        return new int[]{-1,-1};
    }
    public static void main(String args[])
    {
        int[][] arr = {{10,20,30,40},{11,25,35,45},{28,29,37,49},{33,34,38,50}};
        System.out.println(Arrays.toString(search(arr,29)));
    }
}
