public class Ball {
    private String colour;
    private int radius;
    private String type;
    private boolean status = true;
    public Ball (String c, String t, int r){
        colour = c;
        type = t;
        radius = r;
    }

    public Ball (String c, String t){
        colour = c;
        type = t;
        radius = 3;
    }

    public void dropBall (){
        if (this.status == true) {
            System.out.println("ball was dropped");
            this.status = false;
        } else {
            System.out.println("ball already dropped");
        }
    }

    public String isDropped (){
        if (this.status == true) {
            return "on the shell";
        } else {
            return "on the floor";
        }
    }

    public void setColour (String c){
        this.colour = c;
    }

    public void setType (String t){
        this.type = t;
    }

    public void setRadius (int r){
        this.radius = r;
    }

    public String toString(){
        return this.colour+" " + this.type + " ball with radius - " + this.radius + " " + this.isDropped();
    }
}
