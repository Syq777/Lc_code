import java.util.List;

class Solution4 {
    int count = 0;

    public int findTargetSumWays(int[] nums, int target) {
        backtrack(nums, target, 0, 0);
        return count;
    }

    public void backtrack(int[] nums, int target, int index, int sum) {
        if (index == nums.length) {
            if (sum == target) {
                count++;
            }
        } else {
            backtrack(nums, target, index + 1, sum + nums[index]);
            backtrack(nums, target, index + 1, sum - nums[index]);
        }
    }

    public static void main(String[] args) {
        int []nums = {1,1,1,1,1};
        int target = 3;
        Solution4 solution4 = new Solution4();
        int count = solution4.findTargetSumWays(nums,target);
        System.out.println(count);

    }
}