import java.util.ArrayList;
import java.util.List;

// toCharArray
public class E784 {
    public List<String> letterCasePermutation(String S) {
        List<String> ans=new ArrayList<>();
        compute(ans,S.toCharArray(),0);
        return ans;
    }

    public void compute(List<String> ans, char[] chars, int index)
    {
        if(index==chars.length)
            ans.add(new String(chars));
        else
        {
            if(Character.isLetter(chars[index]))
            {
                chars[index]=Character.toLowerCase(chars[index]);
                compute(ans,chars,index+1);
                chars[index]=Character.toUpperCase(chars[index]);
            }
            compute(ans,chars,index+1);
        }
    }
}
