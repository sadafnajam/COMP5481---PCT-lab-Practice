import java.util.Scanner;

public class NumberFollowingAattern {

	public NumberFollowingAattern() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int T= Integer.parseInt(sc.nextLine());
		
		for (int i=0; i<T; i++)
		{
			String s=sc.next();
			int DCounter = s.length()+1;
			int ICounter = 1;
			//System.out.println(len);
			
			for (int j=0; j<s.length(); j++)
			{
				if(s.charAt(j)=='D')
				{
					System.out.print(DCounter);
					DCounter = DCounter - 1 ;
					if(j==s.length()-1)
					{
						//DCounter = DCounter - 1;
						System.out.println(DCounter);
					}
				}
				
				else if (s.charAt(j)=='I')
				{
					System.out.print(ICounter);
					ICounter = ICounter + 1;
					if(j==s.length()-1)
					{
						//DCounter = DCounter - 1;
						System.out.println(ICounter);
					}
					
				}
				
				
				
			}
		}

	}

}
