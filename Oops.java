public class Oops {
    public static void main(String[] args){
        Student s1=new Student();
        s1.name="Student1";
        s1.regno=1;
        s1.marks=100;
        Student s2=new Student(s1);
        s1.marks=101;
        System.out.println(s2.name+" , "+s2.regno+" , "+s2.marks);
        Indian i=new Indian();
        i.country();
        i.walk();
        i.eat();
        i.breath();
        i.sleep();
        Calculator c=new Calculator();
        System.out.println(c.sum(5,2));
        System.out.println(c.sum(1.5f,2.0f));
        
        

    }
}
class Student{
    String name;
    int regno;
    int marks;
    Student(){
    }
    Student(Student s1){
        this.name=s1.name;
        this.regno=s1.regno;
        this.marks=s1.marks;
    }
}
//copy constructor copies all of the properties of the object
//the only issue that we get from copy constructor is when we passed an array 
//the copy constructor copies the reference of that array so if the array is
//changed later on then the copy constructor also changes the value for the object
//beacause the reference is copied not the actual vlaues

//inheritance
class Animal{
    void eat(){
        System.out.println("will eat");
    }
    void breath(){
        System.out.println("will breath");
    }
    void sleep(){
        System.out.println("will sleep");
    }
}
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("will swim");
    }
}
class Bird extends Animal{
    int wings;
    void fly(){
        System.out.println("wiil fly");
    }
}
class Human extends Animal{
    boolean concious;
    void walk(){
        System.out.println("will walk");
    }
}
class Tuna extends Fish{
    void size(){
        System.out.println("small");
    }
}
class Shark extends Fish{
    void size(){
        System.out.println("big");
    }
}
class Peacock extends Bird{
    void dance(){
        System.out.println("will dance");
    }
}
class Indian extends Human{
    void country(){
        System.out.println("India");
    }
}

class Calculator{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
}