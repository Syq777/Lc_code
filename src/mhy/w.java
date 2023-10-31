import java.util.Scanner;

public class Main {
    static int res = Integer.MIN_VALUE;
    static int m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int sumA = 0, sumB = 0;

        // 读入数组a并计算其和
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sumA += a[i];
        }

        // 读入数组b并计算其和
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
            sumB += b[i];
        }

        // 计算最大异或值
        for (int i = 0; i < n; i++) {
            int t = (sumA - a[i]) ^ sumB;
            res = Math.max(res, t);
        }

        for (int i = 0; i < n; i++) {
            int t = (sumB - b[i]) ^ sumA;
            res = Math.max(res, t);
        }

        System.out.println(res);
    }
}