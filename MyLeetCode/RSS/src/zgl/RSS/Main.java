package zgl.RSS;

class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3, 3};
        Solution s1 = new Solution(nums);
        int[] count = new int[3];
        int index = 0;
        for (int i = 0; i < 1000; i++) {
            index = s1.pick(3);
            switch (index) {
                case 2:
                    count[0]++;
                    break;
                case 3:
                    count[1]++;
                    break;
                case 4:
                    count[2]++;
                    break;
            }
        }
        System.out.println("2 : " + count[0] + '\n' + "3 : " + count[1] + '\n' + "4 : " + count[2]);
    }
}
