import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class TotalSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target){
     //预处理
        List<List<Integer>> res = new ArrayList<>();
        Deque<Integer> path = new ArrayDeque<>();
        //边界
        int len = candidates.length;
        if(len == 0){
            return res;
        }
        //否则进栈
        //判断  target-candidates[i] == 0
        dfs(candidates,len,0,target,path,res);
        return res;
    }

    private void dfs(int[] candidates, int len, int begin, int target, Deque<Integer> path, List<List<Integer>> res) {
    //结束
        if(target == 0){
            res.add(new ArrayList<>(path));
        }
        for (int i = begin; i < len; i++) {
            if(target < 0){
                break;
            }
            path.addLast(candidates[i]);
            //begin == i 保证可以重复
            dfs(candidates,len,i,target-candidates[i],path,res);
            path.removeLast();
        }


    }
}
