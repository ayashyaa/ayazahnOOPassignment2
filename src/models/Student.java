package models;

public class Student extends Person implements Payable {
    private double gpa;

    public Student() {
        super();
        this.gpa = 0.0;
    }

    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student: " + getID() + ". " + getName() + " " + getSurname();
    }
    @Override
    public double getPaymentAmount() {
        return gpa > 2.67 ? 36660.00 : 0.00;
    }
}
