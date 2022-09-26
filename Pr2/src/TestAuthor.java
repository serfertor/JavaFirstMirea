public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Ivan Tolstoy", "tolstoy@mail.ru", 'm');
        Author a2 = new Author("Maria Tsareva", "Mar123@yandex.ru",'f');
        a2.setEmail("tsareva@mail.ru");
        System.out.println(a1);
        System.out.println(a2);
    }
}
