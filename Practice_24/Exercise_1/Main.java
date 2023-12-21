package Practice_24.Exercise_1;

public class Main {
    public static void main(String[] args) {
        AbstractChairFactory chairFactory = new ChairFactory();
        Chair victorianChair = chairFactory.createVictorianChair();
        Chair multifunctionalChair = chairFactory.createMultifunctionalChair();
        Chair magicChair = chairFactory.createMagicChair();

        Client client = new Client();
        client.setChair(victorianChair);
        client.sit();
        client.setChair(multifunctionalChair);
        client.sit();
        client.setChair(magicChair);
        client.sit();
    }
}
