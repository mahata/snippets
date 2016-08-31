package org.mahata.array_string;

/**
 * Created by mahata on 8/31/16.
 */
public class Unique2 {
    // assuming all chars are lower-case chars
    static private boolean isUnique(String s) {
        if (s.length() > 256) {
            return false;
        }

        int checker = 0;
        for (int i = 0; i < s.length(); i++) {
            int val = s.charAt(i) - 'a';
            if ((checker & (1 << val)) > 0) {
                return false;
            }
            checker |= (1 << val);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isUnique("Hello"));
        System.out.println(isUnique("HHelo"));
    }
}
