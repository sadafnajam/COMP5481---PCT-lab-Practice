import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FindNumberofNumbers {

	public FindNumberofNumbers() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			int N = sc.nextInt();
			int arr[] = new int[N];
			String l2 = "";
			for (int j = 0; j < arr.length; j++) {
				arr[j] = sc.nextInt();
				l2 = arr[j] + l2 + "";
			}

			/*
			 * for (int j=0; j<arr.length; j++) { System.out.println(arr[j]); }
			 */

			int k = sc.nextInt();
			String o = "" + k;
			char c = o.charAt(0);
			int count = 0;

			for (int a = 0; a < l2.length(); a++) {
				if (l2.charAt(a) == c) {
					count++;
				}
			}

			System.out.println(count);

		}

	}

}
