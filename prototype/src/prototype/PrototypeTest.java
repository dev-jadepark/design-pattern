package prototype;

import java.util.ArrayList;

class Book {
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}

//prototype으로 클론하려면 항상 Cloneable 해줘야 한다
//마크 인터페이스
class BookShelf implements Cloneable{
    private ArrayList<Book> shelf;

    public BookShelf() {
        shelf = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        shelf.add(book);
    }

    public ArrayList<Book> getShelf() {
        return shelf;
    }

    public void setShelf(ArrayList<Book> shelf) {
        this.shelf = shelf;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //return super.clone();   //오브젝트의 클론을 부른다.
        BookShelf another = new BookShelf();

        for(Book book : shelf){
            another.addBook(new Book(book.getAuthor(), book.getTitle()));
        }

        return another;
    }

    @Override
    public String toString() {
        return "BookShelf{" +
                "shelf=" + shelf +
                '}';
    }
}

public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {

        BookShelf bookShelf = new BookShelf();
        bookShelf.addBook(new Book("태백산맥", "조정래"));
        bookShelf.addBook(new Book("박완서", "나목"));
        bookShelf.addBook(new Book("박경리", "박완서"));

        System.out.println(bookShelf);

        //clone

        BookShelf another = (BookShelf) bookShelf.clone();
        System.out.println(another);


        bookShelf.getShelf().get(0).setAuthor("조정래");
        bookShelf.getShelf().get(0).setTitle("한강");

        System.out.println(bookShelf);
        System.out.println(another);

        /*
        java의 얕은 복사와 깊은 복사란?
         */
    }
}
