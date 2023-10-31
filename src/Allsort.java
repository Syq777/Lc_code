import java.util.*;

public class Allsort {
    //全排列
    //预处理 定义：返回形式、中间变量、边界条件
    public List<List<Integer>> permute(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
       if(len == 0){
           return res;
       }
       Deque<Integer> path = new ArrayDeque<>();
       boolean[] used = new boolean[len];
       dfs(nums,len,0,path,used,res);
       return res ;
     }

    private void dfs(int[] nums, int len, int depth, Deque<Integer> path, boolean[] used, List<List<Integer>> res) {
    //jieshu
        if(depth == len){
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < len; i++) {
            if(used[i]){
                continue;
            }
            //剪枝
            if( i >0 &&nums[i] == nums[i-1] && used[i-1] ==false){
                continue;
            }
            path.addLast(nums[i]);
            used[i] = true;
            dfs(nums,len,depth+1,path,used,res);
            path.removeLast();
            used[i] =false;
        }
    }
}
