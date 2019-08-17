import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class freq {

	public freq() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String s;
		s = sc.nextLine();
		s=s.trim();
		List<Integer> l = new ArrayList<Integer>();
		//s=s.replaceAll(" ", "");
		s=s.replaceAll("\\W+", "");
		
		int len = s.length();
		char[] c = new char[len];		
		c= s.toCharArray();
		/*for (int i=0;i<c.length; i++)
		{
			System.out.println(c[i]);
		}
		*/
		for(int i=0; i<s.length(); i++)
		{
			int count =1;
			for(int j=i+1; j<s.length(); j++)
			{
				if(s.charAt(i)=='1')
				{
					i=i+1;
					count = count-1;
				}
				else if(s.charAt(i)==s.charAt(j))
				{
					count = count+1;
					char ch = s.charAt(j);
					s = s.replace(ch, '1');
				}
			}
			l.add(count);
		}
		
		for(int i=0; i<l.size(); i++)
		{
			System.out.println(l.get(i));
		}
		
		

	}

}
