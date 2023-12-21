package Practice_24.Exercise_1;

public class ChairFactory implements AbstractChairFactory {
    public Chair createVictorianChair() {
        return new VictorianChair(200);
    }
    public Chair createMultifunctionalChair() {
        return new MultifunctionalChair();
    }
    public Chair createMagicChair() {
        return new MagicChair();
    }
}
