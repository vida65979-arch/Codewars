import java.util.*;
public class Kata {
  
  public static List<Object> filterList(final List<Object> list) {
        List<Object> answerList = new ArrayList<>();
​
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Integer) {
                answerList.add(list.get(i));
            }
        }
        return (answerList);
  }
}
​