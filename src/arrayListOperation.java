
//Initial Template for Java
import java.util.*;
//Position this line where user code will be pasted.
// Driver class with driver function
class arrayListOperation
{
    // Driver code
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0)
		{
		    // Declaring ArrayList
		    ArrayList <Integer> list = new ArrayList<Integer>();
		    int q = sc.nextInt();
		    
		    // Working through queries
		    while(q-- > 0)
		    {
		        char ch = sc.next().charAt(0);
		       opn obj = new opn();
		       if(ch == 'a')
		      {
		        int x = sc.nextInt();
		        obj.insert(list, x);
		        System.out.println("Original list");
		        print(list);
		      }
		    
		      if(ch == 'i')
		      {
		          obj.IncOrder(list);
		          System.out.println("ASC list");
			        print(list);
		      }
		      
		      if(ch == 's')
		      {
		          int ele = sc.nextInt();
		          obj.Search(list, ele);
		      }
		      if(ch == 'd')
		      {
		          obj.DecOrder(list);
		          System.out.println("DESC list");
			        print(list);
		      }
		      
		      
		    }
		 }
	}

	private static void print(ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		
	}
}

/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
// Helper class to handle functions insert(),
// IncOrder(), Search() and DecOrder()
class opn
{
    // Function to insert element into list
    public static void insert(ArrayList<Integer> list, int x)
    {
    	list.add(x);
        // Your code here
        
    }
    
    // Function to sort list in Increasing order
    public static void IncOrder(ArrayList<Integer> list)
    {
        // Your code here
    	Collections.sort(list);
        
    }
    
    // Function to search element in the lise
    // val : element to be searched
    public static void Search(ArrayList<Integer> list, int val)
    {
        
        
        int flag = -1;
        /*
        Your Code here
         * */
        if (list.contains(val))
        {
        
        	System.out.println(list.indexOf(val));
        }
        else if(flag == -1){
         	//System.out.println("Not found");
            System.out.println("-1");
        }
        
        
    }
    
    // Function to sort list in decreasing order
    public static void DecOrder(ArrayList<Integer> list)
    {
    	Collections.reverseOrder();
        // Your code here
    }
}
