import java.awt.print.Printable;

import com.sun.jdi.Value;

public class BST {

	BSTNODE root;
	
	public BST() {
		// TODO Auto-generated constructor stub
		root=null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST bs=new BST();	
		bs.insert(12);
		bs.insert(8);
		bs.insert( 11);
		bs.insert( 7);
		bs.insert( 13);
		bs.insert(9 );
		
		bs.printTree();
	}

//	
	public void insert(Integer x) {
		if (root == null) {
			root = new BSTNODE(null, null,x);
return;
		}
 
		BSTNODE n = root;
		boolean inserted = false;

		while(!inserted){
			if(x.compareTo(n.value)<0) {
				//space found on the left
				if(n.left == null){
					n.left = new BSTNODE(null,null,x);
					inserted = true;
				}
				//keep looking for a place to insert (a null)
				else {
					n = n.left;
				}
			}				
			else if(x.compareTo(n.value)>0){ 
				//space found on the right					
				if(n.right==null){
					n.right = new BSTNODE(null,null,x);
					inserted = true;
				}
				//keep looking for a place to insert (a null)
				else {
					n = n.right;
				}
			}
		}

	}


	public BSTNODE createNewNode(int val) {
		// TODO Auto-generated method stub
		BSTNODE n=new BSTNODE();
		n.value=val;
		n.left=null;
		n.right=null;
		return n;
	}
	
	public void printTree()
	{
		if(root==null)
			System.out.println("Empty Tree");
		else
			printTree(root);
	}
	public void printTree(BSTNODE root)
	{
		if(root!=null)
		{
			//Printing Inorder Traversal
//			System.out.println("In Order Traversal");
//			printTree(root.left);
//			System.out.println("The elements are: " + root.value);
//			printTree(root.right);
			
			//System.out.println("Pre Order Traversal");
			System.out.println("The elements are: " + root.value);
			printTree(root.left);	
			printTree(root.right);
			
//			System.out.println("Post Order Traversal");
//			printTree(root.left);		
//			printTree(root.right);
//			System.out.println("The elements are: " + root.value);
		}
	}
}
