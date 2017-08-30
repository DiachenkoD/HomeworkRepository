package task.students;


import java.io.FileNotFoundException;


public class MainHomeworkClass {

    public static void main(String[] args) throws FileNotFoundException {

        Person[] allPerson = new Person[4];// создаю массив объектов типа персон

        allPerson[0] = new Person("Coach Bob", 27, "M");
        allPerson[1] = new Student("Lynne Brook", 16, "F", "HS95129", 3.5);
        allPerson[2] = new Teacher("Duke Java", 34, "M", 5000.0d, "Computers Science");
        allPerson[3] = new CollegeStudent("Ima Frosh", 18, "F", "UCB123", 4.0d, 1, "English");

        allPerson[0].toString();
        allPerson[1].toString();
        allPerson[2].toString();
        allPerson[3].toString();
        String name;
        int age;
        String gender;
        String idNumber;
        double gpa;
        int year;
        String major;

        String informatioString = FileWorker.read("sobaka.txt");
        String[] koma = new String[7];
        koma = informatioString.split(",");
        String[] s = new String[2];
        for (int i = 0; i< koma.length; i++){

            s = koma[i].split(":");
            switch(s[0]){
                case "name":{
                    name = s[1];
                    break;
                }
                case "age":{
                    age = Integer.parseInt(s[1]);
                    break;
                }
                case "gender":{
                    gender = s[1];
                    break;
                }
                case "student id":{
                    idNumber = s[1];
                    break;
                }
                case "gpa":{
                    gpa = Double.parseDouble(s[1]);
                    break;
                }
                case "year":{
                    year = Integer.parseInt(s[1]);
                    break;
                }
                case "major":{
                    major = s[1];
                    break;
                }
            }

        }


    }
    CollegeStudent student = new CollegeStudent(name,age,gender,idNumber,gpa,year,major);




}
