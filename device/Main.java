package device;

public class Main {
    public static void main(String[] args) {



        Device device = new Device("Samsung", 120, "AB1234567CD");
        Monitor monitor = new Monitor(1280, 1024, 6,"Samsung", 120, "AB1234567CD"  );

        System.out.println(device.toString());
        System.out.println(device.equals(monitor));
        System.out.println(device.hashCode());

        System.out.println(monitor.toString());
        System.out.println(monitor.equals(device));
        System.out.println(monitor.hashCode());
    }
}
