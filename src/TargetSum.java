public class TargetSum {
    int count =0;
    public int findTargetSumWays(int[] nums, int target) {
        //边界
        if(nums.length == 0){
            return 0;
        }
        dfs(nums,target,0,0);
        return count;
    }

    private void dfs(int[] nums, int target, int index, int sum) {
        if(index == nums.length){
            if(sum == target){
                count++;
            }
        }
        else{
            dfs(nums,target,index+1,sum + nums[index]);
            dfs(nums,target,index+1,sum - nums[index]);
        }
    }
}
