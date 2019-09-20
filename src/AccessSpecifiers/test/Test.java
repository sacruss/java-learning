package AccessSpecifiers.test;

import AccessSpecifiers.control.pointcontroller;
import AccessSpecifiers.point.Point;

public class Test {
    public static void main(String[] args) {
       Point p1 = new Point (10,20);
       pointcontroller pc = new pointcontroller();

        System.out.println("Punkt: (" + p1.getX() + ";"+p1.getY()+")");
        pc.addX(p1);
        System.out.println("Punkt addX: ("+ p1.getX()+";"+p1.getY()+")");
        pc.addY(p1);
        System.out.println("Punkt addY: ("+ p1.getX()+";"+p1.getY()+")");
        pc.minusX(p1);
        System.out.println("Punkt minusX: ("+ p1.getX()+";"+p1.getY()+")");
        pc.minusY(p1);
        System.out.println("Punkt minusY: ("+ p1.getX()+";"+p1.getY()+")");


    }
}
