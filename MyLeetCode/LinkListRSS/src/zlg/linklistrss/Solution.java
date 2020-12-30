package zlg.linklistrss;

import java.util.Random;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

/*public class Solution {
    private ListNode h;

    public Solution(ListNode head) {
        this.h = head;
    }

    public int getRandom() {
        Random r = new Random();
        ListNode tempNode = h;
        ListNode returnNode = null;
        int count = 0;
        while(tempNode!=null){
            count++;
            if(r.nextInt()%count==0)
                returnNode = tempNode;
            tempNode = tempNode.next;
        }
        return returnNode.val;
    }
}*/

/*随机返回k个值，假设链表长度大于k*/
public class Solution {
    private ListNode h;

    public Solution(ListNode head) {
        this.h = head;
    }

    public int[] getRandomK(int k) {
        int[] res = new int[k];
        //此处是否等价于C语言的返回局部变量的地址？idea未报错，说明没问题
        Random r = new Random();
        ListNode tempNode = h;
        ListNode returnNode = null;
        int count = 0;
        while (tempNode != null) {
            count++;
            if (count <= k) {
                res[count - 1] = tempNode.val;
            } else {
                if (r.nextInt(count) < k)
                    res[r.nextInt(k)] = tempNode.val;
            }
            tempNode = tempNode.next;
        }
        return res;
    }
}
/*
概率为n/m的设计
Random r = new Random();
if(r.nextInt(m)<n){           #r.nextInt(m)返回[0,m)之间的整数
}
 */
