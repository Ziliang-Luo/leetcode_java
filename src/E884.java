import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


//Map: getOrDefault, keySet
public class E884 {
    public static String[] uncommonFromSentences(String A, String B) {
        Map<String, Integer> count = new HashMap<>();
        for(String word: A.split(" ")){
            count.put(word, count.getOrDefault(word,0)+1);
        }
        System.out.println(count);
        for (String word: B.split(" ")) {
            count.put(word, count.getOrDefault(word, 0) + 1);
            System.out.println(count);
        }
        List<String> ans = new LinkedList();
        for (String word: count.keySet())
            if (count.get(word) == 1)
                ans.add(word);
        return ans.toArray(new String[ans.size()]);
    }

    public static void main(String[] args) {
        String A = "apple apple";
        String B = "banana";
        uncommonFromSentences(A,B);
    }
}
