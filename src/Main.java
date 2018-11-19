
import java.util.ArrayList;

/**
 * @author GOURAV
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrList = new ArrayList<>();
		for (int i = 1; i <= 5; i++) {
			arrList.add(i);
		}
		System.out.println("Numbers used to form Binary tree are ::");
		for (int i : arrList) {
			System.out.print(i + "\t");
		}
		System.out.println();
		BinaryTree bTree = new BinaryTree();
		bTree.root = new DataNode(arrList.get(0));
		bTree.root.left = new DataNode(arrList.get(1));
		bTree.root.right = new DataNode(arrList.get(2));
		bTree.root.left.left = new DataNode(arrList.get(3));
		bTree.root.left.right = new DataNode(arrList.get(4));

		print(bTree, "input binary tree");
		System.out.println();
		System.out.println("Converting Binary Tree to its Mirror...");
		bTree.mirror();
		System.out.println("Conversion :SUCCESS");
		print(bTree, "mirror binary tree");

	}

	public static void print(BinaryTree bTree, String param) {
		System.out.println("InOrder Traversal of " + param + " is ::");
		bTree.inOrder();
	}

}
