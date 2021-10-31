public class XyzThere {
    /**
     * Return true if the given string contains an appearance of "xyz" where the
     * xyz is not directly preceeded by a period (.). So "xxyz" counts but
     * "x.xyz" does not.
     */
    public static boolean xyzThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (!str.substring(0, 1).equals(".") && i == 0) {
                if (str.substring(i, i + 1).equals("x") && str.substring(i + 1, i + 2).equals("y") && str.substring(i + 2, i + 3).equals("z")) {
                    return true;
                }
            } else {
                if (str.substring(i, i + 1).equals("x") && str.substring(i + 1, i + 2).equals("y") && str.substring(i + 2, i + 3).equals("z") && !str.substring(i - 1, i).equals(".") ) {
                    return true;
                }
            }
            

        }
        return false;
        
    }
    public static void main(String[] args) {
        System.out.println(xyzThere("abcxyz")); // true
        System.out.println(xyzThere("abc.xyz")); // false
        System.out.println(xyzThere("xyz.abc")); // true
    }
}