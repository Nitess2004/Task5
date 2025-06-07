public class Books {
    // Private instance variables
    private String title;
    private String author;
    private int publicationYear;
    private boolean available;

    // Constructor to initialize all fields, book is available by default
    public Books(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.available = true;  // When a book is created, it is available
    }

    // Getter and setter for title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getter and setter for author
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter and setter for publicationYear
    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    // Getter for availability status (no setter, since it's controlled by borrow/return methods)
    public boolean isAvailable() {
        return available;
    }

    // Method to borrow the book
    public boolean borrowBook() {
        if (available) {
            available = false;  // Book is now borrowed
            return true;       // Successfully borrowed
        } else {
            return false;      // Book was not available to borrow
        }
    }

    // Optional: method to return the book, making it available again
    public void returnBook() {
        available = true;
    }
}
