import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountPairsInAnArray {

	public CountPairsInAnArray() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n= sc.nextInt();
		List<Integer> l1= new ArrayList<Integer>();
		
		for(int I =0; I < n ;I++)
		{
			int t = sc.nextInt();
			int arr[] = new int [t];
			for (int k=0; k<t; k++)
			{
				arr[k] = sc.nextInt();
			}
			int xx = 0;
			for (int i=0; i<t; i++)
			{
				for (int j=i+1; j<t ; j++)
				{
					if (i*arr[i]>j*arr[j])
					{
						xx++;
					}
				}
			}
			l1.add(xx);
			
		}
		for (int i=0; i<l1.size(); i++)
		{
			System.out.println(l1.get(i));
		}
		

	}

}
