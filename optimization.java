public class optimization {

    //Return the roe-wise prefix sum of matrix
    // public static int[][] rowPrefixSum(int[][] A){
    //     int n=A.length;
    //     int m = A[0].length;
    //     int[][] rowPS = new int[n][m];
    //     for(int i=0; i<n; i++){
    //         rowPS[i][0]=A[i][0];
    //         for(int j=0; j<m; j++){
    //             rowPS[i][j] = A[i][j] + rowPS[i][j-1];
    //         }
    //     }
    //     return rowPS;
    // }

    //Return the column-wise prefix sum of the matrix
    // public static int[][] colPrefixSum(int[][]A){
    //     int n = A.length;
    //     int m = A[0].length;
    //     int[][] colPS = new int[n][m];
    //     for(int j=0; j<m; j++){
    //         colPS[0][j] = A[0][j];
    //     }
    //     for(int i=1; i<n; i++){
    //         for(int j=0; j<m; j++){
    //             colPS[i][j] = A[i][j] + colPS[i-1][j];
    //         }
    //     }
    //     return colPS;
    // }


    // public static int[][] buildPSMatrix(int[][] A){
    //     int n=A.length;
    //     int m=A[0].length;
    //     int[][] PS = rowPrefixSum(A);
    //     PS = colPrefixSum(PS);
    //     return PS;
    // }



    //Given an Array. Return the maximum subarray sum
    public static int[] maxSubArray(int[]A){
        
    }
    public static void main(String[] args) {
        
    }
    
}
