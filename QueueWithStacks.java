package question3;

public class QueueWithStacks {

		  SimpleStack stack1; 
		  SimpleStack stack2; 

		  public QueueWithStacks(int capacity) {
		    stack1 = new SimpleStack(capacity); 
		    stack2 = new SimpleStack(capacity);
		  }

		  public void enqueue(int item) {
		    stack1.push(item); 
		  }

		  public int dequeue() {
		    
		    if (stack2.isEmpty()) {
		      while (!stack1.isEmpty()) {
		        stack2.push(stack1.pop());
		      }
		    }

		    
		    if (stack2.isEmpty()) {
		      System.out.println("Queue is empty!");
		      return -1; 
		    } else {
		      return stack2.pop();
		    }
		  }

		  public int peek() {
		    
		    if (stack2.isEmpty()) {
		      while (!stack1.isEmpty()) {
		        stack2.push(stack1.pop());
		      }
		    }

		    
		    if (stack2.isEmpty()) {
		      System.out.println("Queue is empty!");
		      return -1; 
		    } else {
		      return stack2.peek();
		    }
		  }

		  public static class SimpleStack {

		    int[] items;
		    int top; 

		    public SimpleStack(int capacity) {
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

		    public int peek() {
		      if (isEmpty()) {
		        System.out.println("Stack is empty!");
		        return -1; 
		      }
		      return items[top]; 
		    }

		    public boolean isEmpty() {
		      return top == -1;
		    }

		    public boolean isFull() {
		      return top == items.length - 1;
		    }
		  }

		  public static void main(String[] args) {
		    QueueWithStacks queue = new QueueWithStacks(5);

		    queue.enqueue(4);
		    queue.enqueue(5);
		    queue.enqueue(6);

		    System.out.println("Front element (peek): " + queue.peek()); 

		    queue.dequeue();

		    System.out.println("Front element after dequeue: " + queue.peek());
		  }
		}

