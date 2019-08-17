import java.util.Scanner;

public class TwoSums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		int n;
		n=Integer.parseInt(sc.nextLine());
		int num[]= new int[n];
		for (int i=0; i<n; i++)
		{
			num[i]=sc.nextInt();
		}
		/*for (int i=0; i<n; i++)
		{
			System.out.println(num[i]);
		}*/
		int target;
		System.out.println("Enter target");
		target = sc.nextInt();
		System.out.println(">>>>>>>>>>>>>>>");
		for (int i=0; i<n; i++)
		{
			for (int j=i+1; j<n; j++)
			{
				if(num[i]+num[j]==target)
				{
					
					System.out.print(i);
					System.out.println(j);
				}
			}
			
		}
		
		
		

	}

}
