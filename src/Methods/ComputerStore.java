package Methods;

public class ComputerStore {
    public static void main(String[] args) {
        Computer comp1 = new Computer();
        comp1.processor = "Intel i5";
        comp1.memory = 8192;

        Computer comp2 = new Computer();
        comp2.processor = "AMD Ryzen 1700";
        comp2.memory = 16384;

        String comp1Info = comp1.getInfo();
        System.out.println(comp1Info); // Intel i5 8192
        System.out.println(comp2.getInfo()); // AMD Ryzen 1700 16384
//        System.out.println(comp1.processor + " " + comp1.memory);
//        System.out.println(comp2.processor + " " + comp2.memory);
    }

}
