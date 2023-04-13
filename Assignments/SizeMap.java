//Write a Java program to get the size of a Map.

import java.util.*;

class SizeMap {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    HashMap<Integer, String> hash = new HashMap<Integer, String>();
    System.out.println("enter 4 key and value pairs");
    for (int i = 0; i < 4; i++) {
      hash.put(s.nextInt(), s.next());
    }
   System.out.println("The size of the map is "+hash.size());
}
}