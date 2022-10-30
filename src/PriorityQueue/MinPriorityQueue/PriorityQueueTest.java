package PriorityQueue.MinPriorityQueue;

public class PriorityQueueTest {
    public static void main(String[] args) throws PriorityQueueException {
        Priority_Queue<String> pq = new Priority_Queue<>();
        pq.insert("raj" , 15);
        pq.insert("rahul" , 13);
        pq.insert("priya" , 90);
        pq.insert("prem", 150);
        pq.insert("Durgesh",10);

        System.out.println("Size of priority Queue is :- "+pq.size());
        System.out.println("Priority is Empty :- "+pq.isEmpty());

        while (!pq.isEmpty()){
            System.out.println("Value of priority Queue :- "+pq.getMin());
            pq.removeMin();
        }
        System.out.println("Size of priority Queue is :- "+pq.size());
        System.out.println("Priority is Empty :- "+pq.isEmpty());

    }
}
