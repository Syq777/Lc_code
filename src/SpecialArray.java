public class SpecialArray {
    public static void main(String[] args) {
        int n = 5; // 长度
        int a = 1; // 第一个元素
        int b = 15; // 最后一个元素
        findSpecialArray(n, a, b);
    }

    public static void findSpecialArray(int n, int a, int b) {
        // 计算最小的差值和
        int minDiffSum = n * (n - 1) / 2;  // 等差数列求和公式：(n-1) * n / 2
        // 计算数组元素之间应有的总差值
        int totalDiff = b - a;
        if (totalDiff < minDiffSum) {
            System.out.println("没有找到这样的特殊数组");
            return;
        }

        int[] X = new int[n];
        int[] Y = new int[n-1];
        X[0] = a;
        X[n-1] = b;

        int remainingDiff = totalDiff - minDiffSum;
        int curDiff = n - 1;

        for (int i = 0; i < n - 1; ++i) {
            Y[i] = curDiff;
            if (remainingDiff > 0) {
                int add = Math.min(remainingDiff, 1);  // 只能每次增加1以保证Y是递减的
                Y[i] += add;
                remainingDiff -= add;
            }
            curDiff--;
        }

        for (int i = 1; i < n - 1; ++i) {
            X[i] = X[i-1] + Y[i-1];
        }

        // 输出结果
        System.out.print("特殊数组X: ");
        for (int num : X) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("特殊数组Y: ");
        for (int num : Y) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
