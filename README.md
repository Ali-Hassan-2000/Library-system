# Library System Project

## Overview

The Library System application is designed to maintain information about books and library members. It provides functionalities to manage book lending and track member activities using object-oriented programming principles.

## Features

- **Book Management**: Add, delete, and search for books in the library.
- **Member Management**: Add, delete, and search for library members.
- **Book Issuing**: Issue and return books to/from members, with checks for eligibility.
- **Data Persistence**: Maintain a record of books and members using linked lists.

## Classes

### 1. `Book`

Represents a book in the library with the following attributes:
- `title`: Title of the book
- `author1`: First author's name
- `author2`: Second author's name
- `publisher`: Publisher's name
- `yearPublication`: Year of publication
- `isbn`: Unique 13-digit ISBN number
- `accessionNum`: Unique accession number for library tracking
- `issuedTo`: Reference to the `LibMember` if issued

**Methods**:
- Default constructor
- Parameterized constructor
- Getter and setter methods
- `equals` and `toString` methods

### 2. `LibMember`

Represents a library member with the following attributes:
- `firstName`: Member's first name
- `lastName`: Member's last name
- `gender`: Member's gender
- `cprNum`: Unique CPR number
- `teleNum`: Telephone number
- `booksIssued`: Array of `Book` objects (size = 10)
- `numBooksIssued`: Number of books currently issued

**Methods**:
- Default constructor
- Parameterized constructor
- Getter and setter methods
- `equals` and `toString` methods

### 3. `LibrarySystem`

Manages the library's books and members with the following attributes:
- `booksList`: A linked list of `Book` objects
- `membersList`: A linked list of `LibMember` objects
- `booksListSize`: Number of books in the list
- `membersListSize`: Number of members in the list

**Methods**:
- Constructor
- `addBook`, `deleteBook`, `addMember`, `deleteMember`
- `searchBook`, `searchMember`
- `issueBook`, `returnBook`
- Utility methods (e.g., `isEmptyBooksList`, `sizeBooksList`, etc.)

### 4. `LibraryMain`

Contains the main method to test the functionalities of the `LibrarySystem`. It implements a menu-driven interface using a switch statement to interact with users.

## Getting Started

### Prerequisites

- Java Development Kit (JDK)
- Basic understanding of Java and object-oriented programming

### Installation

1. Clone the repository:
   ```bash
   git clone <repository-url>
