/*
Jason Zhou (Snoring Sloths: Neil Lin, Oscar Breen, Tiggy, Hatch)
APCS
HW25: Do I repeat myself? (Created fence via recursion and loopies)
2021 - 10 - 26
Time Spent: 8 min
Disco: N/A
Q: N/A
*/

public class Repeat {
    public static String fenceW(int numPosts) {
        int e = 1;
        String ans= "|";
        while (e < numPosts) {
            ans += "--|";
            e++;
        }
        return ans;
        
    }
    public static String fenceR(int numPosts) {
        if (numPosts == 1) {
            return "|";
        } else {
            return fenceR(numPosts - 1) + "--|";
        }
    }
    public static void main(String[] args) {
        System.out.println(fenceR(3));
        System.out.println(fenceW(3));
        
    }
}
