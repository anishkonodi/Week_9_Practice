//Write a Java program to copy all the key-value pairs of one Map to another Map.

import java.util.*;

class CopyPairs {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    HashMap<Integer, String> hash = new HashMap<Integer, String>();
    HashMap<Integer, String> map = new HashMap<Integer, String>();
    System.out.println("enter 4 key and value pairs");
    for (int i = 0; i < 4; i++) {
      hash.put(s.nextInt(), s.next());
    }
    System.out.println(hash);
    map.putAll(hash);
    System.out.println("After copied to another map");
    System.out.println(map);
  }
}