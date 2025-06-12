package J_OOPS;

public class boxWeight extends box {
    // this is the child class of box.
    int weight;

    boxWeight(){
        super();
        this.weight = 0; 
    }

    boxWeight(int l, int b, int h, int weight) { // parameterized constructor
        super(l, b, h); // calling the parameterized constructor of the parent class
        this.weight = weight;
        // we can use the super keyword like this keyword to refer to parent class's methods and variables.
        System.out.println(super.l + " " + super.b + " " + super.h);
    }

}
