//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] numbers = new int[n];
//        for (int i = 0; i < n; i++) {
//            numbers[i] = scanner.nextInt();
//        }
//        int m = scanner.nextInt();
//        int[][] operations = new int[m][2];
//        for (int i = 0; i < m; i++) {
//            operations[i][0] = scanner.nextInt() - 1; // Index is 0-based
//            String op = scanner.next();
//            operations[i][1] = "+-*/".indexOf(op);
//        }
//        scanner.close();
//
//        calculateExpression(numbers, operations);
//    }
//
//    public static void calculateExpression(int[] numbers, int[][] operations) {
//        for (int[] operation : operations) {
//            int t = operation[0];
//            int op = operation[1];
//            double result = numbers[0];
//            boolean flag = false;
//            for (int i = 1; i < numbers.length; i++) {
//                if (i - 1 == t) {
//                    switch (op) {
//                        case 0:
//                            result += numbers[i];
//                            flag = false;
//                            break;
//                        case 1:
//                            result -= numbers[i];
//                            flag = false;
//                            break;
//                        case 2:
//                            result = result - numbers[i - 1] + numbers[i - 1] * numbers[i];
//                            flag = true;
//                            break;
//                        case 3:
//                            result = result - numbers[i - 1] + (double) numbers[i - 1] / (double) numbers[i];
//                            flag = true;
//                            break;
//                    }
//                } else {
//                    if(!flag ) {
//                        result += numbers[i];
//                    }
//                }
//            }
//            System.out.printf("%.1f ", result);
//        }
//    }
//}
