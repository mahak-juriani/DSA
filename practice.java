public class practice {
    // public static int ElementOccursOnce(int [] A){
    //     Arrays.sort(A);
    //     int start = 0;
    //     int end = A.length-1;
    //     int ans = -1;
    //     while(start<=end){
    //         int mid = (start+end)/2;
    //         if(mid%2==0){
    //             if(A[mid]==A[mid+1]){
    //                 start = mid+1;
    //             }
    //             else if(A[mid]!=A[mid+1] && A[mid]==A[mid-1]){
    //                 end = mid-1;
    //             }
    //             else{
    //                 ans = A[mid];
    //             }
    //         }
    //         else{
    //             mid++;
    //         }
    //     }
    //     return ans;
    // }

    // public static int ElementOccursOnce(int[]A){
    //     int ans = 0;
    //     for(int i=0; i<A.length; i++){
    //         ans ^= A[i];
    //     }
    //     return ans;
    // }

    // public static int[] swapTheNos(int A, int B){
    //     int [] ans = new int[2];
    //     A = A^B;
    //     B = A^B;
    //     A = A^B;
    //     ans[0]=A;
    //     ans[1]=B;   
    //     return ans;
    // }



    // public static int XORofNnums(int N){
    //     int ans = 0;
    //     for(int i=1; i<=N; i++){
    //         ans ^= i;
    //     }
    //     return ans;
    // }


    // public static int XORofRange(int l, int r){
    //     int ans = 0;
    //     for(int i=l; i<=r; i++){
    //         ans ^= i;
    //     }
    //     return ans;
    // }

    
    // public static int numEvenOrOdd(int N){
    //     if((N&1)==0){
    //         return 0;
    //     }
    //     else{
    //         return 1;
    //     }
    // }


    // public static int checkBit(int N, int i){
    //     if((N&(1<<i))!=0){
    //         return 1;
    //     }
    //     else{
    //         return 0;
    //     }
    // }


    // public static int setBit(int A, int i){
    //     return (A^(1<<i));
    // }


    // public static int removeLastSetBit(int A){
    //     for(int i=0; i<32; i++){
    //         if((A&(1<<i))!=0){
    //             A = (A^(1<<i));
    //             break;
    //         }
    //     }
    //     return A;
    // }


    // public static String isPowerOf2(int N){
    //     if((N & (N-1))==0){
    //         return "Yes";
    //     }
    //     else{
    //         return "No";
    //     }
    // }

    // public static int setBitCount(int N){
    //     int count = 0;
    //     int i=0;
    //     while(i<32){
    //         if((N&(1<<i))!=0){
    //             count++;
    //             i++;
    //         }
    //         else{
    //             i++;
    //         }
    //     }
    //     return count;
    // }
    
    public static int checkBit(int xor){
        int count = 0;
        while(xor){
            if((xor&1)==1){
                break;
            }
            count++;
            xor = (xor>>1);
        }
        return count;
    }

    public static int twoElementsOccurOnce(int[] A){
        
        int xor = 0;
        for(int i=0; i<A.length; i++){
            xor ^= A[i];
        }
        int count = (checkBit(xor));

        int xor1 = 0;
        int xor2 = 0;

        for(int i=0; i<A.length; i++){
            if((A[i] & (1<<count))==1){
                xor1 ^= A[i];
            }
            else{
                xor2 ^= A[i];
            }
        }
        System.out.println(xor1);
        System.out.println(xor2);
        return -1;
      
    }
    public static void main(String[] args) {
        // int [] A = {10,2,3,3,10,2,5,5,4,9,8,8,4};
        // System.out.println(ElementOccursOnce(A));

        // int A = 10;
        // int B = 19;
        // System.out.println(swapTheNos(A, B));

        // int N = 5;
        // System.out.println(XORofNnums(N));

        // int l = 2;
        // int r = 4;
        // System.out.println(XORofRange(l, r));

        // int N = 10;
        // System.out.println(numEvenOrOdd(N));


        // int N = 10;
        // int i = 2;
        // System.out.println(checkBit(N, i));


        // int A = 10;
        // int i = 3;
        // System.out.println(setBit(A, i));

        // int A = 10;
        // System.out.println(removeLastSetBit(A));

        // int N = 15;
        // System.out.println(isPowerOf2(N));

        // int N = 11;
        // System.out.println(setBitCount(N));

        int [] A = {1,1,5,4,4,2,2,7,3,3,};
        System.out.println(twoElementsOccurOnce(A));
    }
    
}
