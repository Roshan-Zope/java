package BST;

public class BinarySearchTree {
    public static class Node {
        int val;
        Node left, right;

        public Node(int data) {
            val = data;
            left = right = null;
        }
    }

    public static class Bst{
        Node root = null;

        public void insert(int data) {
            if (root == null) {
                root = new Node(data);
                return;
            }
            Node curr = root;
            while (curr != null) {
                if (data < curr.val) {
                    if (curr.left == null) {
                        curr.left = new Node(data);
                        return;
                    }
                    curr = curr.left;
                }
                else {
                    if (curr.right == null) {
                        curr.right = new Node(data);
                        return;
                    }
                    curr = curr.right;
                }
            }
        }

        public void delete(int data) {
            root = delete(root, data);
        }

        public void inorderTraversal() {
            System.out.println("Inorder: ");
            inorderTraversal(root);
            System.out.println();
        }

        public void preorderTraversal() {
            System.out.println("Preorder: ");
            preorderTraversal(root);
            System.out.println();
        }

        public void postorderTraversal() {
            System.out.println("Postorder: ");
            postorderTraversal(root);
            System.out.println();
        }

        public void search(int data) {
            if (search(root, data) != null) {
                System.out.println("Node found");
                return;
            }
            System.out.println("Node not found");
        }

        private Node search(Node root, int data) {
            if (root == null || root.val == data) {
                return root;
            }
            if (data < root.val) {
                return search(root.left, data);
            }
            return search(root.right, data);
        }
        private Node delete(Node root, int data) {
            if (root == null) {
                return root;
            }
            if (data < root.val) {
                root.left = delete(root.left, data);
            }
            else if (data > root.val) {
                root.right = delete(root.right, data);
            }
            else {
                if (root.left == null) {
                    return root.right;
                }
                else if (root.right == null) {
                    return root.left;
                }
                root.val = minVal(root.right);
                root.right = delete(root.right, root.val);
            }
            return root;
        }

        private int minVal(Node curr) {
            int val = curr.val;
            while (curr.left != null) {
                val = curr.left.val;
                curr = curr.left;
            }
            return val;
        }

        private void inorderTraversal(Node root) {
            if (root == null) {
                return;
            }
            inorderTraversal(root.left);
            System.out.print(root.val+" ");
            inorderTraversal(root.right);
        }

        private void preorderTraversal(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.val+" ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }

        private void postorderTraversal(Node root) {
            if (root == null) {
                return;
            }
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            System.out.print(root.val+" ");
        }
    }
    public static void main(String[] args) {
        Bst tree = new Bst();
        tree.insert(50);
        tree.insert(44);
        tree.insert(89);
        tree.insert(40);
        tree.insert(60);
        tree.inorderTraversal();
        tree.preorderTraversal();
        tree.postorderTraversal();
        tree.delete(89);
        tree.inorderTraversal();
        tree.preorderTraversal();
        tree.postorderTraversal();
        tree.search(44);
        tree.search(89);
    }
}
