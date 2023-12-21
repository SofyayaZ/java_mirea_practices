package Practice_4;

enum Size {
    XXS(32), XS(34), S(36), M(38), L(40);
    private int euroSize;
    Size(int euroSize) {
        this.euroSize = euroSize;
    }
    public String getDescription() {
        if (this == XXS) {
            return "Child size";
        }
        else {
            return "Adult size";
        }
    }
    public int getEuroSize() {
        return euroSize;
    }
}
interface MenClothing {
    void dressMan();
}
interface WomenClothing {
    void dressWoman();
}
class Clothes {
    protected Size size;
    protected double cost;
    protected String color;
    public Clothes(Size size, double cost,String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }
}
class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(Size size, double cost, String color) {
        super(size, cost, color);
    }
    @Override
    public void dressMan() {
        System.out.println("We dress a man in a T-shirt");
    }
    @Override
    public void dressWoman() {
        System.out.println("We dress woman in a T-shirt");
    }
}
class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(Size size, double cost, String color) {
        super(size, cost, color);
    }
    @Override
    public void dressMan() {
        System.out.println("We dress man in pants");
    }
    @Override
    public void dressWoman() {
        System.out.println("We dress woman in pants");
    }
}
class Skirt extends Clothes implements WomenClothing {
    public Skirt(Size size, double cost, String color) {
        super (size, cost, color);
    }
    @Override
    public void dressWoman() {
        System.out.println("We dress woman in a skirt");
    }
}
class Tie extends Clothes implements MenClothing {
    public Tie(Size size, double cost, String color) {
        super(size, cost, color);
    }
    @Override
    public void dressMan() {
        System.out.println("We dress man in a tie");
    }
}
class Atelier {
    public void dressWomen(Clothes[] clothes) {
        for (Clothes item: clothes) {
            if (item instanceof WomenClothing) {
                ((WomenClothing)item).dressWoman();
            }
        }
    }
    public void dressMen(Clothes[] clothes) {
        for (Clothes item: clothes) {
            if (item instanceof MenClothing) {
                ((MenClothing)item).dressMan();
            }
        }
    }
}





