package zgl.RSS;

import java.util.Random;

class Solution {
    private int[] nums;

    public Solution(int[] nums) {
        this.nums = nums;
    }

    public int pick(int target) {
        Random r = new Random();
        int n = 0;
        int index = 0;
        for (int i = 0; i < this.nums.length; i++) {
            if (nums[i] == target) {
                n++;
                if (r.nextInt() % n == 0) index = i;
            }
        }
        return index;
    }
}
