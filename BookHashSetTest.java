package Assignment;


import java.util.HashSet;
import java.util.Objects;

public class BookHashSetTest {
	public static void main(String[] args) {

		Book book1 = new Book("Greatest Novelists and Their Novels","W. Somerset Maugham",1,"First UK edition (1954)",250,2034.5f);
		Book book2 = new Book("Greatest Novelists and Their Novels","Maugham",1,"First UK edition (1954)",250,2034.5f);
		Book book3 = new Book("The History of Tom Jones, a Foundling","Henry Fielding",4, "1749 edition",300,2450f);
		
		System.out.println("book1 : "+book1);
		System.out.println("book2 : "+book2);
		System.out.println("book3 : "+book3);

		System.out.println("----");
		
		System.out.println("book1 : "+book1.hashCode());
		System.out.println("book2 : "+book2.hashCode());
		System.out.println("book3 : "+book3.hashCode());

		
		HashSet<Book> bookShelf = new HashSet<Book>();
		
		System.out.println("Adding book1 ");
		bookShelf.add(book1);
		
		System.out.println("Adding book2 ");
		bookShelf.add(book2);

		System.out.println("Adding book3 ");
		bookShelf.add(book3);
			
		
		for (Book book : bookShelf) {
			System.out.println("The Book : "+book);
		}
	}
}

class Book
{
	String title;
	String author;
	int no;
	String edition;
	int noOfPages;
	float price;
	public Book(String title, String author, int no, String edition, int noOfPages, float price) {
		super();
		this.title = title;
		this.author = author;
		this.no = no;
		this.edition = edition;
		this.noOfPages = noOfPages;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", no=" + no + ", edition=" + edition + ", noOfPages="
				+ noOfPages + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(author, edition, no, noOfPages, price, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(edition, other.edition) && no == other.no
				&& noOfPages == other.noOfPages && Float.floatToIntBits(price) == Float.floatToIntBits(other.price)
				&& Objects.equals(title, other.title);
	}

	
}
