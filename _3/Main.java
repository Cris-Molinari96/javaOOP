package javaOOP._3;

public class Main {
        public static void main(String[] args) {

            Student newStudentA = new Student("Critian","Molinari","Via dei platani",26);
            Student newStudentB = new Student();

            newStudentA.getNameSurname();
            newStudentA.getCity();
            newStudentA.getAge();
            newStudentA.getCF();
            System.out.println("\n");
            newStudentB.setNameSurname("Matteo","Bianchi");
            newStudentB.getNameSurname();
            newStudentB.setCity("napoli");
            newStudentB.setAge(15);
            newStudentB.getCity();
            newStudentB.getAge();
            newStudentB.getCF();

        }


}
