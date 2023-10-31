public class lt96 {
    public int numTrees (int n){
            //1到i为节点组成的二叉搜索树的个数为dp[i]
            int[] dp = new int[n + 1];

            //初始化0个节点和1个节点的情况
            //空二叉树也是一种二叉树
            dp[0] = 1;
            dp[1] = 1;

            for (int i = 2; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    //一共i个节点，对于根节点j时,左子树的节点个数为j-1，右子树的节点个数为i-j
                    dp[i] += dp[j - 1] * dp[i - j];
                }
            }
            return dp[n];
    }

}
