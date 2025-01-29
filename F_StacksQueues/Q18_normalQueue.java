package F_StacksQueues;

public class Q18_normalQueue {
    // We have to create queue from scratch using arrays

    public class customQueue{
        int[] data;
        int front;
        int last;
        int size;

        public customQueue(int n){
            data = new int[n];
            front = 0;
            last = -1;
            size = 0;
        }

        void add(int val){
                if(size != data.length){
                    last = (last+1)%data.length;
                    data[last] = val;
                    size++;
                }
                else{
                    System.out.println("Queue Overflow");
                }
        }
        void display(){
            if(size == 0){
                System.out.println("Queue Underflow");
            }
            else{

                for(int i = 0; i<size; i++){
                    int ind = (front+i)%data.length;
                    System.out.print(data[ind] + " ");
                }
                System.out.println();
            }


        }
        int size(){
            return size;
        }
        int peek(){
            if(size == 0){
                System.out.println("Queue Underflow");
                return -1;
            }
            else{
                return data[front];
            }

        }
        int remove(){
            if(size == 0){
                System.out.println("Queue Underflow");
                return -1;
            }
            else{
                int val = data[front];
                front = (front+1)%data.length;
                size--;
                return val;
            }

        }

    }

    public static void main(String[] args) {
        
        Q18_normalQueue outer = new Q18_normalQueue();
        customQueue que = outer.new customQueue(4);
        que.add(1);
        que.add(2);
        que.add(3);
        que.display();
        que.remove();
        que.add(4);
        que.add(5);
        que.display();
        que.remove();
        que.add(6);
        que.display();
        System.out.println(que.size());

    }
}
