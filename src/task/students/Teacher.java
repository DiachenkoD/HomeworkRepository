package task.students;

public class Teacher extends Person {

    private double salary;
    private String subject;

    public Teacher(String name, int age, String gender, double salary, String subject) {
        super(name, age, gender);
        this.salary = salary;
        this.subject = subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString(){

        System.out.println(getName() +", age: " +
                getAge() + ", gender: " +
                getGender() + ", subject: " +
                subject + ", salary: "+
                salary);

        return null;
    }


}
