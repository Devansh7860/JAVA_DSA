package J_OOPS;

public class box {
    // this is the base/parent class.
    // above it is the Object class which is the parent of all classes in Java.
    int l;
    int b;
    int h;

    box(){ // default constructor
        this.l = -1;
        this.b = -1;
        this.h = -1;
    }
    box(int l , int b , int h){ // parameterized constructor
        this.l = l;
        this.b = b;
        this.h = h;
    }
    box(int side){  // constructor with single parameter
        this.l = side;
        this.b = side;
        this.h = side;
    }
    box (box oldBox){  // copy constructor
        this.l = oldBox.l;
        this.b = oldBox.b;
        this.h = oldBox.h;
    }

    public int volume(){ 
        return this.l * this.b * this.h;
    }

}
