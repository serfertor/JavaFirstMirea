public class Main {
    public static void main(String[] args) {
        Person greg = new Person("Ternov");
        Person anna = new Person("Olegovna", "Anna", "Alexeevichna");
        System.out.println(greg.getFIO());
        System.out.println(anna.getFIO());
        Address a1 = new Address("Russia,Central,Moscow,Berzovoy street,2,1,128");
        Address a2 = new Address("USA-South-New York-Okolo street-10-2-243");
        Address a3 = new Address("Canada/North/Ottava/Birgim street/12/2/32");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        String shirts[] = new String[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL"; shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL"; shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL"; shirts[5] = "S006,Black T-Shirt,Black,XL";
        shirts[6] = "S007,White T-Shirt,White,XL"; shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S"; shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";
        Shirt array[] = new Shirt[11];
        for (int i = 0; i < 11; i++){
            Shirt j = new Shirt(shirts[i]);
            array[i] = j;
        }
        for (Shirt i : array){
            System.out.println(i);
        }
    }
}