package com.ds.stack;


public class Runner {

    public static void main(String[] args) {
    	 /*Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        
        s.show();

        s.push(60);

        s.show();
       System.out.println("\n"+s.size());
        s.pop();

        s.show();
        System.out.println("\n"+s.size());
        s.pop();

        s.show();
        System.out.println("\n"+s.size());
        s.pop();

        s.show();
        System.out.println("\n"+s.size());
        s.pop();
    	  */
        // Incremental stack
        Dstack s = new Dstack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        
        s.show();
      
        s.pop();
        s.show();
        
        s.pop();
        s.show();
        
        s.pop();
        s.show();
        
        s.pop();
        s.show();
        
        s.pop();
        s.show();
        
       /* System.out.println("\n"+s.size());
        s.pop();

        s.show();
        System.out.println("\n"+s.size());
        s.pop();

        s.show();
        System.out.println("\n"+s.size());
        s.pop();

        s.show();
        System.out.println("\n"+s.size());
        s.pop();
*/
    }



}
