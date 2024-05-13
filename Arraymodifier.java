package question6;

public class Arraymodifier {
	public static int[] deleteElement(int[] array, int index) {
	    if (index < 0 || index >= array.length) {
	      System.out.println("Invalid index.");
	      return array; 
	    }

	    int[] newArray = new int[array.length - 1]; 
	    
	    for (int i = 0; i < index; i++) {
	      newArray[i] = array[i];
	      
	    }
	    for (int i = index + 1; i < array.length; i++) {
	        newArray[i - 1] = array[i]; 
	      }

	      return newArray;
	    }

	    public static void main(String[] args) {
	      int[] numbers = {3, 7, 1, 9, 4};

	      numbers = deleteElement(numbers, 2);

	      System.out.print("Modified array: ");
	      for (int num : numbers) {
	          System.out.print(num + " ");
	        }
	        System.out.println();
	      }


}
