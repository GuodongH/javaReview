package javareview.basic.tree;

public class InOrder {
  public TreeNode next(TreeNode node) {
    if (node == null) {
      return null;
    }

    if (node.getRight() != null) {
      // if the node has right child node, return the first right child tree's first node
      return first(node.getRight());
    } else {
      // if has no right child tree
      while (node.getParent() != null && node.getParent().getRight() == node) {
        node = node.getParent();
      }
      // node.getParent() != null
      // or node is left child of its parent
      return node.getParent();
    }
  }

  private TreeNode first(TreeNode node) {
    if (node == null) {
      return null;
    }
    TreeNode curNote = node;
    while (curNote.getLeft() != null) {
      curNote = curNote.getLeft();
    }
    return curNote;
  }

  public void traverse(TreeNode root) {
    for (TreeNode node = first(root); node != null; node = next(node)) {
      System.out.print(node.getValue());
    }
    System.out.println();
  }

  public static void main(String[] args) {
    TreeCreator creator = new TreeCreator();
    InOrder inOrder = new InOrder();

    TreeNode sampleTree = creator.createSampleTree();

    inOrder.traverse(sampleTree);

    inOrder.traverse(creator.createTree("", ""));
    inOrder.traverse(creator.createTree("A", "A"));
    inOrder.traverse(creator.createTree("AB", "BA"));
    inOrder.traverse(creator.createTree("ABCD", "DCBA"));
    inOrder.traverse(creator.createTree("ABCD", "ABCD"));
  }
}
