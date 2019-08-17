import java.util.*;
import java.lang.*;
import java.lang.reflect.Array;
import java.io.*;


public class NearlySortedALgorithm {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t=Integer.parseInt(sc.nextLine());
		ArrayList <String> list1 = new ArrayList<String>();
		
		while (t-->0)
		{
			ArrayList <Integer> list = new ArrayList<Integer>();
			int n = sc.nextInt();
			int k = sc.nextInt();
			
			while (n-->0)
			{
				
				list.add(sc.nextInt());
				
				nearlySort(list, k);
			}
			//System.out.println(list.size());
			String temp = "";
			for (int h=0; h<list.size(); h++)
			{
				temp = temp + list.get(h) + " ";
			}
			 list1.add(temp.trim());
			
		}
		System.out.println(list1);
		for (int h=0; h<list1.size(); h++)
		{
			System.out.println(list1.get(h));
		}
		//System.out.println(list);
		
	}

	private static void nearlySort(ArrayList<Integer> list, int k) {
		// TODO Auto-generated method stub
		
		for (int i=1; i<list.size(); i++)
		{
			int index = i;
			for (int s=0; s<k; s++)
			{
				if(list.get(index-1)>list.get(index))
				{
					Collections.swap(list, index, index-1);
				}
				index=index-s;
				if(index<=0)
				{
					break;
				}
			}

		}
		
	}
	

}
