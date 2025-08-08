//Ali Hassan Salman -- 20182813

public class LibMember {

    private String firstName;
    private String lastName;
    private char gender;
    private long cprNum;
    private String teleNum;
    private Book[] booksIssued=new Book[10];
    private int numBooksIssued=0;

    public LibMember()
    {
        firstName="Unknown";
        lastName="Unknown";
        gender='x';
        cprNum=0000000;
        teleNum="Unknown";
    }

    public LibMember(String f, String l, char g, long c, String t)
    {
        firstName=f;
        lastName=l;
        gender=g;
        cprNum=c;
        teleNum=t;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setCprNum(long cprNum) {
        this.cprNum = cprNum;
    }

    public void setTeleNum(String teleNum) {
        this.teleNum = teleNum;
    }

    public void setBooksIssued(Book[] booksIssued) {
        System.arraycopy(booksIssued,0, this.booksIssued,
                0, 10  );
    }

    public void setNumBooksIssued(int numBooksIssued) {
        this.numBooksIssued = numBooksIssued;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public char getGender() {
        return gender;
    }

    public long getCprNum() {
        return cprNum;
    }

    public String getTeleNum() {
        return teleNum;
    }

    public Book[] getBooksIssued() {
        return booksIssued;
    }

    public int getNumBooksIssued() {
        return numBooksIssued;
    }



    public boolean equals(LibMember m)
    {
        if (firstName!=m.getFirstName()  ||  lastName!=m.getLastName()  ||  gender!=m.getGender()
                ||  cprNum!=m.getCprNum()  || teleNum!=m.getTeleNum()  ||  numBooksIssued!=m.getNumBooksIssued())
        {
            return false;
        }
        else
        {
            if (booksIssued.length != m.getBooksIssued().length)
            {
                return false;
            }

            for (int i = 0; i < m.getBooksIssued().length-1; i++) {

                if (booksIssued[i] != m.getBooksIssued()[i])
                    return false;
            }
        }

        return true;
    }

    public String ToString()
    {
        String print="First name: "+firstName+"\t"+"Last name: "+lastName+"\t"+"Gender: "+gender+"\t"+
                "Cpr num: "+cprNum+"\t"+"Tele. num: "+teleNum+"\t"+"Num Books Issued: "+numBooksIssued+"\n";

        for (int i = 0; i < booksIssued.length-1; i++) {

            print=print+booksIssued[i]+"\t";
        }

        print=print+"\n";

        return print;
    }

}