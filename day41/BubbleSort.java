import java.util.Scanner;

class BubbleSort {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("enter array size");
    int n = s.nextInt();
    int arr[] = new int[n];
    System.out.println("enter array elements");
    for (int i = 0; i < n; i++) {
      arr[i] = s.nextInt();
    }

    System.out.println("Before Sort ");
    for (int i = 0; i < n; i++) {
      System.out.println(arr[i]);
    }
    int temp = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < (n - 1 - i); j++) {
        if (arr[j] > arr[j + 1]) {
          temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    System.out.println("After Sort ");
    for (int i = 0; i < n; i++) {
      System.out.println(arr[i]);
    }

  }
}