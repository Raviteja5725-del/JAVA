class Book {
    String title;
    int pages;

    Book() {
        title = "Unknown Title";
        pages = 120;
    }
}

public class DefaultConstructor {
    public static void main(String[] args) {
        Book b = new Book();
        System.out.println(b.title + " | " + b.pages + " pages");
    }
}
