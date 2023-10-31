public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), h = sc.nextInt();
        int[][] cards = new int[n][2];
        double[][] dp = new double[n + 1][n * 6 + 1];
        dp[0][0] = 1.0;

        for (int i = 0; i < n; i++) {
            cards[i][0] = sc.nextInt();
            cards[i][1] = sc.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            int t = cards[i - 1][0], x = cards[i - 1][1];
            for (int j = 0; j <= n * 6; j++) {
                dp[i][j] = dp[i - 1][j];
                if (t == 1 && j >= x) {
                    dp[i][j] += dp[i - 1][j - x];
                }
                if (t == 2) {
                    for (int k = 0; k <= j; k++) {
                        if (h - x - k <= 0) {
                            dp[i][j] -= dp[i - 1][j - k] / Math.pow(6, k);
                        }
                    }
                }
            }
        }

        double ans = 1.0;
        for (int j = 0; j <= n * 6; j++) {
            for (int k = 0; k <= j; k++) {
                if (h - k > 0) {
                    ans -= dp[n][j] / Math.pow(6, j) * dp[n][j - k] / Math.pow(6, j - k);
                }
            }
        }

        System.out.printf("%.4f\n", ans);
    }
}