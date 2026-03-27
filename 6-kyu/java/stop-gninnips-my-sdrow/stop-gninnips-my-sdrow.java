import java.util.*;
public class SpinWords {
​
  public String spinWords(String sentence) {
        List<String> string = List.of(sentence.split(" "));
        List<String> s2;
        String s3 = "";
        String result = "";
        for(String s1 : string){
            if (s1.length() > 4){
                s2 = new ArrayList<>(List.of(s1.split("")));
                Collections.reverse(s2);
                for(String s21 : s2){
                    s3 = s3 + s21;
                }
                result = result + " " + s3;
                s3 = "";
            }
            else{
                result = result + " " + s1;
            }
        }
        return result.trim();
  }
}