public class Main {
    public static void main(String[] args) {
        Client pupil = new Client();
        ChairFactory factory = new ChairFactory();
        FunctionalChair newChairF = factory.createFunctionalChair();
        pupil.setChair(newChairF);
        pupil.sit();
        System.out.println("Sum 1 and 2 = " + newChairF.sum(1, 2));
        MagicChair newChairM = factory.createMagicChair();
        newChairM.doMagic();
        VictorianChair newChairV = factory.createVictorianChair();
        System.out.println(newChairV.getAge());
    }
}