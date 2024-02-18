import java.util.*;
public class mergeSort {

    // public static int[] mergeSortedArray(int[] A, int[] B){
    //     int n = A.length;
    //     int m = B.length;
    //     int [] ans = new int[n+m];
    //     int i=0, j=0,k=0;

    //     while(i<n && j<m){
    //         if(A[i]<B[j]){
    //             ans[k]=A[i];
    //             i++;
    //             k++;
    //         }
    //         else{
    //             ans[k]=B[j];
    //             j++;
    //             k++;
    //         }
    //     }
    //     while(i<n){
    //         ans[k]=A[i];
    //         i++;
    //         k++;
    //     }
    //     while(j<m){
    //         ans[k]=B[j];
    //         j++;
    //         k++;
    //     }
    //     return ans;

    // }


    // public static int[] merge(int [] A, int l, int h){
    //     if(l==h){
    //         int base[] = new int[1];
    //         base[0]=A[l];
    //         return base;
    //     }
    //     int mid = (l+h)/2;
    //     int left[] = merge(A, l, mid);
    //     int right[]= merge(A, mid+1, h);
    //     int [] ans = mergeSortedArray(left, right);
    //     return ans;
    // }


        public static int[] inversionSort(int [] leftarr, int[] rightarr){
            int n = leftarr.length;
            int m = rightarr.length;
            int [] ans = new int[n+m];

            int i=0, j=0, k=0;
            int count = 0;

            while(i<n && j<m){
                if(leftarr[i]>rightarr[j]){
                    count += n-i;
                    ans[k]=rightarr[j];
                    
                    j++;
                    k++;
                }
                else{
                    ans[k]=leftarr[i];
                    i++;
                    k++;
                }
            }
            while(i<n){
                ans[k]=leftarr[i];
                i++;
                k++;
            }
            while(j<m){
                ans[k] = rightarr[j];
                j++;
                k++;
            }
            
            return ans;
        }


        public static int[] arrBreak(int [] A, int l, int h){

            if(l==h){
                int base = A[l];
                return base;
            }

            int mid = (l+h)/2;
            int leftarr[] = arrBreak(A, l, mid);
            int rightarr[] = arrBreak(A, mid+1, h);
            int ans [] = inversionSort(leftarr, rightarr);
            return ans;
        }



    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int[]A = new int[n];
        for(int i=0; i<n; i++){
            A[i]=scn.nextInt();
        }


        //mergeSort
        // System.out.println(Arrays.toString(A));
        // int [] ans = merge(A, 0, n-1);
        // System.out.print(Arrays.toString(ans));


        //InversiionSort
        System.out.println(Arrays.toString(A));
        int [] ans = arrBreak(A, 0, n-1);
        System.out.print(Arrays.toString(ans));



    }
    
}
//merge sorting 