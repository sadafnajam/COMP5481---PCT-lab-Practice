import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveCharacter {

	public RemoveCharacter() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int T = Integer.parseInt(sc.nextLine());
		
		List<String> l1 = new ArrayList<String>();
		
		for (int i=0; i<T; i++)
		{
			String s1 = sc.nextLine();
			String s2 = sc.nextLine();
			String s3="";
			
			for (int j=0; j<s2.length(); j++)
			{
				//System.out.println("Outer j is " + s1.charAt(j));
				for (int k=0; k<s1.length(); k++)
				{
					
					//System.out.println("inner k is " + s2.charAt(k));
					
					if(s2.charAt(j)==s1.charAt(k))
					{ String s = s2.charAt(j)+""; 
						s1 = s1.replace(s,"");
					}
				}
				
			}
			System.out.println(s1);	
		}
		
		
		

	}

}
