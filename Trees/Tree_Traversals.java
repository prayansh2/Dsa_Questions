package Trees;

public class Tree_Traversals {

    Node root;

    static class Node{
        int val;
        Node left;
        Node right;

        Node(int val)
        {
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }

    public void inorder(Node root)
    {
        if(root!=null)
        {
            inorder(root.left);
            System.out.print(root.val+"  ");
            inorder(root.right);
        }
    } public void preorder(Node root)
    {
        if(root!=null)
        {
            System.out.print(root.val+"  ");
            preorder(root.left);
            preorder(root.right);
        }
    } public void postorder(Node root)
    {
        if(root!=null)
        {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.val+"  ");
        }
    }



    static class BinaryTree{
        static int index=-1;
        public static Node buildTree(int a[])
        {
            index++;
            if(a[index]==-1)
                return  null;
            Node newNode=new Node(a[index]);

            newNode.left=buildTree(a);
            newNode.right=buildTree(a);
            return newNode;
        }
    }



    public static void main(String ar[])
    {
        int a[]={15,2,1,-1,-1,3,-1,-1,13,-1,-1};
       BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(a);
        Tree_Traversals t=new Tree_Traversals();
        t.inorder(root);
        System.out.println();
        Tree_basic_ques tq=new Tree_basic_ques();
       int h= tq.diameter1(root);
        System.out.println("height "+h);
    }

}
