package designingClasses;

import java.util.ArrayList;

public class Book {
private String title;
private ArrayList<Book> bob;

public Book() {
	title="booook";
	for(int i= 0; i<10;i++) {
		bob.add(new Book());
	}
}
public Book(String xName, ArrayList<Book>Joe) {
	title=xName;
	bob=Joe;
}
public Book checkOut(int index) {
	return bob.remove(index);
}
public void returnBook (Book temp) {
	bob.add(temp);
}
public void fire() {
	bob.clear();
}
}
