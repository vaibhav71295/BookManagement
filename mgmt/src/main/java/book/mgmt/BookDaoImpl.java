package book.mgmt;

import java.util.List;

import org.springframework.stereotype.Repository;

//import com.mkyong.stock.model.Stock;

@Repository("BookDao")
// import com.mkyong.util.CustomHibernateDaoSupport;
public class BookDaoImpl extends CustomHibernateDaoSupport implements BookDao {

	public boolean saveBook(Book book) {
		getHibernateTemplate().save(book);
		return true;
	}

	public void updateBook(Book book) {
		getHibernateTemplate().update(book);
	}

	public void deleteBook(Book book) {
		getHibernateTemplate().delete(book);
	}

	public Book findByBook(String bookName) {
		List list = getHibernateTemplate().find("from Book where bookName=?", bookName);
		return (Book) list.get(0);
	}

	public List listBooks() {
		List list = getHibernateTemplate().find("from Book"); 
		return list;
	}

	public void insertUser(User user) {
		getHibernateTemplate().save(user);
	}

	public void deleteUser(User user) {
		getHibernateTemplate().delete(user);
	}

	public void updateUser(User user) {
		getHibernateTemplate().update(user);
	}

	public List<User> listUser() {
		List<User> l = getHibernateTemplate().find("from User");
		return l;
	}

	public void updateUserMobile(User user) {
		getHibernateTemplate().update(user);
	}

	public User findUser(int userId) {
		List list = getHibernateTemplate().find("from User where userId=?", userId);
		return (User) list.get(0);
	}

	public void issueBook(Issue issue) {
		getHibernateTemplate().save(issue);
	}
}
