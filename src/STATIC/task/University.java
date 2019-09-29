package STATIC.task;

public class University {
    public static void main(String[] args) {
        System.out.println("Liczba studentów przed zapisami: " + Student.getStudentsNumber());
        Student s1 = new Student("Jan","Kowalski", 17323);
        Student s2 = new Student("Marek", "Jarosz", 17544);
        System.out.println("Liczba studentów po zapisach: "+ Student.getStudentsNumber());
    }
}
