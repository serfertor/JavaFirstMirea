public class Akita extends Dog{

    public Akita (){}

    public Akita(String colour, String pol) {
        this.colour = colour;
        this.pol = pol;
    }

    @Override
    public String toString() {
        return "Akita is "+ colour + " and " + pol;
    }

    @Override
    public void bark() {
        System.out.println("WOOOOOOOF");
    }

    @Override
    public int runFor100m() {
        return 5;
    }
}
