package javaOOP._2;

public class Student {
    String name ;
    int age ;

    Student(String n, int a){
        this.name = n ;
        this.age = a ;

        System.out.println("Name student: " + n + "\nAge student : " + a);
    }
    Student(String n){
        this.name = n ;

        System.out.println("Name student:" + n );
    }
    Student(int a){
        this.age = a ;

        System.out.println("Age student : " + a);
    }
    Student(){

        System.out.println("0 parametri" );
    }
}
