import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc=new Scanner(System.in);

		String str=Sc.nextLine();
		String letters=Sc.nextLine();
		int count = 0;
		//System.out.println(str);
		System.out.println(letters);
		int len=str.length();
		//System.out.println(len);
		List <String> store= new ArrayList<String>();
		if(str.length() <= 70 && str.length() >= letters.length())
		{
			for (int i=0; i < len; i++)
			{
				for (int j=i+1; j <= len ; j++)
				{
					String str1 = str.substring(i, j);
					store.add(str1);
					System.out.println(str1);
					//count++;
					
				}
				//String str1= str.substring(i);
				//System.out.println(str1);
			}
			for (int k = 0; k < store.size(); k++)
			{
				
				if(store.get(k) == letters)
				{
					System.out.println("Found");
				}
					
				
					
			}
		}

	}

}
