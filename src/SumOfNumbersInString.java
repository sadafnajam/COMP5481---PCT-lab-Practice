import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfNumbersInString {

	public SumOfNumbersInString() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		int T = Integer.parseInt(sc.nextLine());
		List<String> l1 = new ArrayList<String>();
		
		int sum = 0;
		
		for (int i=0; i<T; i++)
		{	
			l1.add(sc.nextLine());
		}
		String temp = "";
		/*for (int i=0; i<l1.size(); i++)
		{
			String s = l1.toString();
			char ch = s.charAt(i);
			if(Character.isDigit(ch))
			{
				temp = temp+ch;
			}
			else
			{
				sum = sum + Integer.parseInt(temp);
				temp ="";
			}
		}*/
		
		for (int i=0; i<l1.size(); i++)
		{
			String s = l1.get(i).toString();
			System.out.println(s);
			for(int j = 0 ; j < s.length();j++) {
				char ch = s.charAt(j);
				if(Character.isDigit(ch))
				{
					temp = temp+ch;
				}
				else
				{if(!temp.equals("")) {
					sum = sum + Integer.parseInt(temp);
					
					temp ="";
				}
					
				}	
				System.out.println(sum);
			}
			
		}
		//sum = sum + Integer.parseInt(temp);
		


	}

}
