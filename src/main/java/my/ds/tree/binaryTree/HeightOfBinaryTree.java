package my.ds.tree.binaryTree;

class Node {
	int data;
	Node left, right;

	Node(int item) {
		data = item;
		left = right = null;
	}
}

class HeightOfBinaryTree {
	Node root;

	int maxDepth(Node node) {
		if (node == null)
			return 0;
		else {
			/* compute the depth of each subtree */
			int lDepth = maxDepth(node.left);
			int rDepth = maxDepth(node.right);

			/* use the larger one */
			if (lDepth > rDepth)
				return (lDepth + 1);
			else
				return (rDepth + 1);
		}
	}

	public static void main(String[] args) {
		HeightOfBinaryTree tree = new HeightOfBinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.right = new Node(7);
		tree.root.right.right.right = new Node(10);

		System.out.println("Height of tree is : " + tree.maxDepth(tree.root));
	}

}
