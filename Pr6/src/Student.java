public class Student {
    private int sum;
    private String name;

    Student (){}

    Student (int sum, String name){
        this.name = name;
        this.sum = sum;
    }

    public int getSum() {
        return sum;
    }

    public String getName() {
        return name;
    }
}
