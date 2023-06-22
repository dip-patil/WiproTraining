/**
 * Create a class Author with the following information.
 * Member variables : name (String), email (String), and gender (char)
 * Parameterized Constructor: To initialize the variables
 * 
 * 
 * Create a class Book with the following information.
 * Member variables : name (String), author (of the class Author you have just
 * created), price (double), and qtyInStock (int)
 * [Assumption: Each book will be written by exactly one Author]
 * Parameterized Constructor: To initialize the variables
 * Getters and Setters for all the member variables
 * 
 * In the main method, create a book object and print all details of the book
 * (including the author details)
 */
/*
 * Create a class Author with the following information.
 * Member variables : name (String), email (String), and gender (char)
 * Parameterized Constructor: To initialize the variables
 * 
 * 
 * Create a class Book with the following information.
 * Member variables : name (String), author (of the class Author you have just
 * created), price (double), and qtyInStock (int)
 * [Assumption: Each book will be written by exactly one Author]
 * Parameterized Constructor: To initialize the variables
 * Getters and Setters for all the member variables
 * 
 * In the main method, create a book object and print all details of the book
 * (including the author details)
 */

class Author {
	String name, email;
	char gender;

	Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
		// details();

	}

}

class Book {
	private String name;
	private Author author;
	private double price;
	private int qtyInStock;

	Book(String name, Author author, double price, int qtyInStock) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
		// details();
	}

	public void details() {
		System.out.println("Book Name: " + name + ", Author: " + author.name + ", Price: " + price + ", QtyInStock: "
				+ qtyInStock);
	}

}

public class Assignment1 {

	public static void main(String[] args) {

		Book book = new Book("Master in Java", new Author("Dipkumar", "dip@gmail.com", 'M'), 399.0, 200);

		// System.out.println(author.details());
		book.details();
	}

}
