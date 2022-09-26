package day46_collections;

import java.util.*;

public class QueueExamples {
    public static void main(String[] args) {
        /*
        Queue
Queue is an interface inheriting the Collection interface

    FIFO: First In First Out
Think of a line
P1 <- P2 <- P3
P1 leaves first because they are at the beginning of the Queue
P2 <- P3

    Deque: an interface that allows access to elements from the beginning or end child of the Queue interface

    Classes that implement Queue:

    PriorityQueue: data structure that stores elements based on its own  priority. Sometimes looks like natural order, but cannot be predicted (random)
!!! does not accept null
    Note: Even though Queue is the interface the PriorityQueue has its own implementation of the idea

    ArrayDeque: implementing Deque. More proper queue type, also has access to both side of the collection,
!!! does not accept null

    Methods:
        - add()       -----       offer()
        - remove()    -----       poll()
        - element()   -----       peek()
The methods on the left can cause an exception to occur whenever the method fails
The method on the right just return null
         */

        Queue<Integer> queue = new PriorityQueue<>(); // FIFO - first in first out
        queue.add(3);
        queue.add(10);
        queue.add(8);
        queue.add(2);
        System.out.println(queue);
        // [2, 3, 8, 10]

        System.out.println(queue.peek()); // 2 has a priority
        System.out.println(queue.poll()); // poll = remove => now the priority is changed

        System.out.println(queue);
        // [3, 10, 8]

        System.out.println("==========================================");

        ArrayDeque<String> queue2 = new ArrayDeque<>();
        queue2.offer("java"); // offer just adds to the queue -> could use add()
        queue2.offer("tuesday");
        queue2.offer("soft skills");
        queue2.offer("automation");

        System.out.println(queue2);
        System.out.println(queue2.peek()); // peek() = element()
        // [java, tuesday, soft skills, automation]
        // java

        System.out.println(queue2.poll()); // poll() = remove()
        System.out.println(queue2);
        // java
        // [tuesday, soft skills, automation]

        System.out.println(queue2.peek());
        // tuesday

        queue2.offerFirst("API"); // method from Deque
        System.out.println(queue2);
        // [API, tuesday, soft skills, automation]

        // queue2.add(null);  // null is not allowed in queue types
        queue2.pollLast();
        System.out.println(queue2);
        // [API, tuesday, soft skills]

//        new ArrayDeque<>().remove(); // causes exception
//        new ArrayDeque<>().poll(); // returns null, but no exception

        List<Integer> list = new LinkedList<>();
        // list.addFirst(4);  NO! => solution is to cast
        // casting:
        ((Deque)list).addFirst(4);













    }
}
