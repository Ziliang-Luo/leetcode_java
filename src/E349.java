import java.util.HashSet;
import java.util.Set;

public class E349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        int length = Math.min(nums1.length,nums2.length);
        int[] ans = new int[length];
        for(int i =0; i<nums1.length;i++){
            s.add(nums1[i]);
        }
        for(int i =0;i<nums2.length;i++){
            if(s.contains(nums2[i])){
                s2.add(nums2[i]);
            }
        }
        return s2.stream().mapToInt(Integer::intValue).toArray();
    }
}
