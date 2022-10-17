public class Chihua extends Dog{

    Chihua (){}

    Chihua (String colour, String pol){
        this.colour = colour;
        this.pol = pol;
    }

    @Override
    public String toString() {
        return "Chihua is "+ colour + " and " + pol;
    }

    @Override
    public void bark() {
        System.out.println("woof");
    }

    @Override
    public int runFor100m() {
        return 20;
    }
}
