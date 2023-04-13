//Write a Java program to clear all the key-value pairs of a Map.

import java.util.*;

class ClearAll {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    HashMap<Integer, String> hash = new HashMap<Integer, String>();
    System.out.println("enter 4 key and value pairs");
    for (int i = 0; i < 4; i++) {
      hash.put(s.nextInt(), s.next());
    }
    System.out.println("Before clear");
    System.out.println(hash);
    hash.clear();
    System.out.println("After clear");
    System.out.println(hash);
  }
}