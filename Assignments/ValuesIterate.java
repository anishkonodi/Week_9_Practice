//Write a Java program to iterate over the values of a Map using the values() method.

import java.util.*;
class ValuesIterate {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    HashMap<Integer, String> hash = new HashMap<Integer, String>();
    System.out.println("enter 4 key and value pairs");
    for (int i = 0; i < 4; i++) {
      hash.put(s.nextInt(), s.next());
    }
    Collection<String> value=hash.values();
    for(String v:value){
      System.out.println(v+"  = "+hash.get(v));//why it does not print keys 
    }
  }
}