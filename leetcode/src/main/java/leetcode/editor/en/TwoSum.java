package leetcode.editor.en;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    //  you may not use the same element twice.
    public static void main(String[] args) {
        TwoSum outer = new TwoSum();
        Solution solution = outer.new Solution();
        int[] answer = solution.twoSum(new int[]{2, 3, 5, 20, 60, 99, 7, 11, 15}, 65);
        System.out.println("Solution: " + Arrays.toString(answer));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        // Two-pass Hash Table ---> We can reduce the lookup time from O(n) to O(1). It possible for O(n) degradation, but only if a collision occurs
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> mapOfValuesAndPosition = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {
                mapOfValuesAndPosition.put(nums[i], i);
            }

            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];
                if (mapOfValuesAndPosition.containsKey(complement) && mapOfValuesAndPosition.get(complement) != i) {
                    return new int[]{i, mapOfValuesAndPosition.get(complement)};
                }
            }

            // In case there is no solution, return an empty array
            return new int[]{};
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


    class Solution1 {

        //Brute force solution - Time complexity: O(n)2 .... Space complexity: O(1)
        public int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == target - nums[i]) {
                        return new int[]{i, j};
                    }
                }
            }

            return nums;
        }
    }

}
