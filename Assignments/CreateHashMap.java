//Write a Java program to create a HashMap and add key-value pairs to it.

import java.util.*;

class CreateHashMap {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    HashMap<Integer, String> hash = new HashMap<Integer, String>();
    System.out.println("enter 4 key and value pairs");
    for (int i = 0; i < 4; i++) {
      hash.put(s.nextInt(), s.next());
    }
    System.out.println(hash);
  }
}