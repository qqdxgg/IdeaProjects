package zgl.sortsquare;

public class SortedSquared {
    public int[] sortedSquares(int[] nums) {
        int len = nums.length;
        int st_index_negtive = -1;
        int st_index_positive = -1;
        int first_above_zero = -1;
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            if (nums[i] >= 0) {
                first_above_zero = i;
                break;
            }
        }
        if (first_above_zero == -1) {
            st_index_negtive = len - 1;
        } else {
            if (first_above_zero == 0) {
                st_index_positive = 0;
            } else {
                st_index_negtive = first_above_zero - 1;
                st_index_positive = first_above_zero;
            }
        }
        int neg_squ = 0;
        int posi_squ = 0;
        int maxaabs = 10001 * 10001;
        for (int i = 0; i < len; i++) {
            if (st_index_negtive >= 0 && st_index_negtive < len) {
                neg_squ = nums[st_index_negtive] * nums[st_index_negtive];
            } else {
                neg_squ = maxaabs;
            }
            if (st_index_positive >= 0 && st_index_positive < len) {
                posi_squ = nums[st_index_positive] * nums[st_index_positive];
            } else {
                posi_squ = maxaabs;
            }
            if (posi_squ < neg_squ) {
                res[i] = posi_squ;
                st_index_positive++;
            }else {
                res[i] = neg_squ;
                st_index_negtive--;
            }
        }
        return res;
    }
}
