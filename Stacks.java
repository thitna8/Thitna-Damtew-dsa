package question2;

public class Stacks {
	int[] items;
	int top; 

	  public Stacks(int capacity) {
	    items = new int[capacity];
	    top = -1; 
	  }
	  
	  public void push(int item) {
	    if (isFull()) {
	      System.out.println("Stack is full!");
	      return;
	    }
	    items[++top] = item; 
	  }

	  public int pop() {
	    if (isEmpty()) {
	      System.out.println("Stack is empty!");
	      return -1; 
	    }
	    return items[top--];
	  }

	  public boolean isEmpty() {
	    return top == -1;
	  }

	  public boolean isFull() {
	    return top == items.length - 1;
	  }
	}


