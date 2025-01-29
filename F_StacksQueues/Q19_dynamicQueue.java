package F_StacksQueues;

public class Q19_dynamicQueue {
    // WE have to create dynamic queue using arrays

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
                    int[] newData = new int[data.length*2];
                    for(int i = 0; i<data.length; i++){
                        newData[i] = data[(front+i)%data.length];
                    }
                    front = 0;
                    last = data.length-1;
                    data = newData;
                    last = (last+1)%data.length;
                    data[last] = val;
                    size++;
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
}
