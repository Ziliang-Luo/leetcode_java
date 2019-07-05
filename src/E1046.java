import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class E1046 {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i:stones)
            pq.offer(i);
        while(pq.size()>1) {
            int max1 = pq.poll();
            int max2 = pq.poll();
            if(max1-max2>0)
                pq.offer(max1-max2);
        }
        return pq.size()>0?pq.poll():0;
    }
//    public int lastStoneWeight(int[] stones) {
//        if(stones.length ==1){
//            return stones[0];
//        }
//        int[] result = TwoHeaviest(stones);
//        while()
//
//        return 0;
//    }
//
//
//    public static int[] TwoHeaviest(int[] stones){
//        int[] value = new int[4];
//
//        if(stones[0] <=stones[1]) {
//            value[0] = stones[0];
//            value[1] = stones[1];
//            value[3] = 1;
//        }
//        else{
//            value[0] = stones[1];
//            value[1] = stones[0];
//
//            value[2] = 1;
//        }
//        for(int i =2; i < stones.length; i++){
//            if(stones[i] >stones[0]){
//                if(stones[i] >stones[1]){
//                    value[0] = value[1];
//                    value[2] = value[3];
//                    value[1] = stones[i];
//                    value[3] = i;
//                }
//                else{
//                    value[0]= stones[i];
//                    value[2] = i;
//                }
//
//            }
//        }
//        return value;
//
//    }
}
