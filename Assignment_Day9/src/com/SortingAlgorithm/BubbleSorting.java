package com.SortingAlgorithm;

public class BubbleSorting {

	public static void main(String[] args) {
	
		int[] arr = {17, 80, 33, 10, 25 };
		bubbleSort(arr);
		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);
		}
	}

	public static void bubbleSort(int[] arr) {
		
		//Algorithm for Bubble sorting
		int len = arr.length;
		int temp = 0;
		for (int i = 0; i < len; i++) {
			for (int j = 1; j < (len); j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
					for(int x:arr) {System.out.print(x+" ");}System.out.println();

	}

}
		}
	}
}