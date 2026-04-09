import java.util.Map;
​
public class PeteBaker {
  public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {
        int qtyCakes = Integer.MAX_VALUE;
        for(String needKey : recipe.keySet()){
            int qtyCakesTemp = 0;
            if(available.containsKey(needKey)){
                qtyCakesTemp = available.get(needKey) / recipe.get(needKey);
                if(qtyCakesTemp < qtyCakes){
                    qtyCakes = qtyCakesTemp;
                }
            }else {
                qtyCakes = 0;
                break;
            }
        }
       return (qtyCakes);
  }
}