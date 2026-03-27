import java.util.*;
public class Solution {
​
  public int solution(int number) {
        int result = 0;
        Set<Integer> list = new HashSet<>();
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                list.add(i);
            }
        }
        System.out.println(list);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            result += next;
        }
        return result;
  }
}