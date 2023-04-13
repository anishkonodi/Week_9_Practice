//Write a Java program to check if a particular key is present in a Map.

import java.util.*;

class CheckKey {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    HashMap<Integer, String> hash = new HashMap<Integer, String>();
    System.out.println("enter 4 key and value pairs");
    for (int i = 0; i < 4; i++) {
      hash.put(s.nextInt(), s.next());
    }
    System.out.println(hash);
    System.out.println("Enter key to check");
    Integer key = s.nextInt();
    for (Map.Entry m : hash.entrySet()) {

      if (m.getKey() == key) {
        System.out.println("yes key is present value is " + m.getValue());
      }
    }
  }
}