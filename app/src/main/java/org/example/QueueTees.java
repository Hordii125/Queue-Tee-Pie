package org.example;

public class QueueTees {
    private Cutie[] cuties;
    private int size;
    private int front;
    private int rear;
    private int capacity;

    public QueueTees(int capacity) {
        this.capacity = capacity;
        cuties = new Cutie[capacity];
        size = 0;
        front = 0;
        rear = -1;
    }

    //getters for size and capacity
    public int size() {
        return size;
    }

    public int capacity() {
        return capacity;
    }

    //methods to check if the queue is empty or full
    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void enqueue(Cutie cutie) {
        if (isFull()) {
            System.out.println("Queue is full!");
            return;
        }
        //circular increment of rear index
        rear = (rear + 1) % capacity;
        //add the new cutie to the queue
        cuties[rear] = cutie;
        //increment the size of the queue
        size++;
    }

    public String dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return null;
        }
        //get the cutie at the front of the queue
        Cutie cutie = cuties[front];
        //circular increment of front index
        front = (front + 1) % capacity;
        //decrement the size of the queue
        size--;
        return cutie.tag();
    }

    
}
