import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		List<String> l1 = new ArrayList<String>();

		for (int i = 0; i < t; i++) {

			int n = sc.nextInt();
			int d = sc.nextInt();
			int arr[] = new int[n];

			for (int j = 0; j < n; j++) {
				arr[j] = sc.nextInt();
			}

			String s = "";
			for (int j = 0; j < d; j++) {

				int temp = arr[0];

				for (int k = 0; k < arr.length - 1; k++) {

					arr[k] = arr[k + 1];

				}
				arr[arr.length - 1] = temp;

			}

			for (int l = 0; l < arr.length; l++) {
				s = s + arr[l] + " ";

			}

			l1.add(s);
		}

		for (int x = 0; x < l1.size(); x++) {
			System.out.println(l1.get(x));

			/*
			 * if(x == l1.size()-1) { System.out.print(l1.get(x).trim()); }else {
			 * System.out.println(l1.get(x).trim()); }
			 */

		}

	}

}