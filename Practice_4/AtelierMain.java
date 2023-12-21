package Practice_4;

public class AtelierMain {
    public static void main(String[] args) {
        TShirt tShirt = new TShirt(Size.S, 19.99, "Red");
        Pants pants = new Pants(Size.M, 34.99, "Blue");
        Skirt skirt = new Skirt(Size.XXS, 39.99, "Black");
        Tie tie = new Tie(Size.L, 29.99, "Gray");

        Clothes[] clothes = {tShirt, pants, skirt, tie};

        Atelier atelier = new Atelier();
        atelier.dressWomen(clothes);
        System.out.println();
        atelier.dressMen(clothes);
    }
}

