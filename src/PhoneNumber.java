//import java.util.List;
//
//class Solution {
//    public List<List<Integer>> combinationSum(int[] candidates, int target) {
//        //回溯法 无限制选取，选择完成之后立马false
//        //target的处理//
//        //步骤：
//        //空的话返回
//        int len = candidates.length;
//        Arrays.sort(candidates);
//        List<List<Integer>> res = new ArrayList<>();
//        Deque<Integer> path = new ArrayDeque<>();
//        if(len == 0){
//            return res;
//        }
//        //否则进栈（先进先出）
//        //回溯取 判断标准是target - candidates[i]
//        dfs(candidates,len,0,target,path,res);
//        return res;
//    }
//    private void dfs(int[] candidates,int len,int begin, int target, Deque<Integer> path,List<List<Integer>> res){
//        //这里怎么处理？
//        if(target == 0 ){
//            res.add(new ArrayList<>(path));
//        }
//        //循环遍历
//        for(int i = begin;i < len;i++){
//            if(target < 0){  //排序的用处
//                break;
//            }
//            path.addLast(candidates[i]);
//            //begin from ==i 可以重复
//            dfs(candidates,len,i,target-candidates[i],path,res);
//            path.removeLast();
//        }
//    }
//}
