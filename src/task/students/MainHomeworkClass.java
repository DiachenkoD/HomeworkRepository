package task.students;

public class MainHomeworkClass {

    public static void main(String[] args) {

        Person[] allPerson = new Person[4];// создаю массив объектов типа персон

        allPerson[0] = new Person("Coach Bob",27,"M");
        allPerson[1] = new Student("Lynne Brook",16,"F","HS95129",3.5);
        allPerson[2] = new Teacher("Duke Java",34,"M",5000.0d,"Computers Science");
        allPerson[3] = new CollegeStudent("Ima Frosh", 18, "F", "UCB123", 4.0d, 1, "English");

        allPerson[0].toString();
        allPerson[1].toString();
        allPerson[2].toString();
        allPerson[3].toString();

    }

}
