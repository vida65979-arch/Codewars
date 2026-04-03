import java.util.*;
public class ReverseWords{
​
 public static String reverseWords(String str){
        List<String> strList = new ArrayList<>(List.of(str.split("\\s+")));
        Collections.reverse(strList);
        String str1 = String.join(" ", strList);
        return (str1);
 }
}