public class FindMF {
    public static void main(String[] args) {
        String[] strs = {"10", "0001", "111001", "1", "0"};
        int m = 5, n = 3;
        Solution so = new Solution();
        System.out.println(so.findMaxForm(strs,m,n));
    }
}
