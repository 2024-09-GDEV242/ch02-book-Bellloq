/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    private boolean courseText;
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int numPages, boolean cText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = numPages;
        refNumber = "";
        courseText = cText;
    }

    public String getAuthor() { return author; }
    public String getTitle() { return title; } 
    public int getPages () { return pages; } 
    public String getRefNumber() { return refNumber; }
    public int getBorrowed() {return borrowed;}
    public boolean isCourseTest() {return courseText; }
    
    public void setRefNumber(String def) { if(def.length() > 3) refNumber = def;}
    public void borrow() {borrowed += 1;}
    
    public void printAuthor() {
        System.out.println(author);
    }
    public void printTitle() {
        System.out.println(title);
    }
    public void printDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        if(refNumber.length() > 0) System.out.println("Reference Number: " + refNumber);
        else System.out.println("Reference Number: ZZZ");
        System.out.println("Number of Times Borrowed: " + borrowed);
        if(courseText) System.out.println("Is Course Text");
    }
    // Add the methods here ...
}
