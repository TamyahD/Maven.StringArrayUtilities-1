package com.zipcodewilmington;

import java.util.*;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        boolean doesItContainValue = false;
        for (String el : array) {
            if (el.contains(value)) {
                doesItContainValue = true;
            }
        }
        return doesItContainValue;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        Collections.reverse(Arrays.asList(array));
//        System.out.print(Arrays.asList(array));
        return array;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        int count = 0;
        boolean pal = false;
        for (String str : array) {
            if (array[array.length - 1] == array[count]) {
                pal = true;
            }
        }
        return pal;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        boolean isPangram = true;
        String[] alphabet = "abcdefghijklmnopqrstuvwxyz".split("");
        String arrayToString = Arrays.toString(array).toLowerCase();

        for (int idx=0; idx <= alphabet.length -1; idx++) {
            if (!(arrayToString.contains(alphabet[idx]))) {
                isPangram = false;
            }
        }
        return isPangram;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        for (String str : array) {
            if (str.equals(value)) {
                count++;
            }
        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        List<String> arrList = new ArrayList<>(Arrays.asList(array));
        arrList.remove(valueToRemove);
        array = arrList.toArray(new String[0]);
        return array;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        int idx = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[idx] != array[i]) {
                idx++;
                array[idx] = array[i];
            }
        }
        return Arrays.copyOfRange(array, 0, idx + 1);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated
     * as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        String[] newArr = new String[array.length];
        int idxShift = 0;
        for (int i = 0; i < array.length; i++) {
            newArr[idxShift] = array[i];
            while(i +1 < array.length && array[i].equals(array[i+1])) {
                newArr[idxShift] += array[i];
                i++;
            }
            idxShift++;
        }
        String[] list = Arrays.copyOfRange(newArr, 0, idxShift);
        return list;
    }
}
