package zgl.snmx;

import java.util.HashMap;

public class SubNumMatrixK {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] colsum = new int[row][col];
        for (int i = 0; i < col; i++) {
            int total = 0;
            for (int j = 0; j < row; j++) {
                total += matrix[j][i];
                colsum[j][i] = total;
            }
        }
        int count = 0;
        for (int st = 0; st < row; st++) {
            for (int ent = st; ent < row; ent++) {
                HashMap<Integer, Integer> h = new HashMap<>();
                /*如果写了h.put(0,1);就不再需要在下面加入if(total == target) count++的操作
        如果没写就需要加入该判断，因为没写的请况下h.containsKey(total - target)就不包括（0，i）这整段和等于target的情况
        */
                int total = 0;
                for (int i = 0; i < col; i++) {
                    int presum = st < 1 ? 0 : colsum[st - 1][i];
                    total += colsum[ent][i] - presum;            /*本行代码与上一行代码用于计算st到ent之间的列和，
                    故而要剔除st-1行（包括st-1）之前的列和*/
                    if (total == target) {
                        count++;
                    }
                    if (h.containsKey(total - target)) {
                        count += h.get(total - target);/*相当于每次计数值更新的都是以i结尾的[...i]该段和等于*/ }
                    h.put(total, h.getOrDefault(total, 0) + 1);
                }
            }
        }
        return count;
    }
}
