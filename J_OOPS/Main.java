package J_OOPS;

public class Main {

    public static void main(String[] args) {
        box box1 = new box(10,20,30);
        boxWeight box2 = new boxWeight(10,20,30,40);
        System.out.println(box2.volume());

        // some crazy things

        box box3 = new boxWeight(10, 20, 30, 40); // this is called upcasting, where a child class object is assigned to a parent class reference variable.
        // we can't acces the weight variable of boxWeight class using box class reference variable.
        // it can only access the variables and methods of the box class.
        // also if there is method in box class and boxWeight class with same name, then the method of boxWeight class will be called.(method overriding)

        
        // boxWeight box4 = new box(); // this is called downcasting, where a parent class object is assigned to a child class reference variable. This will give a compile time error.


    }
    
    
}
