package Pantallas;
public class Main {

	public static void main(String[] args) {
		
	BookStore books = new BookStore("archivo.bin", "Librosl.csv");
	//books.loadCSVFile();
	books.addBook(new Book(1010, "Carlos", 1, 2, 2000, 3));
	//System.out.println(books.readBookById(1).toString());
	
//	System.out.println(books.addBook(new Book(1000, "el senor de los anillos", 1,2,3,4)));
//	books.removeBookById(50);
	//System.out.println(books.existsBookById(50));
	//books.printBiblio();
	//System.out.println(books.readBookById(1).toString());
	//books.getbooksbyAuthor(1);
	System.out.println(books.existsBookById(1500));
	System.out.println(books.readBookById(1500).toString());
	System.out.println(books.existsBookById(1200));
	}

}
