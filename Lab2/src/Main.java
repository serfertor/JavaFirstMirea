public class Main {
    public static void main(String[] args) {
        Book test = new Book();
        test.setAuthor("Strugatsky bros");
        test.setTitle("Its hard to be the god");
        test.setJanr("Science fiction");
        test.setYear(1976);
        System.out.println(test.getJanr());
        test.setJanr("Fantastic");
        System.out.println(test.toString());
    }
}