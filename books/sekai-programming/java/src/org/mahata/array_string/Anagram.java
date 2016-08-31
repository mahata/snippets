package org.mahata.array_string;

/**
 * Created by mahata on 8/31/16.
 */
public class Anagram {
    static private boolean isAnagram(String s1, String s2) {
        char[] arr1 = s1.toCharArray();
        java.util.Arrays.sort(arr1);

        char[] arr2 = s2.toCharArray();
        java.util.Arrays.sort(arr2);

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("Hello", "elloH"));
        System.out.println(isAnagram("Hello", "ellaH"));
        System.out.println(isAnagram("Hello", "ellH"));
    }
}
