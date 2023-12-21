package Practice_4.dop;

abstract class Furniture {
    private String name;
    private double price;

    public Furniture(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public abstract void displayInfo();
}

// Различные виды мебели (наследники абстрактного класса Furniture)
class Chair extends Furniture {
    public Chair(String name, double price) {
        super(name, price);
    }

    @Override
    public void displayInfo() {
        System.out.println("Стул " + getName() + ", цена: " + getPrice());
    }
}

class Table extends Furniture {
    public Table(String name, double price) {
        super(name, price);
    }

    @Override
    public void displayInfo() {
        System.out.println("Стол " + getName() + ", цена: " + getPrice());
    }
}

class Sofa extends Furniture {
    public Sofa(String name, double price) {
        super(name, price);
    }

    @Override
    public void displayInfo() {
        System.out.println("Диван " + getName() + ", цена: " + getPrice());
    }
}

// Класс, моделирующий магазин мебели
class FurnitureShop {
    private Furniture[] furnitureArray;

    public FurnitureShop(Furniture[] furnitureArray) {
        this.furnitureArray = furnitureArray;
    }

    public void displayAllFurniture() {
        for (Furniture furniture : furnitureArray) {
            furniture.displayInfo();
        }
    }
}

// Пример использования классов
public class Exercise_9 {
    public static void main(String[] args) {
        Furniture[] furnitureArray = new Furniture[3];

        furnitureArray[0] = new Chair("Стул IKEA", 100.0);
        furnitureArray[1] = new Table("Стол JYSK", 200.0);
        furnitureArray[2] = new Sofa("Диван Leroy Merlin", 500.0);

        FurnitureShop shop = new FurnitureShop(furnitureArray);
        shop.displayAllFurniture();
    }
}