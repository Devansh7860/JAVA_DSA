package A_JavaBasics;

public class oops {

    public static class Person {
        String name;
        int age;

        void introduce() {
            System.out.println("Hello my self " + name + '[' + age + ']');
        }

        // constructor function name is same as the class name.
        Person() { // this is a default constructor function.
            // if we forget to write it java automatically provides it.
            // but we if have written a paramatric constructor function and we are creating
            // an object without using that paramatric constructor(just like p1 is created)
            // in that case java will give eror. so we have to write both cons function in
            // that case.

        }

        Person(String n, int a) { // Parametric constructor function
            this.name = n; // this refers to the person class itself.
            this.age = a;
        }
    }

    public static void swap(Person pn1, Person pn2) {
        // THIS CODE BELOW DOESN'T SWAP THE OBJECTS
        // pn1 has the address of p1 and pn2 has the address of p2
        // we just swap the memory address of pn1 and pn2 with each other. this has no
        // effect on the memory address of p1 and p2.

        /*
           Person temp = pn1;
           pn1 = pn2;
           pn2 = temp;
         */

        // SO TO EFFECTIVELY SWAP THE OBJECTS WE HAVE TO MAKE CHANGES TO THE OBJECTS ITSELF.
        /*
           int age = pn1.age;
           pn1.age = pn2.age;
           pn2.age = age;
           
           String name = pn1.name;
           pn1.name = pn2.name;
           pn2.name = name;
         */

        /*pn1 = new Person(); // this makes a new object pn1 and initially assings null in name and 0 in age.
         int age = pn1.age; // 0
         pn1.age = pn2.age; // pn1.age = 18
         pn2.age = age; // pn2.age = 0 AT THIS TIME PN2 OBJECT IS POINTING TO P2 SO P2.AGE WILL ALSO BECOME 0

         pn2 = new Person(); // makes pn2 a new object 
         String name = pn1.name; // null
         pn1.name = pn2.name; // null
         pn2.name = name; // null 
         */

    }

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.age = 10;
        p1.name = "Alex";
        Person p2 = new Person("Devansh", 18);
        p1.introduce();
        p2.introduce();
        swap(p1, p2);
        p1.introduce();
        p2.introduce();
    }
}
