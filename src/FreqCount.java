import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FreqCount {

	public FreqCount() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		String s= sc.next();
		int len=s.length();
		char[] arr = new char[len];
		arr = s.toCharArray();
		List<Integer> l = new ArrayList<Integer>();
		
		/*for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}*/
		
		for(int i=0; i<arr.length; i++)
		{
			int count = 1;
			for (int j=i+1; j<arr.length; j++)
			{
				if(arr[j]=='0')
					break;
				
				else if (arr[i]==arr[j])
				{
					count = count +1;
					arr[j]= '0';
				}
			}
			l.add(count);
			
		}
		
		
		for(int j=0; j<l.size(); j++) {
			System.out.println(l.get(j));
		}
		
		

	}

}
