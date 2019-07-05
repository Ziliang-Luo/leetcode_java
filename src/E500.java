import java.util.ArrayList;

public class E500 {
    public static String[] findWords(String[] words) {
        //int length = 0;
        //String[] result = new String[words.length];
        ArrayList<String> result = new ArrayList<String>();
        String s1="qwertyuiop",s2="asdfghjkl",s3="zxcvbnm";

        for(int i = 0; i< words.length;i++){
            int count1 = 0;
            int count2 = 0;
            int count3 = 0;
            for(int j = 0; j<words[i].length();j++){
                String test = words[i].toLowerCase();
                //System.out.println(words[i].charAt(j));
                if(s1.contains(test.charAt(j)+"")){
                    count1 ++;
                }
                if(s2.contains(test.charAt(j)+"")){
                    count2 ++;
                }
                if(s3.contains(test.charAt(j)+"")){
                    count3 ++;
                }
            }
            //System.out.println(count2);
            if(count1 ==words[i].length() ||count2 ==words[i].length()||count3 ==words[i].length()){
                result.add(words[i]);
            }
        }
        for(String s:result){
            System.out.println(s);
        }
        return result.toArray(new String[result.size()]);
    }


    public static void main(String[] args) {
        String[] words = {"adsdf", "sfd"};
        findWords(words);
    }
}
