import java.util.*;
class NodeData{
	NodeData left, right;
	String data;
	public NodeData(String data)
	{
	    this.left = this.right = null;
	    this.data = data;
	}
};
public class Lab3 {
	private NodeData root;
	private NodeData target;
	private ArrayList<String> listArray = new ArrayList<String>();
	private String orderTraversal = "";
	int getPosition(String[] sArr, int startIndex, int endingIndex) 
	{ 
	    if (startIndex > endingIndex)
	        return -1; 
	    Stack<String> sta = new Stack<String>();
	    for (int i = startIndex; i <= endingIndex; i++) {
	        if (sArr[i].equals("(")) 
	        	sta.push(sArr[i].toString());
	        else if (sArr[i].equals(")")) { 
	            if (sta.lastElement().equals("(")) { 
	            	sta.pop();
	                if (sta.empty()) 
	                    return i; 
	            }
	        }
	    }
	    return -1; 
	} 
	// tree construction
	String fixSplitIssue(String[] sArr , int index) {
		String _data = sArr[index];
		int pos = index;
		pos++;
		while(sArr[pos] != null) {
			if(sArr[pos].equals("(") || sArr[pos].equals(")")){
				return _data + "-"+  (pos-1);
			}else {
				_data += sArr[pos];
				pos++;
			}
		}
		return _data + "-"+  (pos-1);
	}
	NodeData buildBSTTree(String[] sArr, int startIndex, int endingIndex) 
	{ 
	    if (startIndex > endingIndex) 
	        return null;
	    String[] fixArr = fixSplitIssue(sArr ,startIndex).split("-");
	    NodeData root = new NodeData(fixArr[0]);
	    startIndex = (fixArr[1] != null || !fixArr[1].equals("")) ? Integer.parseInt(fixArr[1]) : startIndex;
	    int pos = -1;
	    if (startIndex + 1 <= endingIndex && sArr[startIndex + 1].equals("(")) 
	    	pos = getPosition(sArr, startIndex + 1, endingIndex);
	    if (pos != -1) { 
	        root.left = buildBSTTree(sArr, startIndex + 2, pos - 1);
	        root.right = buildBSTTree(sArr, pos + 2, endingIndex - 1); 
	    } 
	    return root; 
	}
	int treeHeight(NodeData node)
	{
		if (node != null)
		{
	        return treeHeight(node.left) > treeHeight(node.right) ? (treeHeight(node.left) + 1) : (treeHeight(node.right) + 1);
	    }
		return 0;
	}
    void bstOrderTraversal() 
    { 
        for (int i=1; i<=treeHeight(root); i++) 
        	bstTreeGivenLevel(root, i); 
    }
    void bstTreeGivenLevel (NodeData root ,int treeLevel) 
    { 
        if (root != null) {
        	if (treeLevel > 1) 
	        { 
	        	bstTreeGivenLevel(root.left, treeLevel-1); 
	        	bstTreeGivenLevel(root.right, treeLevel-1); 
	        }else if (treeLevel == 1)
	        	this.orderTraversal += root.data + " ";
        }
    }
    void nodeKdistance(NodeData node, int dist)  
    { 
        if (node != null) { 
	        if (dist == 0)  
	        { 
	        	listArray.add(node.data); 
	            return; 
	        }  
	        else 
	        { 
	        	nodeKdistance(node.left, dist - 1); 
	        	nodeKdistance(node.right, dist - 1); 
	        }
        }
    }
    int searchLeftRightNodes(int dst , int k , NodeData node, boolean isRight) {
    	if (dst != -1)  
        {
            if (dst + 1 == k)  
            { 
            	listArray.add(node.data);
            }
            else
            	nodeKdistance((isRight ? node.right : node.left), k - dst - 2);
            return 1 + dst; 
        }
    	return -1;
    }
    int nodeAtKdistance(NodeData node, NodeData target, int dist)  
    {
        if (node == null) 
            return -1; 
        if (node == target)  
        { 
        	nodeKdistance(node, dist); 
            return 0; 
        }
        int leftdist = nodeAtKdistance(node.left, target, dist);
        if (leftdist != -1)  
        {   
        	return searchLeftRightNodes(leftdist , dist , node , true);
        }
        int rightdist = nodeAtKdistance(node.right, target, dist); 
        if (rightdist != -1)  
        { 
        	return searchLeftRightNodes(rightdist , dist , node, false);
        }
        return -1; 
    } 
    boolean searchTargetNode(NodeData root, String key)
	{
		 if (root == null)
			 return false;
		 else{
			 if (root.data.equals(key))
			 {
				target = root; 
				return true;
			 }
			 else
				 return  searchTargetNode(root.left, key) || searchTargetNode(root.right, key);			 
		 }	 
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		str = str.replace(" ", "");
		str = str.substring(1, str.length()-1);
		String targetName = in.nextLine();
		int distance = Integer.parseInt(in.nextLine());
		in.close();
		if(str.length() != 0 || str != null)
		{
			Lab3 bst = new Lab3();
			String[] str1 = str.split("");
			bst.root = bst.buildBSTTree(str1, 0, str.length()-1);
			bst.bstOrderTraversal();
			bst.searchTargetNode(bst.root, targetName);
			bst.nodeAtKdistance(bst.root, bst.target, distance);
			for(String ite: bst.orderTraversal.split(" "))
			{
			 if(bst.listArray.contains(ite))
				 bst.orderTraversal += ite + " ";
			}
			System.out.print(bst.orderTraversal);
		}
	}
}
