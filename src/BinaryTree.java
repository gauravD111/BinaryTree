
/**
 * @author GOURAV
 *
 */
public class BinaryTree {
	DataNode root;

	public void mirror() {
		root = mirror(root);
	}

	DataNode mirror(DataNode dataNode) {
		if (dataNode == null) {
			return dataNode;
		}
		//Create the sub-trees
		DataNode left = mirror(dataNode.left);
		DataNode right = mirror(dataNode.right);

		// Swap the left and right one
		dataNode.left = right;
		dataNode.right = left;
		return dataNode;
	}
	
	public void inOrder(){
		inOrder(root);
	}
	
	public void inOrder(DataNode dataNode){
		if (dataNode == null) {
			return ;
		}
		inOrder(dataNode.left); 
        System.out.print(dataNode.data+"\t"); 
  
        inOrder(dataNode.right); 
	}

}
