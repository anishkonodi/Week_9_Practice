//Write a Java program to remove a key-value pair from a Map.

import java.util.*;

class RemovePair {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    HashMap<Integer, String> hash = new HashMap<Integer, String>();
    System.out.println("enter 4 key and value pairs");
    for (int i = 0; i < 4; i++) {
      hash.put(s.nextInt(), s.next());
    }
    System.out.println("before removing a pair");
    System.out.println(hash);
    System.out.println("Enter key to remove");
    Integer key = s.nextInt();
    hash.remove(key);
    System.out.println("After removing a pair");
    System.out.println(hash);
  }
}