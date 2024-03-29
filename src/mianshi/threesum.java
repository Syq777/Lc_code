package mianshi;
import java.util.*;
class threesum {
        public List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums);
            int n = nums.length;
            List<List<Integer>> res = new ArrayList<>();
            for(int i=0;i<n;i++){

                if(i>0 && nums[i] == nums[i-1] ){
                    continue;
                }

                int j = i+1,k = n - 1 ;
                while(j < k){
                    while(j > i+1 && j<n &&nums[j] ==nums[j-1]){
                        j++;
                    }
                    if(j>=k){
                        break;
                    }
                    int sum = nums[i]+nums[j]+nums[k];
                    if(sum == 0){
                        res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                        j++;
                    }else if (sum > 0){
                        k--;
                    }else if(sum < 0){
                        j++;
                    }
                }
            }
            return res;
        }

        public static void main(String[] args) {
            int[] nums = {-1, -1, 0, 1, 2};
            threesum solution = new threesum();
            List<List<Integer>> result = solution.threeSum(nums);
            for(List<Integer> list : result) {
                System.out.println(list);
            }
        }

}
