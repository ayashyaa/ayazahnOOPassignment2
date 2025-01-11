import models.Employee;
import models.Person;
import models.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyApplication {

    public static void main(String[] args) {
        Employee employee1 = new Employee("John", "Lennon", "Manager", 27045.78);
        Employee employee2 = new Employee("George", "Harrison", "Developer", 50000);
        Student student1 = new Student("Paul", "McCartney", 3.5);  // Получает стипендию
        Student student2 = new Student("Ringo", "Starr", 2.5);
        Person person = new Person("Generic", "Person");

        List<Person> payables = new ArrayList<>();
        payables.add(employee1);
        payables.add(employee2);
        payables.add(student1);
        payables.add(student2);

        Collections.sort(payables);

        printData(payables);
    }

    public static void printData(Iterable<Person> payables) {
        for (Person payable : payables) {
            System.out.println(payable.toString() + " earns " + payable.getPaymentAmount() + " tenge");
        }
    }
}
