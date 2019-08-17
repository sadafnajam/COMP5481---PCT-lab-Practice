import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfPairs {

	public SumOfPairs() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		List<Integer> l1 = new ArrayList<Integer>();

		for (int i = 0; i < T; i++) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			int arrA[] = new int[n / 2];
			int arrB[] = new int[n / 2];
			int c1 = 0, c2 = 0;

			for (int j = 0; j < n; j++) {
				arr[j] = sc.nextInt();
			}
			for (int j = 0; j < arr.length / 2; j++) {
				c1 = c1 + arr[j];
			}

			for (int j = arr.length / 2; j < arr.length; j++) {
				c2 = c2 + arr[j];
			}

			l1.add(c1 * c2);

		}
		
		for(int c=0; c<l1.size();c++)
		{
			if (c==l1.size()-1)
			{
				System.out.print(l1.get(c));
			}
			else
				System.out.println(l1.get(c));
				
		}
	}
}
