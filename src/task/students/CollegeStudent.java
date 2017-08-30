package task.students;

public class CollegeStudent extends Student {

    private int year;
    private String major;

    public CollegeStudent(String name, int age, String gender, String idNumber, double gpa, int year, String major) {
        super(name, age, gender, idNumber, gpa);
        this.year = year;
        this.major = major;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString(){

        System.out.println(getName() +", age: " +
                getAge() + ", gender: " +
                getGender() + ", student id: " +
                getIdNumber() + ", gpa: " +
                getGpa() + ", year: " +
                year + ", major");

        return null;
    }
}
