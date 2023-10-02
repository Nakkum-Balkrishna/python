public class TestTrees {
    public static void main(String[] args) {
        // Our example tree looks like this:
        //         2
        //       /   \
        //      3     4
        //     / \
        //    5   6

        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);

        node2.left = node3;
        node2.right = node4;
        node3.left = node5;
        node3.right = node6;

        System.out.println("Sum of all values of this tree is (should print 20):");
        System.out.println(sumValues(node2));
    }

    static int sumValues(Node root) {
        if (root == null) {
            return 0;
        }
        return root.data + sumValues(root.left) + sumValues(root.right);
    }
}

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}

________________________________________________________________________________________________________________________________________________________________________

class Node 
{
    int data;
    Node left;
    Node right;

    Node(int data) 
    {
        this.data = data;
    }
    
}

class BinaryTree
{
        /*Node root;
        BinaryTree()
        {
            root=null;
        }*/
       void print(Node node)
        {
            if(node==null)
            {
                System.out.println(node);
                return;
            }
            System.out.print("data here is : "+node.data + "\n");
            print(node.left);
            print(node.right);
            System.out.print(node.data + " \n");
        }
}
public class TestTrees 
{
    public static void main(String[] args) 
    {
        // Our example tree looks like this:
        //         2
        //       /   \
        //      3     4
        //     / \
        //    5   6

        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);

        node2.left = node3;
        node2.right = node4;
        node3.left = node5;
        node3.right = node6;
        node5.left=new Node(7);

        System.out.println("Sum of all values of this tree is (should print 20):");
        System.out.println(sumValues(node2));
        BinaryTree tree = new BinaryTree();
        System.out.println(
            "Preorder traversal of binary tree is ");
        tree.print(node2);
    }

    static int sumValues(Node root) {
        if (root == null) {
            return 0;
        }
        return root.data + sumValues(root.left) + sumValues(root.right);
    }
}