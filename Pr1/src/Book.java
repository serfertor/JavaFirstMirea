public class Book {
    private String theme;
    private String name;
    private String author;
    private int amountPages;

    public Book (String t, String n, String a, int am){
        theme = t;
        name = n;
        author = a;
        amountPages = am;
    }

    public Book (String t, String n, String a){
        theme = t;
        name = n;
        author = a;
        amountPages = 0;
    }

    public void setTheme (String t){
        this.theme = t;
    }

    public void setName (String n){
        this.name = n;
    }

    public void setAuthor (String a){
        this.author = a;
    }

    public void setAmountPages (int am){
        this.amountPages = am;
    }

    public String toString() {
        return "theme = " + theme +
                ", name = " + name  +
                ", author = " + author  +
                ", amountPages = " + amountPages;
    }

    public void readingTime (){
        System.out.println("Reading time of this book with speed 50 pages per day is " + this.amountPages / 50.0 + " days");
    }
}
