import java.util.Arrays;

public class rowColMatrix{
    public static int[] search(int[][] A, int target){
        int r = 0;
        int c = A[0].length-1;
        while(r<A.length && c>=0){
            if(A[r][c]==target){
                return new int[]{r, c};
            }
            else if(A[r][c]>target){
                c--;
            }
            else if(A[r][c]<target){
                r++;
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int [][] A = {
            {10,20,30,40},
            {15,25,35,45},
            {28,29,37,49},
            {33,34,38,50}
        };
        int target = 37;
        System.out.println(Arrays.toString(search(A, target)));
    }
} 