package question1;
import java.util.Scanner;

public class Searchnumber {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter your Size of array:");
		int size=scanner.nextInt();
		int []numbers=new int[size];
		System.out.println("Enter " + size + " numbers:");
	    for (int i = 0; i < size; i++) {
	      System.out.print("Number " + (i + 1) + ": ");
	      numbers[i] = scanner.nextInt();
	      System.out.print("Enter the number to search: ");
	      int searchNum = scanner.nextInt();
	      
	      int count = 0;
	      for (int num : numbers) {
	        if (num == searchNum) {
	          count++;
	      if (count > 0) {
	    	  System.out.println(searchNum + " appears " + count + " times in the array.");
	            } 
	      else {
	              System.out.println(searchNum + " is not present in the array.");
	            }
	        }
	      }
	    }
		
		
		
		

	}

}
