package StateCapitals1;

import java.util.HashMap;
import java.util.Map;

public class StateCapitals {
    public static void main(String[] args) {
        Map<String,String> stateCapital = new HashMap<>();
        stateCapital.put("Alabama", "Montgomery");
        stateCapital.put("Alaska","Juneau");
        stateCapital.put("Arizona","Phoenix");
        stateCapital.put("Arkansas", "Little Rock");

        System.out.println(stateCapital.keySet());
        System.out.println(stateCapital.values());
        for (String i : stateCapital.keySet()){
            System.out.println("The capital of " + i + " is " + stateCapital.get(i) + ".");
            // OR         System.out.println(stateCapital);

        }


    }

}
