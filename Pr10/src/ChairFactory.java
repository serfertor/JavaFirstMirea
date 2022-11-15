public class ChairFactory implements AbstractChairFactory{
    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }

    public MagicChair createMagicChair() {
        return new MagicChair();
    }

    public VictorianChair createVictorianChair() {
        return new VictorianChair(100);
    }
}
