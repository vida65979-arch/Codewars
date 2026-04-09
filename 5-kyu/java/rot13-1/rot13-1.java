import java.util.*;
public class Kata {
  public static String rot13(String str) {
        String answer = "";
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if  (Character.isAlphabetic(chars[i])) {
                if(Character.isLowerCase(chars[i])) {
                    if((chars[i] + 13) > 122){
                        answer = answer + Arrays.toString(Character.toChars(96 - (122 - (chars[i] + 13 )))).replace("[", "").replace("]", "");
                    }else {
                        answer = answer + Arrays.toString(Character.toChars(chars[i] + 13 )).replace("[", "").replace("]", "") ;
                    }
                }
                else {
                    if((chars[i] + 13) > 90){
                        answer = answer + Arrays.toString(Character.toChars(64 - (90 - (chars[i] + 13 )))).replace("[", "").replace("]", "");
                    }else {
                        answer = answer + Arrays.toString(Character.toChars(chars[i] + 13 )).replace("[", "").replace("]", "") ;
                    }
                }
            }else {
                answer = answer + chars[i];
            }
        }
        return (answer);
  }
}