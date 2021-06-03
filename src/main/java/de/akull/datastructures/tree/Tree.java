public class BinaryTree {
	private TreeNode root;
    
	//Here the NODE class comes that is declared in other file
	
	public void createBinaryTree()
	{
		TreeNode first=new TreeNode(10);
		TreeNode second=new TreeNode(20);
		TreeNode third=new TreeNode(30);
		TreeNode fourth=new TreeNode(40);
		TreeNode fifth=new TreeNode(50);
		
		root=first;
		first.left=second;
		first.right=third;
		
		second.left=fourth;
		second.right=fifth;
	}
	
	public void preorder(TreeNode root)
	{
		if(root==null)
		{
			return;
		}
		
		System.out.print(root.data+ " ");
		preorder(root.left);
		preorder(root.right);
		
	}
	
	public void inorder(TreeNode root)
	{
		if(root==null)
		{
			return;
		}
		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
	}
	
	public void postorder(TreeNode root)
	{
		if(root==null)
		{
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" ");
	}
	
	public int findmax(TreeNode root)
	{
		if(root == null)
		{
			return Integer.MIN_VALUE;
		}
		int result=root.data;
		int left=findmax(root.left);
		int right=findmax(root.right);
		if(left<right)
		{
			result=right;
		}
		else
		{
			result=left;
		}
		return result;
	}
	
	public static void main(String args[])
	{
		BinaryTree bt=new BinaryTree();
		bt.createBinaryTree();
		
		System.out.println("Pre order Traversal: ");
		bt.preorder(bt.root);
		
		System.out.println("\n");
		System.out.println("\nIn order Traversal: ");
		bt.inorder(bt.root);
		
		System.out.println("\n");
		System.out.println("\nPost Order Traversal: ");
		bt.postorder(bt.root);
		
		System.out.println("\n");
		int res=bt.findmax(bt.root);
		System.out.println("Maximum value is: " +res);
	}
}
