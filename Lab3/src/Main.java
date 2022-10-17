public class Main {
    public static void main(String[] args) {
       Chihua dog1 = new Chihua("brown" , "female");
       System.out.println(dog1.toString() + " running 100 m for " + dog1.runFor100m() + " sec");
       dog1.bark();
       Akita dog2 = new Akita("white" , "male");
       System.out.println(dog2.toString() + " running 100 m for " + dog2.runFor100m() + " sec");
       dog2.bark();
    }
}