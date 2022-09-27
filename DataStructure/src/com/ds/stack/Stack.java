package com.ds.stack;

public class Stack {

    int[] stack  =  new int[5];
    int top = 0;

    public void push(int data){
    	
    	if(stack.length == top){
    		System.out.println("Stack is Full");
    		return;
    	}
        stack[top] = data;
        top++;
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
