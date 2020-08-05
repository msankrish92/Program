package trails;

import java.util.Arrays;

public class Arr {

	public static void main(String[] args) {

		Character[] arr = { 'A', 'B', 'C' };

		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < arr.length; j++) {
				char temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
//				Arrays.stream(arr).forEach(a -> System.out.print(a));
				for (int k = 1; k < arr.length; k++) {
					char temp1 = arr[1];
					arr[1] = arr[k];
					arr[k] = temp1;
					Arrays.stream(arr).forEach(a -> System.out.print(a));
					temp1 = arr[1];
					arr[1] = arr[k];
					arr[k] = temp1;
				}

				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}

		}

	}

}
