package org.example.task2;

public class IntStack {
    private int[] stackArray;
    private int top;
    private int capacity;

    public IntStack() {
        this.capacity = 10000;
        this.stackArray = new int[10000];
        this.top = -1;
    }

    public boolean isEmpty(){
        return top < 0;
    }

    public void clean(){
        for(int i=0;i<=top;i++)
            stackArray[i]=0;
        top=-1;
    }

    public int peek(){
        if(!isEmpty())
        return stackArray[top];
        else return 0;
    }

    public void push(int newElement){
        top++;
        stackArray[top] = newElement;
    }

    public int pop(){
        if(isEmpty())
            return 0;
        else{
            int i = stackArray[top];
            stackArray[top]=0;
            top --;
            return i;
        }
    }

    public int size() {
        return top + 1;
    }
}
