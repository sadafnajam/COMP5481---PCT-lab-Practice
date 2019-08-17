import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class arrayRotate {

	public arrayRotate() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int TestCase = sc.nextInt();
		List<String> l1=new ArrayList<String>();
		while(TestCase-->0)
		{
			int n= sc.nextInt();
			int m=sc.nextInt();
			int arr[][]= new int [m][n];
			for (int j=n-1; j>=0; j--)
			{
				for (int i=0; i<m; i++)
				{
					arr[i][j]=sc.nextInt();
				}
			}
			/*for (int[] row:arr)
			{
				System.out.println(Arrays.toString(row));
			}*/
			
			for (int i=0; i<m; i++)
			{
				String x = "";
				for (int j=0; j<n; j++)
				{
					x = x + arr[i][j]+ " ";
				}
				l1.add(x.trim());
			
			}
			
			
	
		}
		
		for(int i = 0 ; i < l1.size() ; i++) {
			if(i == l1.size() - 1) {
				System.out.print(l1.get(i));	
			}
			else{
				System.out.println(l1.get(i));
			}
			
		}
		
	
		

	}

}

/*
 * 
1
3
3
1 2 3
4 5 6
7 8 9

	for (int i=0; i<m; i++)
		{
			for (int j=0; j<n; j++)
			{
				//System.out.println(arr[i][j]);
				
				System.out.println(arr[i][j]);
			}
		}
*/
