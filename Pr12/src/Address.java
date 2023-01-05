import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String part;
    private String flat;

    public Address (String input){
        String mass[] = new String[7];
        if(input.contains(",")) {
            mass = input.split(",");
        } else {
            StringTokenizer tokenizer = new StringTokenizer(input,"-/.");
            int i = 0;
            while (tokenizer.hasMoreTokens())
            {
                String token = tokenizer.nextToken();
                mass[i]=token;
                i++;
            }
        }
        this.country = mass[0];
        this.region = mass[1];
        this.city = mass[2];
        this.street = mass[3];
        this.house = mass[4];
        this.part = mass[5];
        this.flat = mass[6];
        String s = new String ("123");
        String d = new String ("123"); //s != d equals(s, d) == True
        String s1 = "dddd";
        String s2 = "dddd"; //s1 == s2 и equals(s1,s2) == True
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", part='" + part + '\'' +
                ", flat='" + flat + '\'' +
                '}';
    }
}
