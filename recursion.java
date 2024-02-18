import java.util.Scanner;

// public static void recursionFunc(int []N, int i){

//     if(i==N.length)    return;

//     System.out.print(N[i]);
//     recursionFunc(N, i + 1);
// }







public class recursion {

// public static void sumOfDigits(int A, int sum){
//     if(A<=0){
//         System.out.print(sum);
//         return; 
//     }
//     int rem = A%10;
//     sum += rem;
//     sumOfDigits(A/10, sum);
// }


    // public static void isPalindrome(String A, int i, String reverse){
    //     if(i<0){
    //         if(A.equals(reverse)){
    //             System.out.print("True");
    //             return;
    //         }
    //         else{
    //             System.out.print("False");
    //             return;
    //         }
    //     }
    //     reverse += A.charAt(i);   
    //     isPalindrome(A, i-1, reverse);

    //     } 



    //COunt the no. of noble integers in an array of distinct elements
    //Nobel integer: A[i] is nobel integer if, count of elements smaller than A[i]==A[i];
    // public static int nobelInteger(int [] A){
          
    // }


    //In the given array check for the adjacent numbers if the first one is greater than the second number then swap them.
    public static int[] swapping(int [] A{
        int [] ans = new int[A.length];
        for(int j=0; j<A.length; j++)   
        {
            for(int i=0; i<A.length-1; i++){
                if(A[i]>A[i+1]){
                    ans[i]=A[i+1];
                    ans[i+1]=A[i];
                }
                else{
                    ans[i]=A[i];
                }
            }
        }
        return ans;


    }




    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // int A = scn.nextInt();
        // int sum = 0;
        // sumOfDigits(A, sum);


        // String A = scn.next();
        // int i = A.length()-1;
        // String reverse = "";
        // isPalindrome(A, i,reverse);


        int N = scn.nextInt();
        int [] A = new int[N];
        for(int i=0; i<N; i++){
            A[i]=scn.nextInt();
        } 
        swapping(A);



    }
    
}

