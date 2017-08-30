package task.students;

public class Student extends Person {

    private String idNumber;
    private double gpa;

    public Student(String name, int age, String gender, String idNumber, double gpa) {
        super(name, age, gender);
        this.idNumber = idNumber;
        this.gpa = gpa;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString(){

        System.out.println(getName() +", age: " +
                getAge() + ", gender: " +
                getGender() + ", student id: " +
                idNumber + ", gpa: " +
                gpa);

        return null;
    }

}
