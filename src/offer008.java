public class offer008 {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length, ans = n + 1, s = 0, left = 0;
        for (int right = 0; right < n; right ++) {
            s += nums[right];
            while (s >= target) {
                ans = Math.min(ans, right - left + 1);
                s -= nums[left++];
            }
        }
        return ans <= n ? ans : 0;
    }

    public static void main(String[] args) {
        int target = 7;
        int [] nums =  {2, 3, 1, 2, 4, 3};
        offer008 offer008  = new offer008();
        int result = offer008.minSubArrayLen(target,nums);
        System.out.println(result);
    }
}
