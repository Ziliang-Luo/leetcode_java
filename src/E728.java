import java.util.ArrayList;
import java.util.List;


//for (char c: String.valueOf(n).toCharArray())
//The method toCharArray() returns an Array of chars after
// converting a String into sequence of characters.
// The returned array length is equal to the length of the String
// and the sequence of chars in Array matches the sequence of characters in the String.
public class E728 {
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList();
        for (int n = left; n <= right; ++n) {
            if (selfDividing(n)) ans.add(n);
        }
        return ans;
    }
    public static boolean selfDividing(int n) {
        for (char c: String.valueOf(n).toCharArray()) {
            if (c == '0' || (n % (c - '0') > 0))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int left = 1;
        int right = 22;
        System.out.println(selfDividingNumbers(left,right));
    }
}
