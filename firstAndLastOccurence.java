class Solution {
    public int lastOccurence(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        while(start<=end){
            int mid = (start+end)/2;

            if(nums[mid]<=target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return end;
    }

    public int firstOccurence(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = (start+end)/2;

            if(nums[mid]>=target){
                end = end - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }

    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = firstOccurence(nums, target);
        ans[1] = lastOccurence(nums, target);

        if (ans[0] > ans[1] || nums[ans[0]] != target || nums[ans[1]] != target) {
            return new int[]{-1, -1};
        }
        
        return ans;
    }
}