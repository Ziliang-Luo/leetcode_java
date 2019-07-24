import java.util.HashMap;
import java.util.Map;

public class E169 {
    public static int majorityElement(int[] nums) {
        int mid = nums.length/2;
        //int count =0;
        Map m = new HashMap();
        for(int i =0; i<nums.length;i++){
            if(!m.containsKey(nums[i])){
                m.put(nums[i],1 );
            }
            else {
                m.put(nums[i],(int)m.get(nums[i])+1);
                if((int)m.get(nums[i]) > mid){
                    System.out.println(nums[i]);
                    return nums[i];
                }
            }
        }
        return nums[0];
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,1,3};
        majorityElement(nums);
    }
}
