import java.util.Random;

public class BST{
	
	class Node {
		int value;
		Node left;
		Node right;
	}

	Node create(int item){
		Node node = new Node();
		node.value = item;
		node.left = node.right = null;
		return node;
	}

	Node add(Node node, int item){
		if (node == null)
			return create(item);

		if (item > node.value){
			node = node.right;
			return add(node, item);
		}

		else {
			node = node.left;
			return add(node, item);
		}
	}

	int findMin(Node node){
		while(node.left != null){
			node = node.left;
		}
		return node.value;
	}

	int findMax(Node node){
		if(node.right == null)
			return node.value;
		else
			return findMax(node.right);

	}

	int findElement(Node node, int value){
		int depth = 0;
		if (node == null)
			return 0;
		else if (value > node.value){
			depth++;
			node = node.right;
			return findElement(node, value);
		}
		else if (value < node.value){
			depth++;
			node = node.left;
			return findElement(node, value);
		}
		else if (value == node.value)
			return depth;
		else
			return -1;
	}

	public static void main(String args[]){
		BST bst = new BST();
		Node myNode = null;
		bst.create(8);
		bst.add(myNode, 32);
		bst.add(myNode, 41);
		bst.add(myNode, 24);
		bst.add(myNode, 58);
		bst.add(myNode, 46);
		bst.add(myNode, 27);
		bst.add(myNode, 12);
		bst.add(myNode, 14);

		System.out.println(bst.findMin(myNode));
		System.out.println(bst.findMax(myNode));
		System.out.println(bst.findElement(myNode, 12));
	}
}
