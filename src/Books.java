public class Books {

    private String bookTitle;
    private int numOfPages;
    private int pubYear;

    public Books(String bookTitle, int numOfPages, int pubYear) {
        this.bookTitle = bookTitle;
        this.numOfPages = numOfPages;
        this.pubYear = pubYear;
    }
    public String getBookTitle() {
        return bookTitle;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public int getPubYear() {
        return pubYear;
    }
    @Override
    public String toString() {
        return getBookTitle() + ", " + getNumOfPages() + " pages, " + getPubYear();
    }

}
