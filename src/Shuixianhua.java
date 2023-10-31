//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        scanner.close();
//
//        ArrayList<Integer> result = findSuperCompleteInvariantNumbers(n);
//        Collections.sort(result, Collections.reverseOrder());
////
////        System.out.println("输出:");
//        for (Integer number : result) {
//            System.out.println(number);
//        }
//    }
//
//    private static ArrayList<Integer> findSuperCompleteInvariantNumbers(int n) {
//        ArrayList<Integer> result = new ArrayList<>();
//        int maxDigits = Integer.toString(n).length();
//        int[][] powersCache = calculatePowersCache(maxDigits);
//
//        for (int i = 10; i < n; i++) {
//            if (isSuper(i, powersCache)) {
//                result.add(i);
//            }
//        }
//        return result;
//    }
//
//    private static int[][] calculatePowersCache(int maxDigits) {
//        int[][] powersCache = new int[10][maxDigits];
//        for (int i = 0; i <= 9; i++) {
//            for (int j = 1; j < maxDigits; j++) {
//                powersCache[i][j] = (int) Math.pow(i, j + 1);
//            }
//        }
//        return powersCache;
//    }
//
//    private static boolean isSuper(int number, int[][] powersCache) {
//        String numStr = Integer.toString(number);
//        int numLength = numStr.length();
//
//        // 检查数组是否越界
//        if (numLength >= powersCache[0].length) {
//            return false;
//        }
//
//        int sum = 0;
//
//        for (int i = 0; i < numLength; i++) {
//            int digit = Character.getNumericValue(numStr.charAt(i));
//            sum += powersCache[digit][numLength - 1];
//        }
//
//        return sum == number;
//    }
//}
