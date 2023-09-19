package Practice_2.Exercise_4;

public class Computer {
    private String manufacturer;
    private String model;
    private double price;

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModel(String name) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public Computer(String manufacturer, String model, double price) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.price = price;
    }
    @Override
    public String toString () {
        return "Computer{" +
                "manufacturer = " + manufacturer +
                ", model = " + model +
                ", price = " + price + '\'' +
                '}';
    }
}
