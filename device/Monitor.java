package device;

import java.util.Objects;

public class Monitor extends Device{

   private int resolutionX, resolutionY, resolutionZ;


    Monitor(int resolutionX, int resolutionY, int resolutionZ, String manufacturer, int price, String serialNumber){
        super(manufacturer, price, serialNumber);

        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
        this.resolutionZ = resolutionZ;
    }

    @Override
    public String toString() {
        return "Device: " + super.getManufacturer() + "\nSerialnumber: " + super.getSerialNumber() + "\nResolution: " + resolutionX  + "*" + resolutionY +"\nPrice: " + super.getPrice();
    }

    public int getResolutionX() {
        return resolutionX;
    }


    public int getResolutionY() {
        return resolutionY;
    }


    public int getResolutionZ() {
        return resolutionZ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Monitor monitor = (Monitor) o;
        return resolutionX == monitor.resolutionX && resolutionY == monitor.resolutionY && resolutionZ == monitor.resolutionZ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), resolutionX, resolutionY, resolutionZ);
    }
}
