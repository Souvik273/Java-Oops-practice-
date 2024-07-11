class Person {
    String name ;
    int age ;
    Person(String name , int age){
        this.name = name ;
        this.age = age ;
    }

    // Compile Time polymorphism or Method Overloading

    public void printInfo(String name){
        System.out.println(this.name);
    }
    public void printInfo(int age){
        System.out.println(this.age);
    }
    public void printInfo(String name,int age){
        System.out.println(this.name + " "+ this.age);
    }
}
public class Polymorphism {             // same fn name but diff functionality
    public static void main(String[] args) {
        Person p = new Person("Aman",26);
        p.printInfo("Aman");
        p.printInfo(25);
        p.printInfo("Aman",30);
    }
}
