public class Main {
    public static void main(String[] args) {
        // Create objects
        Book b1 = new Novel();
        Book b2 = new Textbook();

        // Display book information
        System.out.println("---- Novel Details ----");
        b1.bookName();
        b1.bookPrice();
        b1.bookReview();
        b1.bookDescription();

        System.out.println("\n---- Textbook Details ----");
        b2.bookName();
        b2.bookPrice();
        b2.bookReview();
        b2.bookDescription();
    }
}