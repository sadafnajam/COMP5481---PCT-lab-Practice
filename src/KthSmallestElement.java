import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class KthSmallestElement {

	public KthSmallestElement() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner (System.in);
		int T = sc.nextInt();
		
		
		
		
		ArrayList<String> l3= new ArrayList<String>(); 
		
		for (int i=0; i< T; i++)
		{
			String s="";
			int l2=0;
			ArrayList<Integer> l1= new ArrayList<Integer>(); 
			int N=sc.nextInt();
			int arr[] = new int [N];
			
			for (int j=0; j<N; j++)
			{
				arr[j] = sc.nextInt();
				l1.add(arr[j]);
			}
			
			int k= sc.nextInt();
			
			//System.out.println(l1);
			
			//Collections.reverse(l1);
			Collections.sort(l1);
			//System.out.println(l1);
			
			l2=l1.get(k-1);
			s=s+l2;
			l3.add(s);
			
			//System.out.println(s);
			
		}
		
		for(int c=0; c<l3.size(); c++)
		{
			if(c==l3.size()-1)
			{
				System.out.print(l3.get(c).trim());
			}
			else
			{
				System.out.println(l3.get(c).trim());
			}
				
		}

	}

}
