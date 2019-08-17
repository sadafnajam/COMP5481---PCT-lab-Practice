import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TwiceCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=  new Scanner (System.in);
		
		int T=Integer.parseInt(sc.nextLine());
		
	
		List<Integer> l1 = new ArrayList<Integer>();
		
		for (int i=0; i<T; i++)
		{
			int n=sc.nextInt();
			String[] arr = new String [n];
			List<String> l = new ArrayList<String>();
			
			for (int j=0; j<arr.length; j++)
			{
				arr[j] = sc.next();
			}
			/*
			for (int j=0; j< arr.length; j++)
			{
				System.out.println(arr[j]);
			}*/
			
			for (int j=0; j<arr.length; j++)
			{
				int count = 1;
				//System.out.println("j is "+ j + " "+ arr[j]);
				for(int k=j+1; k<arr.length; k++)
				{
					//System.out.println("k is "+ k + " "+ arr[k]);
					if(arr[j].equals(arr[k]))
					{
						if (arr[k]=="-1")
						break;
						else {
							count++;
							arr[k] = "-1";
						}
						
					}
					 
				}
				if(count==2)
				{
					l.add(arr[j]);
				}
			}
			int count = (int) l.stream().count();
			l1.add(count);
			
			
 		}
		for (int i=0; i<l1.size(); i++)
		{
			System.out.println(l1.get(i));
		}
		
		
		

	}

}
/*
 * 1
10
hate love peace love peace hate love peace love peace
*/
