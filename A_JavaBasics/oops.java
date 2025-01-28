package A_JavaBasics;

public class oops {

    public static class Person{
        String name;
        int age;
        void introduce(){
            System.out.println("Hello my self " + name + '[' + age + ']');
        }

        Person(){ // this is a default constructor function.
            // if we forget to write it java automatically calls it.
            // but we if have written a paramatric constructor function and we are creating an object without using that paramatric constructor(just like p1 is created) in that case java will give eror. so we have to write both cons function in that case. 

        }
        Person(String n , int a){ // Parametric constructor function 
            this.name = n;
            this.age = a;
        }
    }
    
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.age = 10;
        p1.name = "Alex";
        Person p2 = new Person("Devansh" , 18);

    }
}
