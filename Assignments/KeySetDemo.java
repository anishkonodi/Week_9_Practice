//Write a Java program to iterate over the key-value pairs of a Map using the keySet() method.

import java.util.*;

class KeySetDemo {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    HashMap<Integer, String> hash = new HashMap<Integer, String>();
    System.out.println("enter 4 key and value pairs");
    for (int i = 0; i < 4; i++) {
      hash.put(s.nextInt(), s.next());
    }
    Set<Integer> keySet = hash.keySet();
    for (Integer key : keySet) {
      System.out.println(key + " ->> " + hash.get(key));
    }
  }
}