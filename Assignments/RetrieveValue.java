//Write a Java program to retrieve a value from a Map using its key.

import java.util.*;

class RetrieveValue {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    HashMap<Integer, String> hash = new HashMap<Integer, String>();
    System.out.println("enter 4 key and value pairs");
    for (int i = 0; i < 4; i++) {
      hash.put(s.nextInt(), s.next());
    }
    System.out.println(hash);
    System.out.println("enter key to retrive a value");
    System.out.println("Value for your key is");
    System.out.println(hash.get(s.nextInt()));
  }
}