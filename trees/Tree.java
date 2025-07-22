package trees;
import java.util.*;

public class Tree {
	
	static class Node{
		int data;
		Node left,right;
		
		Node(int data){
			this.data = data;
			left = null; right= null;
		}
	}
	
	static class Trees{
		static int idx = -1;
		
		public static Node treeBuilt(int node[]) {
			idx++;
			
			if(node[idx]==-1) { 
				return null;
			}
			
			Node newnode = new Node(node[idx]);
			newnode.left = treeBuilt(node);
			newnode.right = treeBuilt(node);
			
			return newnode;
		}
		
		public static void preorder(Node root,List<Integer> list) {
			if(root == null) {
				return;
			}
			
			list.add(root.data);
			preorder(root.left,list);
			preorder(root.right,list);	
		}
		
		public static List<Integer> pre(Node root){
			List<Integer> list = new ArrayList<>();
			
			preorder(root,list);
			
			return list;
		}
		
		public static void inorder(Node root,List<Integer> list) {
			if(root == null) {
				return;
			}
			
			inorder(root.left,list);
//			System.out.print(root.data+" ");
			list.add(root.data);
			inorder(root.right,list);
		}
		
		public static List<Integer> in(Node root){
			List<Integer> list = new ArrayList<>();
			
			inorder(root,list);
			
			return list;
		}
		
		public static void postorder(Node root,List<Integer> list) {
			if(root == null) {
				return;
			}
			
			postorder(root.left,list);
			postorder(root.right,list);
//			System.out.print(root.data+" ");
			list.add(root.data);
		}
		
		public static List<Integer> post(Node root){
			List<Integer> list = new ArrayList<>();
			
			postorder(root,list);
			
			return list;
		}
		
		public static List<List<Integer>> allTraversal(Node root){
			List<List<Integer>> list = new ArrayList<>();
			
			list.add(pre(root));
			list.add(in(root));
			list.add(post(root));
			
			return list;
		}
		
		public static List<List<Integer>> levelOrder(Node root) {
			List<List<Integer>> list = new ArrayList<>();
			List<Integer> list1 = new ArrayList<>();
			
			if(root == null) {
				return list;
			}
			
			Queue<Node> q1 = new LinkedList<>();
			q1.add(root);
			q1.add(null);
			
			while(!q1.isEmpty()) {
				Node curr = q1.remove();
				
				if(curr!=null) {
					list1.add(curr.data);
					
					if(curr.left!=null) {
						q1.add(curr.left);
					}
					
					if(curr.right!=null) {
						q1.add(curr.right);
					}
				} else {
					list.add(list1);
					list1 = new ArrayList<>();
					if(q1.isEmpty()) {
						break;
					} else {
						q1.add(null);
					}
				}
			}
			
			return list;
		}
		
		public static int height(Node root) {
			
			if(root == null) {
				return 0;
			}
			
			int left = height(root.left);
			int right = height(root.right);
			
			return Math.max(left, right)+1;
		}
		
		public static int diameter(Node root) {
			if(root==null) {
				return 0;
			}
			
			int left = diameter(root.left);
			int right = diameter(root.right);
			int main = height(root.left) + height(root.right);
			
			return Math.max(main, Math.max(left, right));
		}
		
		public static boolean checkBalance(Node root) {
			
			if(root == null) {
				return true;
			}
			
			int lf = height(root.left);
			int rg = height(root.right);
			
			if(Math.abs(rg-lf)>1) return false;
			
			boolean left = checkBalance(root.left);
			boolean right = checkBalance(root.right);
			
			if(!left || !right) return false;
			
			
			return true;
		}
		
		public static int maxSumPath(Node root) {
			int max[] = new int[1];
			max[0] = Integer.MIN_VALUE;
			
			maxSum(root,max);
			return max[0];
		}
		
		public static int maxSum(Node root,int max[]) {
			if(root == null) {
				return 0;
			}
			
			int left = Math.max(0, maxSum(root.left,max));
			int right = Math.max(0, maxSum(root.right,max));
			max[0] = Math.max(max[0],left+right+root.data);
			
			return root.data+Math.max(left, right);
		}
		
		public static List<List<Integer>> zigZagTraversal(Node root){
			List<List<Integer>> list = new ArrayList<>();
			List<Integer> list1 = new ArrayList<>();
			
			Queue<Node> q1 = new LinkedList<>();
			
			q1.add(root);
			q1.add(null);
			
			while(!q1.isEmpty()) {
				Node curr = q1.remove();
				
				if(curr!=null) {
					list1.add(curr.data);
					
						if(curr.right!=null) {
							q1.add(curr.right);
						}
						
						if(curr.left!=null) {
							q1.add(curr.left);
						}
				}else {
					list.add(list1);
					list1 = new ArrayList<>();
					if(q1.isEmpty()) {
						break;
					} else {
						q1.add(null);
					}
				}
				
			}
			
			for(int i =0;i<list.size();i++) {
				if(i%2==0) {
					Collections.reverse(list.get(i));
				}
			}
			
			return list;
		}
		
	}
	
	
	public static void main(String[] args) {
		int nodes[] = {3,9,-1,-1,20,15,-1,-1,7,-1,-1};
		
		Trees tree = new Trees();
		Node root = tree.treeBuilt(nodes);
		
		System.out.println(root.data);
		
		//preorder
////		tree.preorder(root);
//		List<Integer> list = new ArrayList<>();
//		list = tree.pre(root);
//		System.out.println(list);
//		
//		//inorder
//		tree.inorder(root);
//		System.out.println();
//		
//		//postorder
//		tree.postorder(root);
//		System.out.println();
		
//		All traversal
		List<List<Integer>> list = new ArrayList<>();
		
		list = tree.allTraversal(root);
		
		System.out.println(list);
		
		List<List<Integer>> list1 = new ArrayList<>();
		
		list1 = tree.levelOrder(root);
		System.out.println(list1);
		
		System.out.println(tree.height(root));
		
		System.out.println(tree.diameter(root));
		
		System.out.println(tree.checkBalance(root));
		
		System.out.println(tree.maxSumPath(root));
		
		List<List<Integer>> list2 = new ArrayList<>();
		list2 = tree.zigZagTraversal(root);
		
		System.out.println(list2);
	}

}
