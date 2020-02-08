
public class TreeUtils {
	Node root;
	static Node prev;
	
	static boolean  isBST(Node root, int n){
		 return isBST(root,null,null);
	}
	
	static boolean isBST(Node curr, Node l, Node r){
			if(curr == null)
					return true;
			
			if(l!= null && curr.data >= l.data)
					return false;
			if(r!=null && curr.data <= r.data )
					return false;
			
			return (isBST(curr.left,curr,r) && isBST(curr.right,l,curr) );
			
	}
	
	 static boolean isBST(Node node) 
	    { 
	        // traverse the tree in inorder fashion and 
	        // keep a track of previous node 
	        if (node != null) 
	        { 
	            if (!isBST(node.left)) 
	                return false; 
	  
	            // allows only distinct values node 
	            if (prev != null && node.data <= prev.data ) 
	                return false; 
	            prev = node; 
	            return isBST(node.right); 
	        } 
	        return true; 
	    } 
	
	
	static void inorderPrint(Node head){
		
		if(head == null){
				return;
		}
		if(head.left == null && head.right == null){
			System.out.print(head.data+" ");
			return;
		}							
		inorderPrint(head.left);
		System.out.print(head.data+" ");
		inorderPrint(head.right);
	}
	
	
	static void preOrderPrint(Node head){
		
		if(head == null)
			return;
					
		System.out.print(head.data+" ");
		
		if(head.left == null && head.right == null){
			return;
		}							
		preOrderPrint(head.left);
		preOrderPrint(head.right);
	}
	
	static void postOrderPrint(Node head){	
		
		if(head == null)
				return;
		
		if(head.left == null && head.right == null){
			System.out.print(head.data+" ");
			return;
		}							
		postOrderPrint(head.left);
		postOrderPrint(head.right);			
		System.out.print(head.data+" ");
	}
	
	
	static boolean isExist(Node head,int num){
		return Search(head, num);
	}
	
	static boolean Search(Node head, int num){
			if(head == null )
				return false;
			
			int d = head.data;
			
			if(d== num)
					return true;
			if(d > num)
				return Search(head.left,num);
			if(d < num)
				return Search(head.right,num);
			
			return false;
	}
	
	static boolean isFullBT(Node head){
			if(head == null)
				return false;
			if( (head.left == null && head.right != null) || (head.left != null && head.right == null))
					return false;
			if(head.left == null && head.right == null)
					return true;
			
			return(isFullBT(head.left) && isFullBT(head.right));
	}


	static boolean isSkewdTree(Node head){
			if(head == null)
				return false;
			if(head.left != null && head.right != null)
					return false;
			
			if(head.left != null && head.right == null)
				return isSkewdTree(head.left);
				
			if(head.left == null && head.right != null)
					return isSkewdTree(head.right);
			
			return true;


			
			
	}

}
