package javaOOP._1;

import java.util.ArrayList;
import java.util.List;

public class Student {
String name ;
String surname ;
int age ;
List students = new ArrayList<>();
//
    @Override
    public String toString() {

        return name + " " + age ;

    }
}
