package STATIC.task;

public class Student {
    private String firstName;
    private String lastName;
    private int indeksNumber;
    private static int studentsNumber = 0;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getIndeksNumber() {
        return indeksNumber;
    }

    public void setIndeksNumber(int indeksNumber) {
        this.indeksNumber = indeksNumber;
    }

    public Student(String firstName, String lastName, int indeksNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.indeksNumber = indeksNumber;
        studentsNumber++;
    }

    public static int getStudentsNumber() {
        return studentsNumber;
    }
}
