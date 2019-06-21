import java.util.HashMap;
import java.util.Map;

//store and update value in map
public class E961 {
    public int repeatedNTimes(int[] A) {
        int count =1;
        int x = A.length/2;
        Map<Integer,Integer> map = new HashMap();
        for(int i =0;i<A.length;i++){
            if(map.containsKey(A[i])){
                //map.put(A[i],map.get(A[i]) + 1);
                return A[i];
            }
            else{
                map.put(A[i],count);
            }
        }
        throw new IllegalArgumentException("Nosolution");
    }
}
