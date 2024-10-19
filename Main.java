import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("abay zholy", "m. auezov", 748, 89);
        Book book2 = new Book("kniga1", "author1", 164, 96);

        Reader reader1 = new Reader("Assiya", 85);
        Reader reader2 = new Reader("Suneliya", 84);

        Library library = new Library();
        library.addReader(reader1);
        library.addReader(reader2);

        library.addBook(book1);
        library.addBook(book2);

        library.vidacha(reader2, book1);
        library.vernyt(reader1, book2);
    }
}
class Book{
    String name;
    String author;
    int isbn;
    int col;

    public Book(String name, String author, int isbn, int col) {
        this.name = name;
        this.author = author;
        this.isbn = isbn;
        this.col = col;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", isbn=" + isbn +
                ", col=" + col +
                '}';
    }
}

class Reader{
    String name;
    int id;

    public Reader(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

class Library{
    List<Book> books = new ArrayList<>();
    List<Reader> readers = new ArrayList<>();

    void addBook(Book book){
        books.add(book);
    }

    void removeBook(Book book){
        books.remove(book);
    }

    void addReader(Reader reader){
        readers.add(reader);
    }

    void removeReader(Reader reader){
        readers.remove(reader);
    }

    void vidacha(Reader reader, Book book){
        System.out.println(reader.name+" vzail "+book.name);
    }

    void vernyt(Reader reader, Book book){
        System.out.println(reader.name+" vernyl "+ book.name);
    }
}