package com.ds.stack;

public class Dstack {

	int capacity = 2;
    int[] stack  =  new int[capacity];
    int top = 0;
   

    public void push(int data){
    	
    	if(size() == capacity){
    		expand();
    	}
        stack[top] = data;
        top++;
    }

    private void expand() {
		int length = size();
	    int[] newStack  =  new int[capacity*2];
	    System.arraycopy(stack, 0, newStack, 0, length);
	    stack = newStack;
	    capacity = capacity*2;
	}

	public void show (){
        for (int n : stack){
            System.out.print(n+" ");
        }
    }

    public void pop(){

        if(isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        top--;
        int data =  stack[top];
        System.out.println("\n"+data);
        stack[top] = 0;
        shrink();
    }

    private void shrink() {
    	int length = size();
    	if(length <= (capacity/2)/2){
    		capacity = capacity/2;
    	}
    	int[] newStack  =  new int[capacity];
	    System.arraycopy(stack, 0, newStack, 0, length);
	    stack = newStack;
	}

	public void peek(){
        top--;
        System.out.println(stack[top]);

    }

    public boolean isEmpty(){
        if(top <=0){
            return true;
        }
        return false;
    }

    public int size(){
        return top;
    }

}
