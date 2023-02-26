package device;

import java.util.Objects;

public class Device {

     private String  manufacturer;
     private float price;
     private String serialNumber;

    Device(String manufacturer, int price, String serialNumber){

        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }


    @Override
    public String toString() {
        return "Device: " + manufacturer +  "\nPrice: " + price + "\nSerialnumber: " + serialNumber;
    }


    public String getManufacturer() {
        return manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Device device = (Device) o;
        return Float.compare(device.price, price) == 0 && Objects.equals(manufacturer, device.manufacturer) && Objects.equals(serialNumber, device.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, price, serialNumber);
    }
}
