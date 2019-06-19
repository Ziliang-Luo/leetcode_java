import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class E804 {
    public static int uniqueMorseRepresentations(String[] words) {
        String a = "";
        Set set = new HashSet();
        String[] s={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for(int i =0; i<words.length;i++){
            String b = "";
            for(int j=0;j<words[i].length();j++){
                char character = words[i].charAt(j);
                int ascii = (int) character;
                ascii -=97;
                System.out.println(ascii);
                a = s[ascii];
                b = b+a;
            }
            set.add(b);
        }
//        Iterator iter = set.iterator();
//        while(iter.hasNext()){
//            System.out.println(iter.next());
//        }
        return set.size();
    }

    public static void main(String[] args) {
        String[] words = {"gin", "zen", "gig", "msg"};
        System.out.println(uniqueMorseRepresentations(words));
    }

}
