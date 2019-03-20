package javareview.basic.tree;

public class TreeCreator {

  public TreeNode createSampleTree() {
    TreeNode root = new TreeNode('A');
    root.setLeft(new TreeNode('B'));
    root.getLeft().setLeft(new TreeNode('D'));
    root.getLeft().setRight(new TreeNode('E'));
    root.getLeft().getRight().setLeft(new TreeNode('G'));
    root.setRight(new TreeNode('C'));
    root.getRight().setRight((new TreeNode('F')));
    return root;
  }

  public TreeNode createTree(String preOrder, String inOrder) {
    if (preOrder.isEmpty()) {
      return null;
    }
    char rootValue = preOrder.charAt(0);
    int rootIndex = inOrder.indexOf(rootValue);

    TreeNode root = new TreeNode(rootValue);
    root.setLeft(createTree(preOrder.substring(1, rootIndex + 1), inOrder.substring(0, rootIndex)));
    root.setRight(createTree(preOrder.substring(rootIndex + 1), inOrder.substring(rootIndex + 1)));

    return root;
  }
}
