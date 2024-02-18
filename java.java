import java.util.*;
public class java{

    // public static int[] arrayArrange(int [] A){
    //     int n = A.length;
    //     int lastElement = A[n-1];
    //     int j = 0;
    //     for(int i=0; i<n-1; i++){
    //         if(A[i]<lastElement){ index i in 
    //             swap(A, i, j); //swap function banana pdega joh mujhe aata nhi h T_T
    //             j++;
    //         }
    //     }

    // }

    // public static int Kth_min(int[]A, int K){
    //     int min = Integer.MAX_VALUE;
    //     for(int i=0; i<K; i++){
            
    //     }
    // }



    // public static int magicIndex(int[]A){
    //     int start = 0;
    //     int end = A.length-1;
    //     int ans = -1;
    //     while(start<=end){
    //         int mid = start+(end-start)/2;
    //         if(A[mid]==mid){
    //             ans = mid;
    //         }
    //         if(A[mid]>mid){
    //             end = mid - 1;
    //         }
    //         if(A[mid]<mid){
    //             start = mid + 1;
    //         }
    //     }
    //     return ans;
    // }



    public static int mergesort(int [] A, int[] B){
        int median = -1;
        int n = A.length;
        int m = B.length;
        int sum = n+m;
        int a = (sum)/2;
        int [] ans = new int[n+m];
        int i=0, j=0, k=0;

        while(k<=a){
            if(A[i]<B[i]){
                ans[k]=A[i];
                i++;
                k++;
            }
            else{
                ans[k]=B[j];
                j++;
                k++;
            }
        }
        while(i<n){
            ans[k]=A[i];
            i++;
            k++;
        }
        while(j<m){
            ans[k]=B[j];
            j++;
            k++;
        }
        
        if(sum%2==0){

            median = (ans[a] + ans[a-1])/2;
        }
        else{
            median = ans[a];
        }
        return median;
    }


    public static void main(String[] args) {
        // Painter's partition problem:
        // Given N tasks &K workers A[N] time taken for each task. FInd min time in which all tasks can be done.
        // K=3

        // Q. Given an array. find the Kth min of the array.
        //     (A[k-1] in sorted array.)
        //     sc:O(1)
        //     Array can not be changed.

        // Q. Given an array A[N] & Q queries(L, R). FInd the minimum index i in the range(L, R) such that A[i] is a special no. 


        // Q. Given an array & a number K. Find the maximum length l, such that all subarrays of length l have sum <= Kor there is no subarray with a sum > K.
        


        // Q. Given a sorted array of distinct elements. Find any magic index.

        // Scanner scn = new Scanner(System.in);
        // int n = scn.nextInt();
        // int[] A = new int[n];
        // for(int i=0; i<n; i++){
        //     A[i]=scn.nextInt();
        // }
        // System.out.println(magicIndex(A));


        // Scanner scn = new Scanner(System.in);
        // // int n = scn.nextInt();
        // int[] A = {3, 5, 7, 10, 12};
        // // for(int i=0; i<n; i++){
        // //     A[i]=scn.nextInt();
        // // }

        // // int m = scn.nextInt();
        // int[] B = {1, 2, 8,10,11,13, 16};
        // // for(int j=0; j<m; j++){
        // //     B[j]=scn.nextInt();
        // // }          

        // System.out.println(mergesort(A, B));

        //Given an integer. Return the smallest good base.
        //Good base: the base in which N can be represented as all ones's

    }
}