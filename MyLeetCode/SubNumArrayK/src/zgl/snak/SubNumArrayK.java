package zgl.snak;

import java.util.HashMap;

public class SubNumArrayK {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int pre = 0;
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
        h.put(0,1);
        /*如果写了h.put(0,1);就不再需要在下面加入if(pre==k) count++的操作
        如果没写就需要加入该判断，因为没写的请况下h.containsKey(pre-k)就不包括（0，i）这整段和等于k的情况
        */
        for (int i = 0; i < nums.length; ++i) {
            pre +=nums[i];
            if(h.containsKey(pre-k)){
                count+=h.get(pre-k);                /*相当于每次计数值更新的都是以i结尾的[...i]该段和等于k的段个数*/
            }
            h.put(pre,h.getOrDefault(pre,0)+1);
        }
        return count;
    }
}