import java.util.*;


// public class Solution {
//     /**
//      * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
//      *
//      * 
//      * @param s1 string字符串 
//      * @param s2 string字符串 
//      * @return int整型
//      */
//     public int minDeleteSum (String s1, String s2) {
//         // write code here
//     }
// }
public class lc12 {
    // public static void main(String[] args) {
    //     String s1 = "sea";
    //     String s2 = "eat";
    //     System.out.println(minimumDeleteSum(s1, s2));
    // }

    public static int minimumDeleteSum(String s1, String s2) {
        int m = s1.length(), n = s2.length();
        int[][] dp = new int[m + 1][n + 1];

        // 初始化第一行和第一列
        for (int i = 1; i <= m; i++) {
            dp[i][0] = dp[i - 1][0] + s1.charAt(i - 1);
        }
        for (int j = 1; j <= n; j++) {
            dp[0][j] = dp[0][j - 1] + s2.charAt(j - 1);
        }

        // 填充 DP 表格
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j] + s1.charAt(i - 1), dp[i][j - 1] + s2.charAt(j - 1));
                }
            }
        }
        return dp[m][n];
    }
}