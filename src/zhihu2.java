//import java.util.*;
//
//public class Solution {
//    /**
//     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
//     *
//     *
//     * @param matrix int整型二维数组
//     * @param target int整型
//     * @return bool布尔型
//     */
//    public boolean searchMatrix (int[][] matrix, int target) {
//        // write code here
//        // 判断矩阵是否null
//        if (matrix == null || matrix.length == 0 ||matrix[0].length == 0){
//            return false;
//        }
//        int rows = matrix.length;
//        int cols = matrix[0].length;
//        // 从矩阵右上角开始搜索
//        int row = 0;
//        int col = cols-1;
//
//        while(row <rows && col >= 0){
//            if(matrix[row][col] ==target){
//                return true;
//            }
//            else if (matrix[row][col] > target){
//                col --;
//            }else {
//                row ++;
//            }
//        }
//        return false;
//    }}
