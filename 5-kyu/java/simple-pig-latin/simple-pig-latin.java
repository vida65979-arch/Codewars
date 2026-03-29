import java.util.*;
public class PigLatin {
    public static String pigIt(String str) {
        String[] strList = str.split(" ");
        String answer = "";
        String symbols = "!.,:;?-()";
​
        for(String s: strList){
            if (!symbols.contains(s)) {
                List<String> sWord =  new ArrayList<>(List.of(s.split("")));
                sWord.add(sWord.remove(0));
                sWord.add("ay");
                answer = answer + String.join("", sWord) + " ";
            }else {
                answer = answer + s + " ";
            }
​
        }
        return answer.trim();
    }
}