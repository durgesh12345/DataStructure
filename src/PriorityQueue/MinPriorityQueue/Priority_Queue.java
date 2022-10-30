package PriorityQueue.MinPriorityQueue;


import java.util.ArrayList;

public class Priority_Queue <T>{
    private ArrayList<Element<T>> heap;

    public Priority_Queue(){
        heap = new ArrayList<>();
    }
    public void insert(T value, int priority){
    Element<T> e = new Element<>(value, priority);
    heap.add(e);
    int childIndex = heap.size()-1;
    int parentIndex = (childIndex -1)/2;
    while (childIndex > 0){
        if (heap.get(childIndex).priority < heap.get(parentIndex).priority){
            Element temp = heap.get(childIndex);
            heap.set(childIndex, heap.get(parentIndex));
            heap.set(parentIndex, temp);
            childIndex = parentIndex;
            parentIndex = (childIndex-1)/2;
        }else{
            return;
        }
    }
    }
    public T getMin() throws PriorityQueueException {
    if (isEmpty()){
        throw new PriorityQueueException();
    }
    return heap.get(0).value;
    }
    public T removeMin() throws PriorityQueueException  {
    if (isEmpty()){
        throw new PriorityQueueException();
    }
    Element <T> remove = heap.get(0);
    T ans = remove.value;
    heap.set(0,heap.get(heap.size()-1));
    heap.remove(heap.size()-1);

    int parentIndex = 0;
    int lefChildIndex = 2*parentIndex+1;
    int rightChildIndex = 2*parentIndex+2;

   while (lefChildIndex < heap.size()){
       int midIndex = parentIndex;
       if (heap.get(lefChildIndex).priority < heap.get(midIndex).priority){
           midIndex = lefChildIndex;
       }
       if (rightChildIndex < heap.size() &&  heap.get(rightChildIndex).priority < heap.get(midIndex).priority){
           midIndex = rightChildIndex;
       }
       if (midIndex == parentIndex){
           break;
       }

       Element <T> temp = heap.get(midIndex);
       heap.set(midIndex,heap.get(parentIndex));
       heap.set(parentIndex,temp);
       parentIndex = midIndex;
       lefChildIndex = 2*parentIndex+1;
       rightChildIndex = 2*parentIndex+2;
   }
       return ans;
    }
    public int size(){
    return heap.size();
    }
    public boolean isEmpty(){
    if (size() == 0){
    return true;
    }
    return false;
    }
}
