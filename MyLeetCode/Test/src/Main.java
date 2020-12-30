import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
//        Random r = new Random();
//        System.out.println(r.nextInt(3));
//        int[] a = {1,2,3};
//        System.out.println(Arrays.toString(a));
//        int i = -1;
//        for (int j = 0;j<10;j++){
//            i++;
//        }
//        System.out.println(i);
        HashMap<Integer,Integer> h = new HashMap<>();
        h.put(0,1);
        h.put(0,11);
        System.out.println(h.get(0));
    }
}
