//Ali Hassan Salman -- 20182813

import java.util.Scanner;

public class LibraryMain {
    public static void main(String[] args) {

        LibrarySystem p=new LibrarySystem();

        Scanner kbd=new Scanner(System.in);

        System.out.println("Welcome to the library :");

        System.out.println("Enter :");
        System.out.println("1 to Add Book");
        System.out.println("2 to Delete Book");
        System.out.println("3 to Add Member");
        System.out.println("4 to Delete Member");
        System.out.println("5 to Search Book");
        System.out.println("6 to Search Member");
        System.out.println("7 to Check if Book list is empty (Is Empty Books List)");
        System.out.println("8 to Check if Member list is empty (Is Empty Member List)");
        System.out.println("9 to Know the size of Book list (Size Books List)");
        System.out.println("10 to Know the size of Member list (Size Member List)");
        System.out.println("11 to Issue Book");
        System.out.println("12 to Return Book");
        System.out.println("13 to Print Books Issued");
        System.out.println("14 to Is Book Issued");
        System.out.println("15 to Exit the library");

        int x=kbd.nextInt();

        if (x < 1 || x >15)
        {
            System.exit(0);
        }

        while (true) {

            switch (x) {

                case 1: {
                    System.out.println("Add Book");

                    System.out.println("Enter the Title book :");
                    String title = kbd.next();

                    System.out.println("Enter the first Author of the book :");
                    String author = kbd.next();

                    System.out.println("Enter the Second Author of the book :");
                    String author2 = kbd.next();

                    System.out.println("Enter the Publisher name :");
                    String publisher = kbd.next();

                    System.out.println("Enter the Year Publication :");
                    int year = kbd.nextInt();

                    System.out.println("Enter the ISBN number :");
                    String isbn = kbd.next();

                    System.out.println("Enter the Accession Number :");
                    long accessionNum = kbd.nextLong();

                    Book b = new Book(title, author, author2, publisher, year, isbn, accessionNum, null);

                    System.out.println(p.addBook(b));

                    break;
                }

                case 2: {
                    System.out.println("Delete Book");

                    System.out.println("Enter the Accession Number to delete the book :");
                    long accnum = kbd.nextLong();

                    System.out.println(p.deleteBook(accnum));

                    break;
                }

                case 3: {
                    System.out.println("Add Member");

                    System.out.println("Enter the First name :");
                    String first = kbd.next();

                    System.out.println("Enter the Last name :");
                    String last = kbd.next();

                    System.out.println("Enter the Gender (M/F):");
                    char gender = kbd.next().charAt(0);

                    System.out.println("Enter the CPR :");
                    Long cpr = kbd.nextLong();

                    System.out.println("Enter the Telephone number :");
                    String telenum = kbd.next();


                    LibMember m = new LibMember(first, last, gender, cpr, telenum);

                    System.out.println(p.addMember(m));

                    break;
                }

                case 4: {
                    System.out.println("Delete Member");

                    System.out.println("Enter the CPR Number to delete the Member :");
                    long cpr = kbd.nextLong();

                    System.out.println(p.deleteMember(cpr));

                    break;
                }

                case 5: {
                    System.out.println("Search Book");

                    System.out.println("Enter the Accession Number to Search for the book :");
                    long acc = kbd.nextLong();

                    System.out.println(p.searchBook(acc));

                    break;
                }

                case 6: {
                    System.out.println("Search Member");

                    System.out.println("Enter the CPR Number to Search for the Member :");
                    long cpr = kbd.nextLong();

                    System.out.println(p.searchMember(cpr));

                    break;
                }

                case 7: {
                    System.out.println("Is Empty Books List");

                    System.out.println(p.isEmptyBooksList());

                    break;
                }

                case 8: {
                    System.out.println("Is Empty Member List");

                    System.out.println(p.isEmptyMembersList());

                    break;
                }

                case 9: {
                    System.out.println("Size Books List");

                    System.out.println(p.sizeBooksList());

                    break;
                }

                case 10: {
                    System.out.println("Size Members List");

                    System.out.println(p.sizeMembersList());

                    break;
                }

                case 11: {
                    System.out.println("Issue Book");

                    System.out.println("Enter the Accession Number of the book :");
                    long acc = kbd.nextLong();

                    System.out.println("Enter the CPR Number of the Member :");
                    long cpr = kbd.nextLong();

                    System.out.println(p.issueBook(acc, cpr));

                    break;
                }

                case 12: {
                    System.out.println("Return Book");

                    System.out.println("Enter the Accession Number of the book :");
                    long acc = kbd.nextLong();

                    System.out.println(p.returnBook(acc));

                    break;
                }

                case 13: {
                    System.out.println("Print Books Issued");

                    System.out.println("Enter the CPR Number of the Member :");
                    long cpr = kbd.nextLong();

                    p.printBooksIssued(cpr);

                    break;
                }

                case 14: {
                    System.out.println("Is Book Issued");

                    System.out.println("Enter the Accession Number of the book :");
                    long acc = kbd.nextLong();

                    System.out.println(p.isBookIssued(acc));

                    break;
                }

                case 15: {
                    System.out.println("Exit the library");

                    System.out.println("Thank you for visiting the Library");

                    System.out.println("Good bay");

                    System.exit(0);
                }
            }

            System.out.println("Enter :");
            System.out.println("1 to Add Book");
            System.out.println("2 to Delete Book");
            System.out.println("3 to Add Member");
            System.out.println("4 to Delete Member");
            System.out.println("5 to Search Book");
            System.out.println("6 to Search Member");
            System.out.println("7 to Check if Book list is empty (Is Empty Books List)");
            System.out.println("8 to Check if Member list is empty (Is Empty Member List)");
            System.out.println("9 to Know the size of Book list (Size Books List)");
            System.out.println("10 to Know the size of Member list (Size Member List)");
            System.out.println("11 to Issue Book");
            System.out.println("12 to Return Book");
            System.out.println("13 to Print Books Issued");
            System.out.println("14 to Is Book Issued");
            System.out.println("15 to Exit the library");

            x=kbd.nextInt();

            if (x < 1 || x >15)
            {
                System.exit(0);
            }

        }
    }
}