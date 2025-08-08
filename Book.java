//Ali Hassan Salman -- 20182813

public class Book {

    private String title;
    private String author1;
    private String author2;
    private String publisher;
    private int yearPublication;
    private String isbn;
    private long accessionNum;
    private LibMember issuedTo;

    public Book()
    {
        title="Unknown";
        author1="Unknown";
        author2="Unknown";
        publisher="Unknown";
        yearPublication=0000;
        isbn="Unknown";
        accessionNum=00000000;
        issuedTo=null;
    }

    public Book(String t, String a1, String a2, String p, int y, String isbn, long a, LibMember i)
    {
        title=t;
        author1=a1;
        author2=a2;
        publisher=p;
        yearPublication=y;
        this.isbn=isbn;
        accessionNum=a;
        issuedTo=i;
    }



    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor1(String author1) {
        this.author1 = author1;
    }

    public void setAuthor2(String author2) {
        this.author2 = author2;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setAccessionNum(long accessionNum) {
        this.accessionNum = accessionNum;
    }

    public void setIssuedTo(LibMember issuedTo) {
        this.issuedTo = issuedTo;
    }



    public String getTitle() {
        return title;
    }

    public String getAuthor1() {
        return author1;
    }

    public String getAuthor2() {
        return author2;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public String getIsbn() {
        return isbn;
    }

    public long getAccessionNum() {
        return accessionNum;
    }

    public LibMember getIssuedTo() {
        return issuedTo;
    }



    public boolean equals(Book b)
    {
        if (title.equalsIgnoreCase(b.getTitle())  &&  author1.equalsIgnoreCase(b.getAuthor1())  &&
                author2.equalsIgnoreCase(b.getAuthor2())  &&  publisher.equalsIgnoreCase(b.getPublisher())
                && yearPublication==b.getYearPublication() &&  isbn.equals(b.getIsbn())  &&
                accessionNum==b.getAccessionNum() &&  issuedTo.equals(b.getIssuedTo()))
        {
            return true;
        }
        else
            return false;
    }

    public String toString()
    {
        String print="Title: "+title+"\t"+"Author 1: "+author1+"\t"+"Author 2: "+author2+"\t"+
                "Publisher: "+publisher+"\t"+"Year Publication: "+yearPublication+"\t"+"ISBN: "+isbn+
                "\t"+"Accession Num: "+accessionNum+"\t"+"Issued To: "+issuedTo;

        return print;
    }

}