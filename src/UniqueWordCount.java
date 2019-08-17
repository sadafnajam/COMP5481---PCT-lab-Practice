import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UniqueWordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		String s= sc.nextLine().toLowerCase().replaceAll("\\W+", ",");
		String arr[]=s.split(",");
	
		List<String> l = Arrays.asList(arr);
		
	/*	List<String> l= new ArrayList<String>();
		for (int i=0; i<arr.length; i++)
		{
			l.add(arr[i]);
		}
	*/	
		/*for (int i=0; i<l.size(); i++)
		{
			System.out.println(l.get(i));
		}*/
		
		int count = (int) l.stream().distinct().count();
		
		System.out.print(count);
		
		

	}

}
/*
prithviraj dajisaheb Chauhan
*/