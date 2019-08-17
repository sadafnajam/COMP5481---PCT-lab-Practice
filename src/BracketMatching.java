import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Matcher;

public class BracketMatching {

	public BracketMatching() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int n = Integer.parseInt(sc.nextLine());
		List<String> l = new ArrayList<String>();
		
		for (int i=0; i<n; i++)
		{
			Stack ss = new Stack();
			String s = sc.nextLine();
			for (int j=0; j<s.length(); j++)
			{
				if (s.charAt(j)=='{' || s.charAt(j)=='(' || s.charAt(j)=='[')
				{
					ss.push(s.charAt(j));
				}
				else if(s.charAt(j)=='}' || s.charAt(j)==')' || s.charAt(j)==']')
				{
					char ch = '1';
					if(s.charAt(j)=='}')
					{
						ch = '{';
					}
					if (s.charAt(j)==']')
					{
						ch = '[';
					}
					if (s.charAt(j)==')')
					{
						ch = '(';
					}
					if(ss.lastElement().equals(ch))
					{
						ss.pop();
					}
				}
			
			}
			
			if(ss.size()==0)
			{
				l.add("VALID");
			}
			else
			{
				l.add("INVALID");
			}
			
		}
		
		for (int k=0; k<l.size();k++)
		{
			if(k==l.size()-1)
				System.out.print(l.get(k));
			else
				System.out.println(l.get(k));
		}
		
		
		
		
		

	}

}
/*
4
(the[is]{valid})
(the[is]{valid))
{the(is[valid])}
(this](is}{valid)
 */