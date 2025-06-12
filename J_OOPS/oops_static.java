package J_OOPS;

// static functions/variables can be called without creating an object of the class.
public class oops_static {
    static int a = 10;
    static int b;

    static{ // static block is called when the class is loaded and it runs only once when the first object is created.
        System.out.println("Static block is called");
        b = a * 5;
    }

    public static void main(String[] args) {
        oops_static obj1 = new oops_static();
        oops_static.b += 5;

        System.out.println("a = " + oops_static.a); // 10
        System.out.println("b = " + oops_static.b); // 55

        oops_static obj2 = new oops_static();
        System.out.println("a = " + oops_static.a); // 10
        System.out.println("b = " + oops_static.b); // 55 and not 50 because static block is called only once
    }
}
     

