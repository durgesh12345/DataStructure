package Queue.Practice;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class queuecall {
    public static void main(String[] args) {
   Queue<Integer> qu = new LinkedList<>();

        QueueUsingStack q = new QueueUsingStack();
        q.push(10);
        q.push(20);
        q.push(30);
        q.push(40);
        q.push(50);
        System.out.println(q.getsize());
        System.out.println(q.pop());
        System.out.println(q.getsize());
        System.out.println(q.top());
        System.out.println(q.isEmpty());
    }
}
