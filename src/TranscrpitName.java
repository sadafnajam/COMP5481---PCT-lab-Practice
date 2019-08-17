import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TranscrpitName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner (System.in);
		String[] input = sc.nextLine().split(" ");
		
		//List<String> l1= new ArrayList<String>();
		//System.out.println(input);
		/*
		for (int i=0; i<input.length; i++)
		{
			System.out.println(input[i]);
		}*/
		//System.out.println(input.length);
		if(input.length==3)
		{
			System.out.print(input[2] + " " + input[0] + " " + input[1]);
		}
		
		else if(input.length==1)
		{
			System.out.print(input[0]);
		}
		else if (input.length==2)
		{
			char last=input[1].charAt(input[1].length()-1);
			if(last =='a' || last =='e' || last =='i' || last =='o' || last =='u' || last =='A' || last =='E' || last =='I' || last =='O' ||last =='U')
			{
				System.out.print(input[1] + " " + input[0]);
			}
			else
				{
				System.out.print(input[0] + " " + input[1]);
				}
		}
		

	}

}
/*
Jashan Deep Singh
Prithviraj Dajisaheb Chavan
Sadaf
Barack Obama
Miachael Jackson
*/