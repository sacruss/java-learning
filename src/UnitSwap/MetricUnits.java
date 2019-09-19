package UnitSwap;

public class MetricUnits {
    double metersToCentimeters(double meters) {
        double centimeters = meters * 100;
        System.out.println(centimeters);
        return centimeters;
    }

    double metersToMilimeters(double meters) {
        double milimeters = meters * 1000;
        System.out.println(milimeters);
        return milimeters;
    }

    double centimetersToMeters(double centimeters) {
        double meters = centimeters / 100;
        System.out.println(meters);
        return meters;
    }
    double milimetersToMeters (double milimeters){
        double meters = milimeters / 1000;
        System.out.println(meters);
        return meters;
    }
}
