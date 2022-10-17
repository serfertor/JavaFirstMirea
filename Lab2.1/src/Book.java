public class Book {
    private String author;
    private String title;
    private int year;
    private String janr;

    Book (){}

    public Book(String author, String title, int year, String janr) {
        this.author = author;
        this.title = title;
        this.year = year;
        this.janr = janr;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getJanr() {
        return janr;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setJanr(String janr) {
        this.janr = janr;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", janr='" + janr + '\'' +
                '}';
    }
}