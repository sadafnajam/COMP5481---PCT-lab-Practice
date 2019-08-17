import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class subsetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		int sum = 0;
		int arr[] = new int[n];
		int arr1[][] = new int [n][n];
		List<Integer> l1 = new ArrayList<Integer> ();
		
		
		for (int i = 0; i <n; i++)
		{
			arr[i] = sc.nextInt();
		}
		l1.add(0);
		for (int j = 0; j<n; j++)
		{
			l1.add(arr[j]);
		}
		
		for (int a = 0; a <n; a++)
		{
			for (int b = 0; b <n; b++)
			{
				if (a==b) 
				{
					arr1[a][b] = 0;
				}
				else
				{
					arr1[a][b] = arr[a] + arr[b]; 
					if (!l1.contains(arr1[a][b]))
					{
						l1.add(arr1[a][b]);
					}
				//}
			}
		}
	
		
		for (int k = 0; k<n; k++)
		{
			sum = sum + arr[k];
		}
		l1.add(sum);
		
		/*for (int s=0; s<l1.size(); s++)
		{
			System.out.println(l1.get(s));
		}*/
		Collections.sort(l1);
		for (int s=0; s<l1.size(); s++)
		{
			System.out.print(l1.get(s) + " ");
		}
		

	}

}
