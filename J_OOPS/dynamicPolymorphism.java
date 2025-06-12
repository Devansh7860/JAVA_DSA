package J_OOPS;

public class dynamicPolymorphism {
    
    // also known as runtime polymorphism or method overriding
    // this is achieved by method overriding, where a child class provides a specific implementation of a method that is already defined in its parent class.
    
    public static class box {
        int length;
        int breadth;
        int height;

        box(int length, int breadth, int height) {
            this.length = length;
            this.breadth = breadth;
            this.height = height;
        }

        public int volume() {
            return length * breadth * height;
        }
    }

    public static class boxWeight extends box {
        int weight;

        boxWeight(int length, int breadth, int height, int weight) {
            super(length, breadth, height);
            this.weight = weight;
        }

        @Override // This annotation indicates that this method is overriding a method from the parent class. helps to catch erros.
        public int volume() {
            return length * breadth * height + weight; // Overriding the volume method to include weight in the calculations
        }
    }

    public static void main(String[] args) {
        box box1 = new box(10, 20, 30);
        boxWeight box2 = new boxWeight(10, 20, 30, 40);

        System.out.println("Volume of box1: " + box1.volume());
        System.out.println("Volume of box2: " + box2.volume());

        // Upcasting
        box box3 = new boxWeight(10, 20, 30, 40);
        // box3 is reference of parent class box, but it refers to an object of child class boxWeight.
        // it can only access the methods and variables of the box class.
        // in case of overriding, boxweight will determine which version of the method to call at runtime.
        System.out.println("Volume of upcasted box3: " + box3.volume());


        // how does this happen?
        // By dynamic method dispatch, where the method to be called is determined at runtime based on the actual object type, not the reference type.
        
    }
}
