package javaOOP._3;

public class Student {
        private String name;
        private String surname;
        private String city;
        private String initialCFCode;
        private int age;
        private int maxAge = 18;

        Student(String name, String surname, String city, int age){
            this.name = name;
            this.surname = surname;
            this.city = city;
            this.age = age;
        }
        Student(){
        }

        public String setNameSurname(String n, String s) {
            this.name = n;
            this.surname = s;

            return n + s;
        }
        public int setAge(int a) {
            if (a < maxAge || a < 0) {
                System.out.println("You can't register you haven't 18+");
                this.age = a;
            } else {
                System.out.println("You can register, you have +18");
            }
            return a;
        }
        public String setCity(String city) {
            this.city = city ;
            return city;
        }

        public String setCF(String n, String s) {
            this.initialCFCode = n.charAt(0) + " " + s.charAt(0);
            return initialCFCode;
        }

        public void getNameSurname(){
            System.out.println(name + " "+ surname);
        }

        public int getAge() {
            setAge(age);
            return age;
        }


        public String getCity() {
            if (setCity(city).contains("roma")) {
                System.out.println("Roma 00175");
                this.city = city;
            } else if (setCity(city).contains("napoli")){
                System.out.println("Napoli 80126");
            }else {
                System.out.println("Location unknown ");
            }
            return  city;
        }

        public void getCF() {
            System.out.println(setCF(name,surname));
        }
    }

