package HomeWork_6;

public class notebook {
    private String manufacturer;
    private String displaySize;
    private int ramSize;
    private int hddSize;
    private String os;
    private String color;

    public notebook(String manufacturer, String displaySize, int ramSize, int hddSize, String os, String color) {
        this.manufacturer = manufacturer;
        this.displaySize = displaySize;
        this.ramSize = ramSize;
        this.hddSize = hddSize;
        this.os = os;
        this.color = color;

    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(String displaySize) {
        this.displaySize = displaySize;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public int getHddSize() {
        return hddSize;
    }

    public void setHddSize(int hddSize) {
        this.hddSize = hddSize;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void vievInfo(){
        System.out.println(String.format(" Производитель: %s\n Диагональ дисплея: %s\n Оперативная память(Гб): %d\n Объем жесткого диска(Гб): %d\n Операционная система: %s\n Цвет: %s\n",
        this.manufacturer, this.displaySize, this.ramSize, this.hddSize, this.os, this.color));
    }
}
