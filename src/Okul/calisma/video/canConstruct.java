package Okul.calisma.video;

import java.util.HashMap;
import java.util.Map;

public class canConstruct {
    public static void main(String[] args) {
        Map mp = new HashMap();
        String[] words = {"em","abc","re"};
        System.out.println(construct("emreemreemreemreemreemreemreemre",words,mp));
    }
    public static boolean construct(String str, String[] words, Map<String,Boolean> mp){
        if (mp.containsKey(str)){
            return mp.get(str);
        }
        if (str.equals("")){
            return true;
        }
        for (int i=0;i< words.length;i++){
            if (str.indexOf(words[i]) == 0){
                String part = str.substring(words[i].length());
                if (construct(part,words,mp)){
                    mp.put(str,true);
                    return true;
                }
            }
        }
        mp.put(str,false);
        return false;
    }
}
