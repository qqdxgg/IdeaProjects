package zgl.fmsa;

/*此方法不进行实际的归并操作，只是移动指针即索引位置，节省空间消耗*/
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = (nums1.length + nums2.length);
        int range = len / 2 + 1;
        int index1 = -1;
        int index2 = -1;
        boolean flag = false;
        if (nums1.length == 0) {
            int temp = nums2.length / 2 + 1;
            if (nums2.length % 2 == 0) return (double) (nums2[temp - 1] + nums2[temp - 2]) / 2;
            else return nums2[temp - 1];
        }
        if (nums2.length == 0) {
            int temp = nums1.length / 2 + 1;
            if (nums1.length % 2 == 0) return (double) (nums1[temp - 2] + nums1[temp - 1]) / 2;
            else return nums1[temp - 1];
        }
        //用一个标志来记录最新更新的是数组1的索引还是数组2的索引，0代表数组一，1代表数组二
        for (int i = 0; i < range; i++) {
            if (index1 + 1 < nums1.length && index2 + 1 < nums2.length) {
                if (nums1[index1 + 1] <= nums2[index2 + 1]) {
                    index1++;
                    flag = false;
                } else {
                    index2++;
                    flag = true;
                }
            } else {
                if (index1 + 1 >= nums1.length && index2 + 1 >= nums2.length) break;
                else {
                    if (index1 + 1 >= nums1.length) {
                        index2++;
                        flag = true;
                    } else {
                        index1++;
                        flag = false;
                    }
                }
            }
        }
        if (index1 == -1) {
            if (len % 2 == 0) return (double) (nums2[index2] + nums2[index2 - 1]) / 2;
            else return nums2[index2];
        }
        if (index2 == -1) {
            if (len % 2 == 0) return (double) (nums1[index1] + nums1[index1 - 1]) / 2;
            else return nums1[index1];
        }
        if (len % 2 == 0) {
            if (flag) {
                if (index2 == 0) return (double) (nums2[index2] + nums1[index1]) / 2;
                else {
                    if (nums2[index2 - 1] >= nums1[index1]) return (double) (nums2[index2] + nums2[index2 - 1]) / 2;
                    else return (double) (nums2[index2] + nums1[index1]) / 2;
                }
            } else {
                if (index1 == 0) return (double) (nums1[index1] + nums2[index2]) / 2;
                else {
                    if (nums1[index1 - 1] > nums2[index2]) return (double) (nums1[index1] + nums1[index1 - 1]) / 2;
                    else return (double) (nums1[index1] + nums2[index2]) / 2;
                }
            }
        } else {
            return flag ? nums2[index2] : nums1[index1];
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums1 = {1}, nums2 = {1};
        double resd = s.findMedianSortedArrays(nums1, nums2);
        System.out.println(resd);
    }
}
