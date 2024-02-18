class Solution {
    public int mySqrt(int x) {
        if(x == 0){
            return x;
        }

        long start = 1;
        long end = x;
        long ans = -1;

        while(start<=end){
            long mid = (start+end)/2;
            long square = mid*mid;

            if(square == x){
                return (int)mid;
            }
            else if(square<x){
                ans = mid;
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return (int)ans;
    }
}