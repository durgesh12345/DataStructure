package Queue.Practice;

import java.util.Stack;

 class QueueUsingStack {
    Stack<Integer> s1;
    Stack<Integer> s2;
    public QueueUsingStack(){
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public int getsize(){
        int size = s1.size();
        return size;
    }
    public boolean isEmpty(){
        int size = s1.size();
        return size==0;
    }
    public void push(int element){
        s1.push(element);
    }
    public int pop(){
        while ( !s1.isEmpty()){
            s2.push(s1.peek());
            s1.pop();
        }
      int pop =  s2.pop();
        while (!s2.isEmpty()){
            s1.push(s2.peek());
            s2.pop();
        }
        return pop;
    }
    public int top(){
        while (!s1.isEmpty()){
            s2.push(s1.peek());
            s1.pop();
        }
       int pop = s2.pop();
        while (!s2.isEmpty()){
            s1.push(s2.peek());
            s2.pop();

        }
        return pop;
    }
}


