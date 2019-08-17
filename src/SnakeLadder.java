import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SnakeLadder {

	public SnakeLadder() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		//int arr[][] = new int [n][2];
		//List<Integer> l3 =new ArrayList<Integer>();
		List<Integer> l1 =new ArrayList<Integer>();
		List<Integer> l2=new ArrayList<Integer>();
		for(int i=0; i<n; i++)
		{
			l1.add(sc.nextInt());
			l2.add(sc.nextInt());
		}
		int d=sc.nextInt();
		int arr1[] = new int[d];
		
		for(int i=0; i<arr1.length; i++)
		{
			arr1[i] = sc.nextInt();
		}
		
		int playerA=1;
		int playerB=1;
		
		for(int i=0; i<arr1.length; i=i+2)
		{
			playerA=playerA + arr1[i];
			for (int k=0; k<l1.size(); k++)
			{
				if(l1.contains(playerA))
				{
					int index = l1.indexOf(playerA);
					//System.out.println(index);
					int value = l2.get(index);
					//System.out.println(value);
					playerA = value;
				}
			}
			
			//System.out.println(playerA);
			
		}
		
		for(int i=1; i<arr1.length; i=i+2)
		{
			playerB=playerB + arr1[i];
			for (int k=0; k<l1.size(); k++)
			{
				if(l1.contains(playerB))
				{
					int index = l1.indexOf(playerB);
					//System.out.println(index);
					int value = l2.get(index);
					//System.out.println(value);
					playerB = value;
				}
			}
			
			//System.out.println(playerB);
			
		}
		
		if(playerA>playerB)
		{
			System.out.print('A' + " " + playerA);
		}
		else
		{
			System.out.print('B' + " " + playerB);
		}
	}

	
		
	

}

/*
 * 
3
14 99
99 1
7 14
10
5 1 3 3 1 1 4 1 6 1
*/
