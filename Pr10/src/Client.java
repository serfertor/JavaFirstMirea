public class Client {
    public Chair chair;

    public void sit(){
        System.out.println("Sitting on " + chair.getClass());
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
