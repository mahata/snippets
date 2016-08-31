package org.mahata.array_string;

/**
 * Created by mahata on 8/31/16.
 */
public class Anagram {
    static private boolean isAnagram(String s1, String s2) {
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        if (arr1.length != arr2.length) {
            return false;
        }

        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);
        return java.util.Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("Hello", "elloH"));
        System.out.println(isAnagram("Hello", "ellaH"));
        System.out.println(isAnagram("Hello", "ellH"));
    }
}
