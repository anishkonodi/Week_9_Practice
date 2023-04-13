/*
 * Queue: Create a class called Queue that implements the queue data structure.
 * The class should have methods to enqueue, dequeue, and peek elements, as well
 * as to check if the queue is empty.
 */

import java.util.*;

class QueueDemo {
    Scanner sc = new Scanner(System.in);
    int front;
    int rear;
    int queue[] = new int[4];

    public void enqueue() {
        for (int j = 0; j < 4; j++) {
            queue[rear] = sc.nextInt();
            rear++;
        }
    }

    public void dequeue() {
        int num = queue[front];
        for (int i = 0; i < rear; i++) {
            queue[i] = queue[i + 1];
        }
        System.out.println(num + " Removed");
        rear--;
    }

    void peek() {
        for (int i = 0; i < rear - 1; i++) {
            System.out.print(queue[i] + " ");
        }
    }

    void isempty() {
        if (rear == front) {
            System.out.println("Queue is empty");
        } else if (rear == 4) {
            System.out.println("Queue is full");
        } else {
            System.out.println("Queue has some space");
        }
    }

    public static void main(String[] args) {
        QueueDemo stak = new QueueDemo();
        stak.isempty();
        stak.enqueue();
        stak.isempty();
        stak.dequeue();
        stak.dequeue();
        stak.isempty();
    }
}