package models;
public class Person implements Payable, Comparable<Person> {
    private int ID;
    private String name;
    private String surname;
    private static int ID_gen=1;

    private void generateID(){
        ID=ID_gen++;
    }

    public Person(){
        generateID();
    }

    public Person(String name, String surname) {
        this();
        setName(name);
        setSurname(surname);
    }
    public int getID() {
        return ID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPosition() {
        return "Unknown";
    }

    @Override
    public String toString() {
        return ID + ". " + name + " " + surname;
    }

    @Override
    public double getPaymentAmount() {
        return 0.0;
    }

    @Override
    public int compareTo(Person other) {
        return Double.compare(this.getPaymentAmount(), other.getPaymentAmount());
    }





}
