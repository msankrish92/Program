package programs;

public class BubbleSort {

	public static void main(String[] args) {

		int arr[] = { 5, 8, 9, 10, 2, 1 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}
	}
}