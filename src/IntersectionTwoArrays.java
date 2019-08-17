import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class IntersectionTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		List<Integer> l=new ArrayList<Integer>();
		
		for (int i=0; i<t; i++)
		{
			int n= sc.nextInt();
			int m = sc.nextInt();
			Set<Integer> s1= new HashSet<>();
			Set<Integer> s2= new HashSet<>();
			for (int j=0; j<n;j++)
			{
				int x = sc.nextInt();
				s1.add(x);
			}
			for (int j=0; j<m;j++)
			{
				int y = sc.nextInt();
				s2.add(y);
			}
			s1.retainAll(s2);
			long num=s1.stream().count();
			l.add((int) num);
		}
		
		for (int i=0; i<l.size(); i++)
		{
			System.out.println(l.get(i));
		}

	}

}
