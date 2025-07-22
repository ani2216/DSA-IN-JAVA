package trees;

public class Practicetree {
	
	static class Node{
		int data;
		Node left,right;
		
		Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	static class Tree{
		static int idx = -1;
		public static Node builtTree(int nodes[]) {
			idx++;
			
			if(nodes[idx] == -1) {
				return null;
			}
			
			Node root = new Node(nodes[idx]);
			
			root.left = builtTree(nodes);
			root.right = builtTree(nodes);
			
			return root;
		}
		
		public static void preorder(Node root) {
			
			if(root == null) {
				return;
			}
			
			System.out.print(root.data+" ");
			preorder(root.left);
			preorder(root.right);
		}
		
		public static void inorder(Node root) {
					
					if(root == null) {
						return;
					}
					
					preorder(root.left);
					System.out.print(root.data+" ");
					preorder(root.right);
		}
		
		public static void postorder(Node root) {
			
			if(root == null) {
				return;
			}
			
			preorder(root.left);
			preorder(root.right);
			System.out.print(root.data+" ");
		}
		
		public static int height(Node root) {
			if(root == null) {
				return 0;
			}
			
			int left = height(root.left);
			int right = height(root.right);
			
			int tree_height = Math.max(left, right)  + 1;
			
			return tree_height;
		}
		
		public static int countNodes(Node root) {
			if(root == null) {
				return 0;
			}
			
			int left = countNodes(root.left);
			int right = countNodes(root.right);
			
			return left + right + 1;
		}
		
		public static int sumNodes(Node root) {
			if(root == null) {
				return 0;
			}
			
			int left = sumNodes(root.left);
			int right = sumNodes(root.right);
			
			return left + right + root.data;
		}
		
	}
	
	public static void main(String[] agrs) {
		int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		
		Node root = Tree.builtTree(nodes);
		System.out.println(root.data);
		System.out.println("Preorder:");
		Tree.preorder(root);
		System.out.println("\nInorder:");
		Tree.inorder(root);
		System.out.println("\nPostorder:");
		Tree.postorder(root);
		System.out.println("\nHeight:");
		System.out.println(Tree.height(root));
		System.out.println("\nCount Nodes:");
		System.out.println(Tree.countNodes(root));
		System.out.println("\nSum Nodes:");
		System.out.println(Tree.sumNodes(root));
	}

}
