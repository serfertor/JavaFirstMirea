public abstract class Dog {
    protected String colour;
    protected String pol;

    public String getColour() {
        return colour;
    }

    public String getPol() {
        return pol;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setPol(String pol) {
        this.pol = pol;
    }

    public abstract String toString();

    public abstract void bark();

    public abstract int runFor100m();

}
