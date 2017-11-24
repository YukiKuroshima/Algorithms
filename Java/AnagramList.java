import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution {
  public static void main(String[] args) {
    ArrayList<String> strings = new ArrayList<String>();
    strings.add("Hello, World!");
    strings.add("Welcome to CoderPad.");
    strings.add("This pad is running Java 8.");

    HashMap<Character, Integer> map = new HashMap<>();
    map.put('a', 1);
    map.put('b', 2);

    HashMap<Character, Integer> map1 = new HashMap<>();
    map1.put('a', 1);
    map1.put('b', 4);

    System.out.println(map.equals(map1));

    System.out.println(makeStringIntHashMap("aaab"));

    String [] arr = {"abc", "acb", "acb", "cbb", "bcb"};
    System.out.println(makeAnagramAL(
      arr, 0
    ));
    System.out.println(makeAnagramAL(
      arr, 3
    ));


    System.out.println(anagram(
      arr
    ));
  }

  private static ArrayList<ArrayList<String>> anagram(String [] arr) {
    final int SIZE = arr.length;

    ArrayList<ArrayList<String>> al = new ArrayList<>();

    for (int i = 0; i < SIZE; i++) {
      if(makeAnagramAL(arr, i) != null) {
        al.add(makeAnagramAL(arr, i));
      }
    }
    return al;
  }

  private static ArrayList<String> makeAnagramAL(String [] arr, int currentWordPos) {
    ArrayList<String> al = new ArrayList<>();
    al.add(arr[currentWordPos]);


    final int SIZE = arr.length;
    HashMap<Character, Integer> currentWordMap = makeStringIntHashMap(arr[currentWordPos]);

    for (int i = 0; i < SIZE; i++) {
      if(i != currentWordPos) {
        // store if anagram
        if(areWordsAnagram(currentWordMap, arr[i])) {
          al.add(arr[i]);
        }
      }
    }
    if(al.size() == 1) {
      return null;
    }
    else {
      return al;
    }
  }

  private static HashMap<Character, Integer> makeStringIntHashMap(String s) {
    HashMap<Character, Integer> map = new HashMap<>();
    char [] chars = s.toCharArray();
    for (char c: chars) {
      if (map.containsKey(c)) {
        map.put(Character.valueOf(c), map.get(c) + 1);
      }
      else {
        map.put(Character.valueOf(c), + 1);
      }
    }
    return map;
  }

  private static boolean areWordsAnagram(HashMap<Character, Integer> map, String s2) {
    HashMap<Character, Integer> map2 = makeStringIntHashMap(s2);
    return map.equals(map2);
  }
}


// For each word
  // For each word Check if the word is anagram of other words
  // - Make array of chars from both words
  // Check if equals
  // If same add to the arraylist
// Add to the main arraylist
