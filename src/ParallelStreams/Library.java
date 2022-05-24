
package ParallelStreams;

import java.util.ArrayList;

/**
 *
 * @author guexa
 */
public class Library {
    
    public static void main(String[] args) {
        
        ArrayList<Book> books = populateLibrary();
        
        books.parallelStream().filter(book -> {
            return book.getAuthor().startsWith("M");
        }).forEach(System.out::println);
        
    }
    
    static ArrayList<Book> populateLibrary()
    {
        ArrayList<Book> bookCollection = new ArrayList();
        
        bookCollection.add(new Book("Alfredo Covelli", "Vahana Masterclass"));
        bookCollection.add(new Book("Lt. Gen. Konsam Himalay Singh", "Making of a General-A Himalayan Echo"));
        bookCollection.add(new Book("Yalamanchili Sivaji", "Palleku Pattabhishekam"));
        bookCollection.add(new Book("Jess Kid", "Himself"));
        bookCollection.add(new Book("Martha McPhee", "Gorgeous Lies"));
        bookCollection.add(new Book("Megan Miranda", "All the Missing Girls"));
        bookCollection.add(new Book("Kristin Harmel", "The Winemaker's Wife"));
        bookCollection.add(new Book("Brie Spangler", "El corazón de la Bestia"));
        bookCollection.add(new Book("Stephen King", "Insomnia"));
        bookCollection.add(new Book("Sally Rooney", "Normal people"));
        bookCollection.add(new Book("Lisa Jewell", "The family upstairs"));
        bookCollection.add(new Book("Haruki Murakami", "Kafka on the shore"));
        bookCollection.add(new Book("Imbolo Mbue", "Behold the dreamers"));
        bookCollection.add(new Book("Terry McMelan", "How Stella Got Her Groove Back"));
        bookCollection.add(new Book("Mary Kubica", "The good girl"));
        bookCollection.add(new Book("Colleen Oakley", "Before I go"));
        bookCollection.add(new Book("Stephen Graham Jones", "Mongrels"));
        bookCollection.add(new Book("Kiley Reid", "Such a fun age"));
        
        return bookCollection;
    }
    
}
