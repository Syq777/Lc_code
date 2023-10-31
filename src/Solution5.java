public class Solution5 {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = 1;
        int res = 1;
        for(int i = 1;i < n;i++){
            dp[i] = 1;
            for(int j = i-1;j >= 0;j--){  //从i往前找
                if(nums[j]< nums[i]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
            res = Math.max(dp[i],res);
        }

        return res;
    }


    public static void main(String[] args) {
        int []nums = {3,5,2,7,8,5};
        Solution5 solution5 = new Solution5();
        int res = solution5.lengthOfLIS(nums);
        System.out.println(res);
    }
}
