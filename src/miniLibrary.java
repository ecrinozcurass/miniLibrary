public class miniLibrary {
    private String title;
    private String author;
    private int pageCount;
    private boolean available;

    public miniLibrary(String title, String author, int pageCount, boolean available){
    }
    public void printInfo() {
        System.out.println("Title: "+ title);
        System.out.println("Author: "+ author);
        System.out.println("Pages :" + pageCount);
        System.out.println("Avaiable :" + available);
    }
    public void borrow() {
        if (available){
            available = false;
            System.out.println(title + "borrowed.");
        } else {
            System.out.println(title + " is already borrowed.");
        }
    }
    public void returnBook() {
        available = true;
        System.out.println(title + " returned.");
    }
}
