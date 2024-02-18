public class BinarySearchRemedial {
    // public static boolean binarysearch(int[]A, int target){
    //     int start = 0;
    //     int end = A.length-1;
    //     while(start<=end){
    //         int mid = (start+end)/2;
    //         if(A[mid]==target){
    //             return true;
    //         }
    //         if(A[mid]<target){
    //             start=mid+1;
    //         }
    //         if(A[mid]>target){
    //             end = mid-1;
    //         }
            
    //     }
    //     return false;
    // }


    // public static boolean descendingOrderBinarySearch(int[] A, int target){
    //     int start = 0;
    //     int end = A.length-1;
    //     while(start<=end){
    //         int mid = (start+end)/2;
    //         if(A[mid]==target){
    //             return true;
    //         }
    //         if(A[mid]<target){
    //             end= mid -1;
    //         }
    //         if(A[mid]>target){
    //             start=mid+1;
    //         }
    //     }
    //     return false;
    // }



    // public static int leadingTruesTrailingFalse(String A){
    //     int start = 0;
    //     int end = A.length()-1;
    //     int ans = -1;
    //     while(start<=end){
    //         int mid= (start+end)/2;
    //         if(A.charAt(mid)=='T'){
    //             ans = mid;
    //             start = mid+1;
    //         }
    //         if(A.charAt(mid)=='F'){
    //             end = mid-1;
    //         }
    //     }
    //     return ans;
    // }


    // public static int maxElementSmallerThanTarget(int[] A, int target){
    //     int start = 0;
    //     int end = A.length-1;
    //     int ans = -1;
    //     while(start<=end){
    //         int mid = (start+end)/2;
    //         if(A[mid]==target){
    //             return A[mid];
    //         }
    //         if(A[mid]>target){
    //             end = mid-1;
    //         }
    //         if(A[mid]<target){
    //             ans = A[mid];
    //             start = mid+1;
    //         }
    //     }
    //     return ans;
    // }


    // public static int SmallestIndexElementOccursOn(int[]A, int target){
    //     int start = 0;
    //     int end = A.length-1;
    //     int ans = -1;
    //     while(start<=end){
    //         int mid = (start+end)/2;

    //         if(A[mid]>=target){
    //             if(A[mid] == target) {
    //                 ans = mid;
    //             }
    //             end = mid -1;
    //         }
    //         else{
    //             start = mid + 1;
    //         }
    //     }
    //     return ans;
    // }


    // public int GreatestIndexELementOccursOn(int[]A, int B){
    //     int start = 0;
    //     int end = A.length-1;
    //     int ans = -1;

    //     while(start<=end){
    //         int mid = (start+end)/2;

    //         if(A[mid]<=B){
    //             if(A[mid]==B){
    //                 ans=mid;
    //             }
    //             start = mid + 1;
    //         }
    //         else{
    //             end = mid - 1;
    //         }
    //     }
    //     return ans;
    // }

    // public static int frequency(int[]A, int B){
    //     int l = SmallestIndexElementOccursOn(A, B);
    //     int r = GreatestIndexELementOccursOn(A, B);
    //     int ans = r-l+1;
    //     return ans;
    // }


    public static void main(String[] args) {
        //Binary Search
        // int [] A = {1,2,2,3,4,4,5,6,7,8};
        // int target = 2;
        // System.out.println(binarysearch(A, target));
        
        //Descending Binary Search
        // int target = 2;
        // int [] A ={10,9,9,8,7,6,5,5,4,3,2,2,1};
        // System.out.println(descendingOrderBinarySearch(A, target));



        //LeadingTruesTreailingFalse
        // String A = "TTTTTTTFFFFFFFF";
        // System.out.println(leadingTruesTrailingFalse(A));


        //maxElementSmallerThanTarget or floor value
        // int [] A = {1,2,3,4,4,4,4,5,6,7,7,7,7,7,9};
        // int target = 8;
        // System.out.println(maxElementSmallerThanTarget(A, target));



        // SmallestIndexElementOccursOn
        // int [] A = {1,2,2,2,4,5,6,7,7,7,7,8,9};
        // int target = 10;
        // System.out.println(SmallestIndexElementOccursOn(A, target));
    }
    
}
