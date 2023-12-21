package Practice_4;

enum Brand {
    HP,
    Dell,
    Lenovo,
    Asus
}
class Computer {
    private Brand brand;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;
public Computer(Brand brand, Processor processor, Memory memory, Monitor monitor) {
    this.brand = brand;
    this.processor = processor;
    this.memory = memory;
    this.monitor = monitor;
}
    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void displayInfo() {
        System.out.println("Computer brand: " + brand);
        System.out.println("Processor: " + processor);
        System.out.println("Memory: " + memory);
        System.out.println("Monitor: " + monitor);
    }
}
class Processor {
    private String model;

    public Processor(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return model;
    }
}

class Memory {
    private int size;

    public Memory(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return size + "GB";
    }
}

class Monitor {
    private String model;
    private double size;

    public Monitor(String model, double size) {
        this.model = model;
        this.size = size;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return model + ", " + size + " inches";
    }
}

public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor("Intel Core i7");
        Memory memory = new Memory(8);
        Monitor monitor = new Monitor("Samsung", 24);
        Computer computer = new Computer(Brand.Lenovo, processor, memory, monitor);
        computer.displayInfo();
    }
}
