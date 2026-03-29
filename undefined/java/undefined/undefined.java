import java.util.*;
public class Kata {
  public static String highAndLow(String numbers) {
        String[] words = numbers.split(" ");
        List<Integer> numbersList = new ArrayList<>();
        for(String word : words){
            numbersList.add(Integer.parseInt(word));
        }
        int max = numbersList.get(0);
        int min = numbersList.get(0);
​
        for (int i :  numbersList) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        return max + " " + min;
  }
}