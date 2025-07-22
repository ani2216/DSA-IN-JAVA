package trees;
import java.util.*;

public class SumOfNodesAtKLevel {
	
	static class Node{
		int data;
		Node left,right;
		
		Node(int data){
			this.data = data;
		}
	}
	
	public static class Tree{
		static int idx = -1;
		
		public static Node builtTree(int node[]) {
			idx++;
			if(node[idx]==-1) {
				return null;
			}
			
			Node newNode = new Node(node[idx]);
			newNode.left = builtTree(node);
			newNode.right = builtTree(node);
			
			return newNode;
		}
		
		public static int sumKthLevel(Node root,int k) {
			if(root == null) {
				return 0;
			}
			
			int level = 1;
			int sum = 0;
			
			Queue<Node> q1 = new LinkedList<>();
			
			q1.add(root);
			
			
			while(!q1.isEmpty()) {
				int size = q1.size();
				
				
				for(int i =0;i<size;i++) {
					Node currNode = q1.remove();
					
					if(level == k) {
						sum +=currNode.data;
					}
					
					if(currNode.left!=null) {
						q1.add(currNode.left);
					}
					
					if(currNode.right!=null) {
						q1.add(currNode.right);
					}
				}
				
				if(level == k) {
					break;
				}
				
				level++;
			}
			return sum;
			
		}
	}
	
	public static void main(String[] args) {
		int nodes[] = {1,2,3,-1,-1,4,-1,-1,5,-1,6,-1,-1};
	
		Tree tree = new Tree();
		Node root = tree.builtTree(nodes);
		
		System.out.println(root.data);
		System.out.println(tree.sumKthLevel(root, 1));
	}

}
