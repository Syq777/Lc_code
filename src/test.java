public class test {
    class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {

        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val,Node _left,Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    };

    public Node treeToDoublyList(Node root) {
        if (root == null) {
            return null;
        }

        Node head = null, tail = null;
        inorder(root, null, head, tail);

        head.left = tail;
        tail.right = head;
        return head;
    }

    private void inorder(Node node, Node pre, Node head, Node tail) {
        if (node == null) {
            return;
        }

        inorder(node.left, pre, head, tail);

        if (pre != null) {
            pre.right = node;
        } else {
            head = node;
        }
        node.left = pre;
        tail = node;
        pre = node;

        inorder(node.right, pre, head, tail);
    }
}
