package F_StacksQueues;

public class Q16_normalStack {
     // We are creating a stack on our own using array

     public class customStack{
        int[] data;
        int tos; // top of stack

        customStack(int n){
            this.data = new int[n];
            this.tos = -1;
        }

        int size(){
            return tos+1;
        }
        void display(){
            for(int i = tos; i>=0; i--){
                System.out.print(data[i] + " ");
            }
            System.out.println();
        }
        int top(){
            if(tos == -1){
                System.out.println("Stack Underflow");
                return -1;
            }
            else{
                return data[tos];
            }
        }
        int pop(){
            if(tos == -1){
                System.out.println("Stack Underflow");
                return -1;
            }
            else{
                int val = data[tos];
                tos--;
                return val;
            }
        }

        void push(int val){
            if(tos == data.length -1){
                System.out.println("Stack Overflow");
            }
            else{
                tos++;
                data[tos] = val;
            }
        }

    }
    public static void main(String[] args) {
        Q16_normalStack outer = new Q16_normalStack();
        customStack st = outer.new customStack(5);
        st.push(1);
        st.push(2);
        System.out.println(st.top());
        st.push(10);
        System.out.println(st.pop());
        System.out.println(st.top());
        st.pop();
        st.pop();
        System.out.println(st.top());
    }
}
