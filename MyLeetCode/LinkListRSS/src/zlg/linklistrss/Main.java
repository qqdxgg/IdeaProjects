package zlg.linklistrss;

public class Main {
    public static void main(String[] args) {
        /*ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        Solution solution = new Solution(head);
        int[] count = new int[3];
        int tempresult = 0;
        for (int i = 0; i < 10000; i++) {
            tempresult = solution.getRandom();
            switch (tempresult) {
                case 1:
                    count[0]++;
                    break;
                case 2:
                    count[1]++;
                    break;
                case 3:
                    count[2]++;
                    break;
            }
        }
        System.out.println("First Node : " + count[0] + '\n' + "Second Node : " + count[1] + '\n' + "Third Node : " + count[2]);*/
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        Solution solution = new Solution(head);
        int[] res = solution.getRandomK(2);
        System.out.println(res[0]+"-"+res[1]);
    }
}
