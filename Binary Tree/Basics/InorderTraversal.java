public class InorderTraversal {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }
    public static Node createTree(){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        return root;
    }
    public static void inorderTraversal(Node root){
        if(root == null){
            return;
        }
        inorderTraversal(root.left);
        System.out.print(root.data+"->");
        inorderTraversal(root.right);
    }
    public static void main(String args[]){
        Node root = createTree();
        System.out.print("Inorder Traversal: ");
        inorderTraversal(root);
    }
}
