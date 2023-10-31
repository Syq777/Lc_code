package offer;

class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        // int cur = 1;
        int ans = 0;
        if(k<=1){
            return 0;
        }
        int n =  nums.length;
        for(int i = 0,j = 0,cur =1;i < n;i++){
            cur *= nums[i];
            while(cur >= k){
                cur /= nums[j++];
            }
            ans += i-j+1;
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int [] nums= {1,2,3,4};
        int k = 8;
        int res = solution.numSubarrayProductLessThanK(nums,k);
        System.out.println(res);
    }
}