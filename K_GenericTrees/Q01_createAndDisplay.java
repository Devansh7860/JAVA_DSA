package K_GenericTrees;
import java.util.ArrayList;
import java.util.Stack;

public class Q01_createAndDisplay {
    // Data is given in an array. From that create the generic tree.
    // Then display the tree in way that each node is displayed with its children.

// For example, if the tree is like this:
//               10
//           /   |   \
//        20     30    40
//       / \   /  |  \   \ 
//      50  60 70 80 90  100
//                / \
//               110 120
// The output should be:
// 10->20, 30, 40,
// 20->50, 60,
// 50->
// 60->
// 30->70, 80, 90,
// 70->
// 80->110, 120,
// 110->
// 120->
// 90->
// 40->100,
// 100->

    public static class Node {
        int data;
        ArrayList<Node> children;

        Node(int data){
            this.data = data;
            this.children = new ArrayList<>();
        }
    }

    public static void display(Node node){
        // basically a recurssive approach
        String str = node.data + "->";
        for(Node n : node.children){
            str += n.data + ", ";
        }
        System.out.println(str);
        
        for(Node n : node.children){
            display(n);
        }
        
    }

    public static Node create(int[] data){

        Stack<Node> st = new Stack<>(); // Stack to keep track of the nodes
        Node root = null;

        for(int elem : data){
            if(elem == -1){
                st.pop(); 
                continue;
            }
            Node t = new Node(elem);

            if(st.size()>0){
                st.peek().children.add(t);
            }
            else{
                root = t; // This is the root node
            }
            st.push(t);
        }
        return root;
    }

    public static void main(String[] args) {
        
        int[] data = {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
        // -1 is used to indicate that the current node has no more children.
        
        Node root = create(data);
        display(root);
    }

}
