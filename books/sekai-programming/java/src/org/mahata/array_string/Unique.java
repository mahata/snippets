package org.mahata.array_string;

import java.util.HashMap;

/**
 * Created by mahata on 8/29/16.
 */
public class Unique {
    static private boolean isUnique(String s) {
        HashMap<Character, Boolean> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.getOrDefault(s.charAt(i), false)) {
                return false;
            } else {
                map.put(s.charAt(i), true);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isUnique("Hello"));
        System.out.println(isUnique("Helo"));
    }
}
