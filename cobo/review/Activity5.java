import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Takes in a String and replaces the String with all the words but in ascending order based on length
 */

public class Activity5 {

    //static because it's not class specific
    public static ArrayList<String> breakUp(String string) {
        ArrayList<String> returnList = new ArrayList<String>();
        String holder = string;
        while (holder.indexOf(" ") != -1) {
            returnList.add(holder.substring(0, holder.indexOf(" ")));
            holder = holder.substring(holder.indexOf(" ") + 1);
            
        }
        returnList.add(holder);
        return returnList;
    }

    //not class specific
    public static String reorder(String string, boolean ascending) {
        HashMap<Integer, String> map = new HashMap<>();
        ArrayList<String> brokenUp = breakUp(string);
        int[] order = new int[brokenUp.size()];
        String returns = "";
        for (int i = 0; i < brokenUp.size(); i++) {
            map.put(brokenUp.get(i).length(), brokenUp.get(i));
        }
        for (int i = 0; i < brokenUp.size(); i++) {
            order[i] = brokenUp.get(i).length();
        }
        Arrays.sort(order);
        for (int i = 0; i < order.length; i++) {
            if (ascending) {
                returns += map.get(order[i]) + " ";
            } else {
                returns += map.get(order[order.length - i - 1]) + " ";
            }
            
        }
        return returns;
        
    }
    public static void main(String[] args) {
        System.out.println(reorder("string and thing", false));

    }
}
