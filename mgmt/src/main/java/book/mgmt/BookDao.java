package book.mgmt;

import java.util.List;

public interface BookDao {
	/**
	 * 
	 * @param book
	 */
	boolean saveBook(Book book);
	
	/**
	 * @param book
	 */
	void updateBook(Book book);
	
	void deleteBook(Book bookk);
	
	Book findByBook(String bookName);
	
	List listBooks();
	
	void insertUser(User user);
	
	void deleteUser(User user);
	
	void updateUser(User user);
	
	void updateUserMobile(User user);
	
	List<User> listUser();
	
	User findUser(int userId);
	
	void issueBook(Issue issue);
}
