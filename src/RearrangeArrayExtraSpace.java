import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RearrangeArrayExtraSpace {

	public RearrangeArrayExtraSpace() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		List<String> l1= new ArrayList<String>();
		for (int i=0; i<T; i++)
		{
			int N = sc.nextInt();
			int arr[] = new int[N];
			int arr2[]= new int [N];
			String s = "";
			for (int j=0; j<N;j++)
			{
				arr[j] = sc.nextInt();
			}
			
			for (int j=0; j<arr.length; j++)
			{
				arr2[j]=arr[arr[j]];
			}
			
			for (int j=0; j<arr.length; j++)
			{
				s = s+arr2[j]+ " ";
			}
			
			l1.add(s);
				
		}
		
		for(int j=0; j<l1.size(); j++)
		{
			if(j==l1.size()-1) {
				System.out.print(l1.get(j).trim());
			}
			else {
				System.out.println(l1.get(j).trim());
			}
				
			
		}

	}

}
