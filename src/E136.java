import java.util.ArrayList;
import java.util.List;


//XOR
public class E136 {
    public static int singleNumber(int[] nums) {
        int ans =0;

        int len = nums.length;
        for(int i=0;i!=len;i++)
            ans ^= nums[i];

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1};
        singleNumber(nums);
    }
}
