public class twoPointers {
    public static boolean diffPairKExistsOrNot(int [] A, int K){
        int i = 1;
        int j = 0;
        while(i<A.length){
            if(A[i]-A[j]==K){
                return true;
            }
            else if(A[i]-A[j]>K){
                j++;
                if(i==j){
                    i++;
                }
            }
            else{
                i++;
            }
        }
        return false;
    
    }
    public static void main(String[] args) {
        int[] A = {-3,0,1,3,6,8,11,14,21,25};
        int K = 5;
        System.out.println(diffPairKExistsOrNot(A, K));
    }
}
