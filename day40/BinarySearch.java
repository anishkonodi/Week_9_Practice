import java.util.Scanner;
import java.util.Arrays;

class BinarySearch {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("enter array size");
    int n = s.nextInt();
    int arr[] = new int[n];
    System.out.println("enter array elements");
    for (int i = 0; i < n; i++) {
      arr[i] = s.nextInt();
    }
    Arrays.sort(arr);
    System.out.println("enter element to search");
    int key = s.nextInt();
    int firstIndex = 0;
    int lastIndex = arr.length - 1;
    int mid = (firstIndex + lastIndex) / 2;
    while (firstIndex <= lastIndex) {
      if (arr[mid] < key) {
        firstIndex = mid + 1;
      } else if (arr[mid] == key) {
        System.out.println("yes it is found at " + mid);
        break;
      } else {
        lastIndex = mid - 1;
      }
      mid = (firstIndex + lastIndex) / 2;
    }
    if (firstIndex > lastIndex) {
      System.out.println("Enterd element is Not found");
    }
  }
}