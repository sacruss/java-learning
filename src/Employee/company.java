package Employee;

import java.sql.SQLOutput;

public class company {
    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.firstName = "Jan";
        emp1.lastName = "Kowalski";
        emp1.yearOfBirth = 1980;
        emp1.seniority = 5;

        Employee emp2 = new Employee();
        emp2.firstName = "Karol";
        emp2.lastName = "Żuk";
        emp2.yearOfBirth = 1985;
        emp2.seniority = 3;

        Employee emp3 = new Employee();
        emp3.firstName = "Karolina";
        emp3.lastName = "Marczuk";
        emp3.yearOfBirth = 1982;
        emp3.seniority = 4;

        System.out.println("Pracownicy w firmie");
        System.out.println(emp1.firstName + " " + emp1.lastName + ", ur. " + emp1.yearOfBirth + ", staż: "
                + emp1.seniority + " lata");
        System.out.println((emp2.firstName + " " + emp2.lastName + ", ur. " + emp2.yearOfBirth + ", staż: "
                + emp2.seniority + " lata"));
        System.out.println(emp3.firstName + " " + emp3.lastName + ", ur. " + emp3.yearOfBirth + ", staż: "
        + emp3.seniority + " lata");



    }



}
