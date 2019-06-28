import java.util.ArrayList;


//convert ArrayList<String> to String[]: Array.toArray(new String[0])
public class E1087 {
    public static String[] findOcurrences(String text, String first, String second) {
        ArrayList<String> result = new ArrayList<String>();
        String[] words = text.split(" ");

        for(int i = 0;i<words.length-2;i++){
            if(words[i].equals(first) && words[i+1].equals(second)){
                result.add(words[i+2]);
            }
        }
        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String text = "alice is a good girl she is a good student", first = "a", second = "good";
        findOcurrences(text,first, second);
    }
}
