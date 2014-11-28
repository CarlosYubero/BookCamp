package Pantallas;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BookStore {
	RandomAccessFile archivoBinario;
	File archivoCSV;

	public BookStore(String pathArchivoBinario, String pathArchivoCSV) {

		try {
			archivoBinario = new RandomAccessFile(pathArchivoBinario, "rw");
			archivoCSV = new File(pathArchivoCSV);
			archivoCSV.createNewFile();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public boolean loadCSVFile() {
		try {
			BufferedReader file = new BufferedReader(new FileReader(archivoCSV));
			String line;
			Book libro;
			file.readLine();
			StringTokenizer stk;
			int id, stock, fk_author, fk_publisher, year;
			String title;

			while ((line = file.readLine()) != null) {
				stk = new StringTokenizer(line, ";");
				id = Integer.parseInt(stk.nextToken());
				title = stk.nextToken();
				fk_author = Integer.parseInt(stk.nextToken());
				fk_publisher = Integer.parseInt(stk.nextToken());
				year = Integer.parseInt(stk.nextToken());
				stock = Integer.parseInt(stk.nextToken());

				libro = new Book(id, title, fk_author, fk_publisher, year,
						stock);
				addBook(libro);
			}
			file.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;

	}

	public Book readBookById(int id) {
		Book book = null;

		try {
			if (existsBookById(id)) {
				archivoBinario.seek(id * Book.SIZE);
				int id_bin = archivoBinario.readInt();
				String title;
				char aux, tit[] = new char[50];
				for (int i = 0; i < 50; i++) {
					aux = archivoBinario.readChar();
					if ((int) aux != 0)
						tit[i] = aux;
					else
						tit[i] = ' ';
				}
				title = new String(tit);
				int fk_author = archivoBinario.readInt();
				int fk_publisher = archivoBinario.readInt();
				int year = archivoBinario.readInt();
				int stock = archivoBinario.readInt();
				book = new Book(id_bin, title, fk_author, fk_publisher, year,
						stock);

			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {

		}
		return book;

	}

	public boolean removeBookById(int id) {
		boolean ok = false;
		if (existsBookById(id)) {
			Book book = readBookById(id);
			try {
				archivoBinario.seek(book.getBook_id() * Book.SIZE);
				archivoBinario.writeInt(-1);
				ok = true;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return ok;
	}

	public boolean existsBookById(int id) {
		boolean exists = false;
		try {
			archivoBinario.seek(id * Book.SIZE);
			exists = archivoBinario.readInt() == id;
		} catch (IOException e) {
		}
		return exists;

	}

	public boolean addBook(Book libro) {
		boolean ok = false;
		try {
			archivoBinario.seek(libro.getBook_id() * Book.SIZE);
			archivoBinario.writeInt(libro.getBook_id());
			archivoBinario.writeChars(libro.getTitle());
			archivoBinario.writeInt(libro.getFk_author());
			archivoBinario.writeInt(libro.getFk_publisher());
			archivoBinario.writeInt(libro.getYear());
			archivoBinario.writeInt(libro.getStock());
			ok = true;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ok;

	}

	public Object[][] getDataForTable() {
		Object[][] data = null;
		int position = 0;
		int lastPosition;
		try {
			ArrayList<Object[]> list = new ArrayList<Object[]>();
			Book book;
			lastPosition = (int) (archivoBinario.length() / Book.SIZE);
			while (position <= lastPosition) {
				if (existsBookById(position)) {
					book = readBookById(position);
					list.add(new Object[] { book.getBook_id(), book.getTitle(),
							book.getFk_author(), book.getFk_publisher(),
							book.getYear(), book.getStock() });
					
				}
				position++;
			}
			data = new Object[list.size()][];
			for (int i = 0; i < list.size(); i++) {
				data[i] = list.get(i);
			}
		} catch (Exception e) {

		}
		return data;
	}

	public void printBiblio() {
		int position = 0;
		int lastPosition;
		try {
			lastPosition = (int) (archivoBinario.length() / Book.SIZE);
			while (position <= lastPosition) {
				if (existsBookById(position))
					System.out.println(readBookById(position).toString());
				position++;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public ArrayList<Book> getbooksbyAuthor(int author) {
		ArrayList<Book> lista = new ArrayList<Book>();
		int position = 0;
		int lastPosition;
		Book libroIterador;
		try {
			lastPosition = (int) (archivoBinario.length() / Book.SIZE);
			while (position <= lastPosition) {
				if (existsBookById(position)) {
					libroIterador = readBookById(position);
					if (libroIterador.getFk_author() == author) {
						lista.add(libroIterador);
					}

				}
				position++;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public ArrayList<Book> getbooksbyEditorial(int editorial) {
		ArrayList<Book> lista = new ArrayList<Book>();
		int position = 0;
		int lastPosition;
		Book libroIterador;
		try {
			lastPosition = (int) (archivoBinario.length() / Book.SIZE);
			while (position <= lastPosition) {
				if (existsBookById(position)) {
					libroIterador = readBookById(position);
					if (libroIterador.getFk_publisher() == editorial) {
						lista.add(libroIterador);
					}

				}
				position++;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
