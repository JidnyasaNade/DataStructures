package com.ds.queue;

public class Queue {

    int[] queue  =  new int[5];
    int size = 0;
    int front = 0;
    int rear = 0;

    public void enQueue(int data){
    	
    	if(isFull()){
    		return;
    	}
    	queue[rear] = data;
    	rear++;
    	size++;
    }

    public void show (){
        for (int i= 0; i<size; i++){
            System.out.print(queue[i]+ " ");
        }
    }

	public void dQueue() {
		if (!isEmpty()) {
			int data = queue[front];
			front++;
			size--;
			System.out.println("\n"+data);
		} 
	}
    
    public boolean isFull(){
    	if(rear == queue.length){
    		System.out.println("queue is full");
    		return true;
    	}
    	return false;
    }

    public boolean isEmpty(){
    	if(size == 0){
    		System.out.println("queue is empty");
    		return true;
    	}
    	return false;
    }
    
}
