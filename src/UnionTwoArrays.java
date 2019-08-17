import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UnionTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int t=Integer.parseInt(sc.nextLine());
		List<Integer> result=new ArrayList<Integer>();
		
		for (int i=0; i< t; i++)
		{
			int m=sc.nextInt();
			int n=sc.nextInt();
			
			List<Integer> l=new ArrayList<Integer>();
			for (int j=0; j<m+n; j++)
			{
				l.add(sc.nextInt());
			}
			
			result.add((int) l.stream().distinct().count());
			
		}
		for (int i=0; i<result.size(); i++) {
			System.out.println(result.get(i));
		}

	}

}
