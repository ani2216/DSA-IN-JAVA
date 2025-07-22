package trees;

import java.util.*;

public class NormalTree {

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
			if(nodes[idx]==-1) {
				return null;
			}
			
			Node newNode = new Node(nodes[idx]);
			newNode.left = builtTree(nodes);
			newNode.right = builtTree(nodes);
			
			return newNode;
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
			
			inorder(root.left);
			System.out.print(root.data+" ");
			inorder(root.right);
		}
		
		public static void postorder(Node root) {
			if(root == null) {
				return;
			}
			
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data+" ");
		}
		
		public static void levelorder(Node root) {
			
			if(root == null) {
				return;
			}
			
			Queue<Node> q1 = new LinkedList<>();
			
			q1.add(root);
			q1.add(null);
			
			while(!q1.isEmpty()) {
				Node currNode = q1.remove();
				
				if(currNode!=null) {
					System.out.print(currNode.data+" ");
					
					if(currNode.left !=null) {
						q1.add(currNode.left);
					}
					
					if(currNode.right!=null) {
						q1.add(currNode.right);
					}
				} else {
					System.out.println();
					if(q1.isEmpty()) {
						break;
					} else {
						q1.add(null);
					}
				}
			}
			
		}
		
		public static int heigth(Node root) {
			
			if(root == null) {
				return 0;
			}
			
			int leftHeight = heigth(root.left);
			int rightHeight = heigth(root.right);
			
			int maxHeigth = Math.max(leftHeight, rightHeight) + 1;
			
			return maxHeigth;
			
		}
		
		public static int diameter(Node root) {
			if(root == null) {
				return 0;
			}
			
			int left = diameter(root.left);
			int right = diameter(root.right);
			int main_root = heigth(root.left) + heigth(root.right) + 1;
			
			return Math.max(main_root, Math.max(left, right));
		}
		
		public static class TreeDiameter{
			int height,diameter;
			
			TreeDiameter(int height,int diameter){
				this.height = height;
				this.diameter = diameter;
			}
		}
		
		public static TreeDiameter diameter2(Node root) {
			
			if(root == null) {
				return new TreeDiameter(0,0);
			}
			
			TreeDiameter left = diameter2(root.left);
			TreeDiameter right = diameter2(root.right);
			int ht = Math.max(left.height, right.height)+1;
			
			int dt = left.height + right.height + 1;
			
			int new_diam = Math.max(Math.max(left.diameter,right.diameter),dt);
			
			TreeDiameter td = new TreeDiameter(ht,new_diam);
			return td;
		
		}
		
		public static int countNodes(Node root) {
			
			if(root == null) {
				return 0;
			}
			
			int leftCount = countNodes(root.left);
			int rightCount = countNodes(root.right);
			
			System.out.println(leftCount+" "+rightCount);
			
			return leftCount + rightCount + 1;
			
		}
		
		public static int sumNodes(Node root) {
			if(root == null) {
				return 0;
			}
			
			int leftSum = sumNodes(root.left);
			int rightSum = sumNodes(root.right) ;
			System.out.println(leftSum+" "+rightSum);
			
			return leftSum + rightSum + root.data;
		}
		
		
	}
	
	public static void main(String[] args) {
		int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		
		Tree tree = new Tree();
		Node root = Tree.builtTree(nodes);
//		System.out.println(root.data);
//		tree.preorder(root);
//		System.out.println();
//		tree.inorder(root);
//		System.out.println();
//		tree.postorder(root);
//		System.out.println();
//		tree.levelorder(root);
//		System.out.println(tree.heigth(root));
//		System.out.println(tree.countNodes(root));
		System.out.println(tree.sumNodes(root));
//		System.out.println(tree.diameter(root));
//		System.out.println(tree.diameter2(root).diameter);
	}

}
