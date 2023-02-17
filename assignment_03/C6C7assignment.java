import java.util.*;
public class C6C7assignment {
	public static double min(double[] array){
		double minNumber = array[0];
		for(int i = 1; i < array.length; i++ ){
			if (array[i] < minNumber){
				minNumber = array[i];
			}
		}
		return minNumber;
	}
	public static int indexOfSmallestElement(double[] array){
		int indexSmallestElement = 0;
		double SmallestNumber = min(array);
		for(int i = 0; i < array.length; i++){
			if (array[i] == SmallestNumber){
				indexSmallestElement = i + 1;
				break;
			}
		}
		return indexSmallestElement;
	}

	public static void bubbleSort(double[] arr) {
		double temp;
		boolean swapped;

		do {
			swapped = false; 
			for (int i = 0; i < arr.length - 1; i++) {
				// If a neighboring pair is not in order, swap values
				if (arr[i] < arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					swapped = true;
				}
			}
		} while (swapped); // Repeat if a value was swapped
	}

  public static void main(String[] args){
		System.out.println("This program will search for the mimimum value and index of an array, and sort it in ascending order.");
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("Please enter 10 numbers, separated by spaces. You can quit the program at any time by having -1 as your first number.");
			double first = input.nextDouble();
			if (first == -1.0) {
				break;
			}
			double[] numbers = new double[10];
			numbers[0] = first;
			for (int i = 1; i < 10; i++) {
				numbers[i] = input.nextDouble();
			}
			System.out.println("Your numbers are: " + Arrays.toString(numbers));
			System.out.println("Your minimum number is " + min(numbers) + " and its index is: " + indexOfSmallestElement(numbers));
			bubbleSort(numbers);
			System.out.println("The sorted array is: " + Arrays.toString(numbers));
		}
		System.out.println("Program exit.");
		input.close();
  }
}