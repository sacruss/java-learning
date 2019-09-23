package Control;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class HelloName {
    public static void main(String[] args) {
        final String name1 = "Krzysiek";
        final String name2 = "Piotrek";
        final String name3 = "Mariusz";
        final String name4 = "Maciek";

        String name = "Jan";

        switch (name) {
            case name1:
            case name2:
            case name3:
                System.out.println("Siema użytkowniku , witaj w aplikacji!");
                break;
            case name4:
                System.out.println("Witam Panie prezesie, jak mija dzień?");
                break;
            default:
                System.out.println("Witaj nieznany użytkowniku");

        }
        System.out.println("Koniec programu");

        int option = 2;

        switch (option){
            case 0:
                System.out.println("Koniec programu");
                break;
            case 1:
                System.out.println("Dodawanie nowej osoby");
                break;
            default:
                System.out.println("Opcja nieznana");
        }
    }
}
