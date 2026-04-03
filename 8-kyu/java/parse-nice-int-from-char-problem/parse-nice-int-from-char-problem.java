public class CharProblem {
  public static int howOld(final String herOld) {
​
        char[] s = herOld.toCharArray();
        return Integer.parseInt(s[0] + "");
  
  }
}