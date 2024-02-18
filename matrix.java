import java.util.Scanner;

public class matrix {

            // public static void printMatrix(int[][] A){
            //     int rows = A.length;
            //     int cols = A.length;
            //     for(int i=0; i<rows; i++){
            //         for(int j=0; j<cols; j++){
            //             System.out.print(A[i][j] + " ");
            //         }
            //         System.out.println();
            //     }
            // }

            // public static void summationOfRows(int[][]A){
            //     int rows= A.length;
            //     int cols= A[0].length;
            //     for(int i=0; i<rows; i++){
            //         int sum = 0;
            //         for(int j=0; j<cols; j++){
            //             sum = sum + A[i][j];
            //         }
            //     System.out.println(sum);       
            //     }
            // }

            // public static void reverseMatrix(int [] [] A){
            //     int rows = A.length;
            //     int cols = A[0].length;
            //     for(int i=rows-1; i>=0;i--){
            //     for(int j=cols-1; j>=0; j--){
            //         System.out.print(A[i][j] + " ");
            //     }
            //     System.out.println();
            // }
            // }


            //return the matrix A+B
            // public static int[][] add(int [][]A, int[][]B){
            //     if(A.length!=B.length){
            //         throw new RuntimeException("DimensionError: can't add matrices with unequal dimensions");
            //     }
            //     int n = A.length;
            //     int m = A[0].length;
            //     int [][] C= new int [n][m];
            //     for(int i=0; i<n; i++){
            //         for(int j=0; j<m; j++){
            //             C[i][j]=A[i][j]+B[i][j];
            //         }
            //     }
            //     return C;
            // }

            //Given a square matrix. Print all the diagonal elements.
            // public static void printDiagonal(int [][]A){
            //     int N = A.length;
            //     // int M = A[0].length;
            //     // for(int i=0; i<N; i++){
            //     //     for(int j = 0; j<=i; j++){
            //     //         if(j==i){
            //     //             System.out.print(A[i][j]+" ");
            //     //         }
            //     //     }
            //     // }

            //     //Or:
            //     for(int i=0; i<N; i++){
            //         System.out.print(A[i][i]+" ");
            //     }
            // }

            // For printing the other diagonal:
            // public static void antiDiagonal(int [][] A){
            //     int i=0, j=A.length-1;
            //     while(j>=0 && i<A.length){
            //         System.out.println(A[i][j]);
            //         i++;
            //         j--;
            //     }
            // }

                //For transposing a matrix:
                // public static void transpose(int [][] A){
                // int N = A.length;
                // for(int i=0; i<N; i++){
                //     for(int j=0; j<N; j++){
                //         System.out.print(A[j][i]+" ");
                //     }
                //     System.out.println();
                // }

                    //Method 2:
                    // for(int i=0; i<A.length; i++){
                    //     for(int j = i+1; j<A.length; j++){
                    //         int  temp = A[i][j];
                    //         A[i][j] = A[j][i];
                    //         A[j][i] = temp;
                    //     }
                    // }
                // }


                // public static void Diagonals(int [][]A, int i, int j){
                //     int rows = A.length;
                //     int cols = A[0].length;
                //     while(i<rows && j<cols){
                //         System.out.print(A[i][j]+" ");
                //         i++;
                //         j++;
                //     }
                // }
    public static void main(String[] args) {
        // Scanner scn = new Scanner(System.in);
        // int rows=4, cols=4;
        // int [][] marks = new int[rows][cols];
        
        // for(int i=0; i<rows; i++){
        //     for(int j=0; j<cols; j++){
        //         marks[i][j] = scn.nextInt();
        //     }
        // }
        // printMatrix(marks);


        // For transposing the matrix:
        // Scanner scn = new Scanner(System.in);
        // int rows=4, cols=4;
        // int [][] marks = new int[rows][cols];
        
        // for(int j=0; j<cols; j++){
        //     for(int i=0; i<rows; i++){
        //         marks[i][j] = scn.nextInt();
        //     }
        // }
        // printMatrix(marks);

        // Scanner scn = new Scanner(System.in);
        // int rows = scn.nextInt();
        // int cols = scn.nextInt();
        // int [][] Matrix = new int[rows][cols];

        // for(int i=0; i<rows; i++){
        //     for(int j=0; j<cols; j++){
        //         Matrix[i][j] = scn.nextInt();
        //     }
        // }

        // to print the max value of the elementt from the matrix
        // int max = Matrix[0][0];
        // for(int i=0; i<rows; i++){
        //     for(int j=0; j<cols; j++){
        //         if (Matrix[i][j]>max){
        //             max=Matrix[i][j];
        //         }
        //     }
        // }
        // System.out.println(max);

        // to print the summation of the matrix
        // int sum = 0;
        // for(int i=0; i<rows; i++){
        //     for(int j=0; j<cols; j++){
        //         sum = sum + Matrix[i][j];
        //     }
        // }
        // System.out.println(sum);
        
        // Write a function which returns the summation of the rows
        // for(int i=0; i<rows; i++){
        //     int sum = 0;
        //     for(int j=0; j<cols; j++){
        //         sum = sum + Matrix[i][j];
        //     }
        //     System.out.println(sum);
        // }

        // summationOfRows(Matrix);

        // To print the matrix in the reverse order
        // for(int i=rows-1; i>=0;i--){
        //     for(int j=cols-1; j>=0; j--){
        //         System.out.print(Matrix[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        //add
        // add(new int[][]{
        //     {1,2,3},
        //     {3,4,5},
        //     {7,8,9}}, new int[][]{
        //         {10,20,30},
        //         {40,50,60},
        //         {70,80,90}}
        // );

        // Scanner scn = new Scanner(System.in);
        // int N = scn.nextInt();
        // int [][] A = new int[N][N];
        // for(int i=0; i<N; i++){
        //     for(int j=0; j<N; j++){
        //         A[i][j]=scn.nextInt();
        //     }
        // }
        // printDiagonal(A);
        // antiDiagonal(A);
        // transpose(A);
    }

    
}
