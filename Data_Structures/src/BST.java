import java.util.Scanner;

public class BST {
		Node root;
		public BST() {
			this.root=null;
		}		
		
	
	public static void main(String[] args) {
		BST tree = new BST();
		
		tree.root = new Node(10);
			tree.root.left = new Node(7);
				tree.root.left.left = new Node(3);
				tree.root.left.right = new Node(8);
			tree.root.right = new Node(15);
				tree.root.right.left = new Node(12);
					tree.root.right.left.left = new Node(11); 
					tree.root.right.left.right = new Node(13);
				tree.root.right.right = new Node(17);

		
		System.out.println("PRINTING IN ORDER TREE....");
		TreeUtils.inorderPrint(tree.root);
		System.out.println("\n PRINTING PRE ORDER TREE....");
		TreeUtils.preOrderPrint(tree.root);

		System.out.println("\n PRINTING POST ORDER TREE....");
		TreeUtils.postOrderPrint(tree.root);
		
		System.out.println("\n \n By First Method IS BST Tree : "+ TreeUtils.isBST(tree.root,1));
		System.out.println("\n \n IS BST Tree : "+ TreeUtils.isBST(tree.root));
		
/*		System.out.println("\n \n ENTER number TO SEARCH in BST Tree >>");
		Scanner sc = new Scanner(System.in); */
		int num = 8;
		System.out.println("\n \n IS "+num+"  Exist in BST Tree : "+ TreeUtils.isExist(tree.root, num));
		
		System.out.println("\n Is Tree is Full Binary Tree :- "+ TreeUtils.isFullBT(tree.root) );
		System.out.println("\n Is Tree is SKEWED Binary Tree :- "+ TreeUtils.isSkewdTree(tree.root) );

	}
	
}
