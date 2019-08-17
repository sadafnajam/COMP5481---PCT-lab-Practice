import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc= new Scanner (System.in);
		String s=Sc.nextLine();
		int len=s.length();
		int current =1;
		int max=1;
		int previous;
		int i;
		int visited[]= new int[-1];
		
		visited[s.charAt(0)] = 0;		
		//char[] arr=s.toCharArray();
		//List <String> store= new ArrayList<String>();
		for (i=1; i< len; i++)
		{
			previous = visited[s.charAt(i)];
			if (previous == -1 || i-current> previous)
			{
				current++;
			}
			else {
				if (current>max)
				{
					max=current;
					current = i-previous;
					
				}
			}
			visited[s.charAt(i)]=i;
		}
			if (current>max)
			{
				max=current;
				current = i-previous;
				
			}
			
			System.out.println(max);
		
		
		
			

	}

}
