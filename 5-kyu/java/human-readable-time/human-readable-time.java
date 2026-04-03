public class HumanReadableTime {
  public static String makeReadable(int seconds) {
        String hours = seconds / 3600 + "";
        String minutes = seconds % 3600 / 60 + "";
        String second = seconds % 60 + "";
        String[] answer = {hours,  minutes, second};
        for (int i = 0; i < answer.length; i++) {
            if (answer[i].length() < 2) {
                answer[i] =  "0" + answer[i];
            }
        }
        return (answer[0] + ":" + answer[1] + ":" + answer[2]);
  }
}