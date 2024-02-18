import java.util.Scanner;
class Solution {
    public static int[] productExceptSelf(int[] nums) {
        int N = nums.length;
        int [] answer = new int[N];
        for(int j=0; j<N; j++){
            int product = 0;
            for(int i=0; i<N; i++){
                product *= nums[i];
            }
            product = product/nums[j];
            answer[j] = product;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int [] nums = new int[N];
        for(int i=0; i<N; i++){
            nums[i]=scn.nextInt();
        }
        System.out.print(productExceptSelf(nums));
    }

}

