public class BinaryTree {
BinaryTree parent;
BinaryTree left;
BinaryTree right;
int data;

public BinaryTree(int data) {
this.parent=null;
this.data=data;
this.left=null;
this.right=null;
}

public void insert(BinaryTree root,int data) {
BinaryTree traversalNode=root;
BinaryTree node=new BinaryTree(data);
while(node!=null) {
		if(node.data<traversalNode.data) {
			node=node.left;
		}
		else if(node.data>traversalNode.data) {
			node=node.right;
		}
	}
	node.parent=traversalNode;
	if(node.data<traversalNode.data) {
		traversalNode.left=node;
		node.left=null;
		node.right=null;
	} else {
		traversalNode.right=node;
		node.left=null;
		node.right=null;
	}
}

public void inOrderTraversal(BinaryTree node) {
if(node!=null) {
	inOrderTraversal(node.left);
	System.out.print("=>"+node.data);
	inOrderTraversal(node.right);
	}
}

public static void main(String args[]) {
BinaryTree root=new BinaryTree(5);
root.insert(root,6);
root.insert(root,4);
root.insert(root,7);
root.insert(root,8);
root.insert(root,3);
root.inOrderTraversal(root);
}
}
