class Student{
    String name ;
    int age ;

//    Student(String name , int age){             // parametarised constructor
//        this.name = name ;
//        this.age = age;
//    }


    // copy constructor : Majorly used to make another copy of any object
    Student(Student s){
        this.name = s.name;
        this.age = s.age;
    }
    // whenever we are creating a copy constructor we have to create another constructor for the original object
    Student(){}
    public void printInfo(){
        System.out.println("Nmae:- "+this.name+" Age:- "+this.age);
    }
}
public class Constructor {
    public static void main(String[] args) {
//        Student s1 = new Student();         // Default constructor created by java
//        s1.name = "Aman";
//        s1.age = 24;
//        s1.printInfo();

//        Student s1 = new Student("Aman",24);              // parametarised constructor
//        s1.printInfo();


        Student s1 = new Student();
        s1.name = "Aman";
        s1.age = 24;

        Student s2 = new Student(s1);       // s2 is the another copy of s1
        s2.printInfo();

    }

}
