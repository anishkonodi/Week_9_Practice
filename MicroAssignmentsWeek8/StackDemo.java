// //Stack: Create a class called Stack that implements the stack data structure. 
// //The class should have methods to push, pop, and peek elements, as well as to check if the stack is empty.

// import java.util.*;

// class StackDemo {
//     Scanner sc = new Scanner(System.in);
//     int index = -1;
//     int max = 3;
//     int stack[] = new int[max];

//     void push() {
//         for (int i = index + 1; i < max; i++) {
//             stack[i] = sc.nextInt();
//             index++;
//             isempty();
//         }
//     }

//     void pop() {
//         if (index > -1) {
//             System.out.println(stack[index] + " removed");
//             index--;
//         } else {
//             System.out.println("Stack is empty11");
//         }
//     }

//     void peek() {
//         System.out.println("enter element to check it there or not");
//         int num = sc.nextInt();
//         int count = 0;
//         for (int i = 0; i < max; i++) {
//             if (stack[i] == num) {
//                 System.out.println("found");
//                 count++;
//                 break;
//             }
//         }
//         if (count == 0) {
//             System.out.println("not found");
//         }
//     }

//     void isempty() {
//         if (index == -1) {
//             System.out.println("Stack is empty");
//         } else if (index > -1 && index < max - 1) {
//             System.out.println("Stack has some space");
//         } else {
//             System.out.println("Stack is full");
//         }
//     }

//     public static void main(String[] args) {
//         StackDemo stak = new StackDemo();
//         stak.isempty();
//         stak.push();
//         stak.pop();
//         stak.pop();
//         stak.isempty();
//         stak.push();
//         stak.peek();
//     }
// }