import java.util.*;
public class DuplicateEncoder {
  static String encode(String word){
        List<String> list = new ArrayList<>(List.of(word.toLowerCase().split("")));
        List<String> list2 = new ArrayList<>();
        String answer = "";
        for(String s : list) {
            int count = 0;
            for(int i = 0; i < list.size(); i++) {
                if (s.equals(list.get(i))) {
                    count++;
                }
            }
            if(count < 2) {
                list2.add("(");
            }else {
                list2.add(")");
            }
        }
        for(String s : list2) {
            answer = answer + s;
        }
        return (answer);
  }
}
​