//import java.util.*;
//
//public class Solution {
//    /**
//     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
//     *
//     * 根据输入计算最大收益
//     * @param M double浮点型 初始资金
//     * @param N int整型 历史价格天数
//     * @param historyPrices double浮点型一维数组 N天历史价格
//     * @param K int整型 最大允许交易次数
//     * @return double浮点型
//     */
//    public double get_max_profit (double M, int N, double[] historyPrices, int K) {
//        // 初始化动态规划表
//        double[][] dp = new double[K + 1][N];
//
//        // 遍历交易次数
//        for (int k = 1; k <= K; k++) {
//            double maxDifference = -historyPrices[0];
//            // 遍历天数
//            for (int n = 1; n < N; n++) {
//                // 计算最大收益
//                dp[k][n] = Math.max(dp[k][n - 1], historyPrices[n] + maxDifference);
//                maxDifference = Math.max(maxDifference, dp[k - 1][n] - historyPrices[n]);
//            }
//        }
//
//        // 计算最大收益
//        double maxProfit = dp[K][N - 1];
//        // 计算最初的股票数量
//        double initialStocks = M / historyPrices[0];
//        // 计算最终资产
//        double finalAmount = M + maxProfit * initialStocks;
//
//        // 返回最终资产与初始资金之间的差额
//        return finalAmount - M;
//    }
//}
