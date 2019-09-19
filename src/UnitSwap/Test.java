package UnitSwap;

public class Test {
    public static void main(String[] args) {
        MetricUnits metric = new MetricUnits();
        metric.metersToCentimeters(13);
        metric.metersToMilimeters(6);
        metric.centimetersToMeters(1463.50);
        metric.milimetersToMeters(131234);

        TimeUnits timeUnits = new TimeUnits();
        System.out.println(timeUnits.hoursToMinutes(54));
        System.out.println(timeUnits.minutesToSeconds(42));
        System.out.println(timeUnits.secondsToMiliseconds(32));
        System.out.println(timeUnits.secondsToMiliseconds(timeUnits.minutesToSeconds(timeUnits.hoursToMinutes(14))));
    }
}
