package J_OOPS;

public class staticPolymorphism {
    // also known as compile time polymorphism or method overloading
    int a;
    int b;

    // constructor overloading 
    staticPolymorphism() {
        this.a = 0; // default value for a
        this.b = 0; // default value for b
    }
    staticPolymorphism(int a, int b) {
        this.a = a;
        this.b = b;
    }
    staticPolymorphism(int a) {
        this.a = a;
        this.b = 0; // default value for b
    }
    
    // method overloading 
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
    double add(double a, double b) {
        return a + b;
    }
}
