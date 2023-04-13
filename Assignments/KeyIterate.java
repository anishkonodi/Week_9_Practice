//Write a Java program to iterate over the key-value pairs of a Map using the entrySet() method.

import java.util.*;

class KeyIterate{
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    HashMap<Integer, String> hash = new HashMap<Integer, String>();
    System.out.println("enter 4 key and value pairs");
    for (int i = 0; i < 4; i++) {
      hash.put(s.nextInt(), s.next());
    }
    for (Map.Entry m : hash.entrySet()) {
      System.out.println(m);
    }
  }
}