import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MinSumByDigits {

	public MinSumByDigits() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T=Integer.parseInt(sc.nextLine());
		List<Integer> l1= new ArrayList<Integer>();
		
		while(T-->0)
		{
			int n=Integer.parseInt(sc.next());
			int arr[]=new int [n];
			
			for (int i=0; i<n; i++)
			{
				arr[i]=sc.nextInt();
			}
			
			Arrays.sort(arr);
			
			int num1=0;
			int num2=0;
			
			for (int i=0; i<arr.length; i=i+2)
			{
				num1=num1*10+arr[i];
			}
			
			for (int i=1; i<arr.length; i=i+2)
			{
				num2=num2*10+arr[i];
			}
			
			//System.out.print(num2+ " ");
			//System.out.print(num1 );
			
			int sum=num1 + num2;
			l1.add(sum);
			
			
			
			

		}
		for(int i=0; i<l1.size(); i++)
		{
			System.out.println(l1.get(i));
		}
		
		
	}

}
