package question4;

public class Alphabetsort {

	public static void main(String[] args) {
		char[] alphabets = {'C', 'A', 'B', 'd', 'E'};

	    System.out.print("Unsorted array: ");
	    printArray(alphabets);

	    bubbleSort(alphabets);

	    System.out.print("Sorted array: ");
	    printArray(alphabets);
	  }

	  public static void bubbleSort(char[] arr) {
	    int n = arr.length;

	    
	    for (int i = 0; i < n - 1; i++) {
	      
	      boolean swapped = false;
	      for (int j = 0; j < n - 1 - i; j++) {
	       
	        if (Character.toLowerCase(arr[j]) > Character.toLowerCase(arr[j + 1])) {
	          char temp = arr[j];
	          arr[j] = arr[j + 1];
	          arr[j + 1] = temp;
	          swapped = true;
	        }
	      }

	      if (!swapped) {
	        break;
	      }
	    }
	  }

	  public static void printArray(char[] arr) {
	    for (char c : arr) {
	      System.out.print(c + " ");
	    }
	    System.out.println();
	  }
	}
