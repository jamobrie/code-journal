package leetcode.editor.en;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        TwoSum outer = new TwoSum();
        Solution solution = outer.new Solution();
        int[] answer = solution.twoSum(new int[]{2, 3, 5, 20, 60, 99, 7, 11, 15}, 65);
        System.out.println("Solution: " + Arrays.toString(answer));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        //Brute force solution - Time complexity: O(n)2 .... Space complexity: O(1)
        public int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {

                }
            }

            return nums;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


    class Solution2 {

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
