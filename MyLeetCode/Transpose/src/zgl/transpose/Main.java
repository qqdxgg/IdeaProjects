package zgl.transpose;

import java.util.Arrays;

class Solution {
    public int[][] transpose(int[][] A) {
        int lenr = A.length;
        int lenc = A[0].length;
        int[][] R = new int[lenc][lenr];
        for (int i = 0; i < lenr; i++) {
            for (int j = 0; j < lenc; j++) {
                R[j][i] = A[i][j];
            }
        }
        return R;
    }
    public void printArray(int[][] A){
        int lenr = A.length;
        String[] rs = new String[lenr];
        for (int i = 0; i < lenr; i++) {
            rs[i] = Arrays.toString(A[i]);
        }
        System.out.println(Arrays.toString(rs));
    }
}
public class Main{
    public static void main(String[] args) {
        int[][] a ={{2,3,4},{5,6,7}};
        Solution s = new Solution();
        int[][] res = s.transpose(a);
        s.printArray(res);
    }
}
