import java.util.HashSet;
import java.util.Set;

//String: indexOf  substring replace
public class E929 {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet();
        for(String email: emails){
            int index = email.indexOf("@");
            String local = email.substring(0,index);
            String rest  = email.substring(index);
            if(local.contains("+")){
                local = local.substring(0,local.indexOf("+"));
            }
            local = local.replace(".", "");
            set.add(local+rest);
        }
        return set.size();
    }

}
