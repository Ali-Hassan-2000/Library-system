//Ali Hassan Salman -- 20182813

import java.util.LinkedList;

public class LibrarySystem {

    private LinkedList<Book> booksList;
    private LinkedList<LibMember> membersList;
    private int booksListSize;
    private int membersListSize;

    public LibrarySystem()
    {
        booksListSize=0;
        membersListSize=0;
        booksList=new LinkedList<Book>();
        membersList=new LinkedList<LibMember>();

    }


    public boolean addBook(Book b)
    {
        if(booksList.contains(b))
            return false;

        booksList.add(b);
        return true;
    }

    public boolean deleteBook(long accNum)
    {
       int index=searchBook(accNum);

       if (index == -1)
       {
           return false;
       }
       else
       {
           if (booksList.get(index).getIssuedTo() == null)
           {
               booksList.remove(index);
               return true;
           }
           else
               return false;
       }
    }

    public boolean addMember(LibMember p)
    {
        if(membersList.contains(p))
            return false;

        membersList.add(p);
        return true;
    }


    public boolean deleteMember(long cpr)
    {
     int index=searchMember(cpr);

    if(membersList.contains(membersList.get(index)) && membersList.get(index).getNumBooksIssued() == 0)
    {
        membersList.remove(index);
        return true;
    }
    else
        return false;

    }


    public int searchBook(long accNum)
    {

        if (isEmptyBooksList())
        {
            return -1;
        }

        Iterator <Book> b= booksList.iterator();

        int index =0;

        while (b.hasNext())
        {

            if (b.next().getAccessionNum() == accNum)
            {
                return index;
            }
            else
                index++;
        }
        return -1;

    }


    public int searchMember(long cpr)
    {

        if (isEmptyMembersList())
        {
            return -1;
        }

        Iterator <LibMember> m= membersList.iterator();

        int index = 0;

        while(m.hasNext())
        {
            if (m.next().getCprNum() == cpr)
            {
                return index;
            }
            else
                index++;
        }
        return -1;
    }


    public boolean isEmptyBooksList()
    {
        return (booksList.isEmpty());
    }

    public boolean isEmptyMembersList()
    {
        return (membersList.isEmpty());
    }


    public int sizeBooksList()
    {
        return booksList.size();
    }


    public int sizeMembersList()
    {
        return membersList.size();
    }


    public boolean issueBook(long accNum, long cpr)
    {
        if (searchBook(accNum) == -1)
        {
            return false;
        }

        if (searchMember(cpr) == -1)
        {
            return false;
        }

        if (isBookIssued(accNum))
        {
            return false;
        }

        if (membersList.get(searchMember(cpr)).getNumBooksIssued() >= 10)
        {
            return false;
        }

        Book[] a=new Book[10];
        int i=0;

        for (i = 0; i < membersList.get(searchMember(cpr)).getNumBooksIssued(); i++) {

            a[i]=membersList.get(searchMember(cpr)).getBooksIssued()[i];
        }

        a[membersList.get(searchMember(cpr)).getNumBooksIssued()]=booksList.get(searchBook(accNum));

        membersList.get(searchMember(cpr)).setBooksIssued(a);

        membersList.get(searchMember(cpr)).setNumBooksIssued(membersList.get(searchMember(cpr)).getNumBooksIssued() + 1);

        booksList.get(searchBook(accNum)).setIssuedTo(membersList.get(searchMember(cpr)));

        return true;
    }


    public boolean returnBook(long accNum)
    {
        if (searchBook(accNum) == -1)
        {
            return false;
        }

        if (! isBookIssued(accNum))
        {
            return false;
        }

        int index=searchBook(accNum);

         booksList.get(searchBook(accNum)).getIssuedTo().getBooksIssued()[index]=null;

         int num=booksList.get(searchBook(accNum)).getIssuedTo().getNumBooksIssued();


        for (int i = index; i < num; i++) {

            booksList.get(searchBook(accNum)).getIssuedTo().getBooksIssued()[i+1]
                    =booksList.get(searchBook(accNum)).getIssuedTo().getBooksIssued()[i];
        }

        booksList.get(searchBook(accNum)).getIssuedTo().setNumBooksIssued(num-1);

        booksList.get(searchBook(accNum)).setIssuedTo(null);

        return true;
    }


    public void printBooksIssued(long cpr)
    {
         if (searchMember(cpr) == -1)
         {
             System.out.println("Member doesn't exist....");
         }

        for (int i = 0; i < membersList.get(searchMember(cpr)).getNumBooksIssued(); i++) {

            System.out.println(membersList.get(searchMember(cpr)).getBooksIssued()[i]);
        }

    }


    public boolean isBookIssued(long accNum)
    {
        if (searchBook(accNum) == -1)
        {
            System.out.println("Book doesn't exist....");

            return false;
        }

        return (booksList.get(searchBook(accNum)).getIssuedTo() != null);
    }
    
}