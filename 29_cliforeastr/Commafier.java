/* 
  Jason Zhou, Nina Jiang, John Gupta-She (Team Triumphant Triangles) Duckies: Tiggy, Po, Miss Alpaca
   APCS
   HW29: Which Way Do You Roll? (Create comify methods)
   2021-2-11
   time spent: 0.3 hours


QCC:
DISCO: Recursion seems a lot simpler than for, although it might just be me

*/

public class Commafier {
    public static String commafyF(int e) {
        String stringE = Integer.toString(e);
        String finalString = (stringE.length() % 3 == 0) ? stringE.substring(0, 3): stringE.substring(0, stringE.length() % 3);
        int commasNeeded = (stringE.length() % 3 == 0) ? (stringE.length() / 3) - 1: (stringE.length() / 3);
        
        for (int i = 1; i <= commasNeeded; i++) {
            finalString += "," + stringE.substring((3 * (i - 1)) + 1, (3 * i) + 1);
        }
        return finalString;
    }
    public static String commafyR(int e) {
        String stringE = Integer.toString(e);
        if (stringE.length() <= 3) {
            return stringE;
        } else {
            return commafyR(Integer.parseInt(stringE.substring(0, stringE.length() - 3))) + "," + stringE.substring(stringE.length() - 3, stringE.length());
        }
    }

    public static void main(String[] args) {
        for (String s: args) {
            System.out.println(commafyR(Integer.parseInt(s)));
        }
    }
}
