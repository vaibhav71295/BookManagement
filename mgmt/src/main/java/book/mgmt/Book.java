package book.mgmt;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "book", catalog = "book", uniqueConstraints = {
		@UniqueConstraint(columnNames = "BOOK_NAME")})
public class Book {
	
	@Id @GeneratedValue
	@Column(name="book_id")
	private Integer bookId;
	@Column(name="author_name")
	private String authName;
	@Column(name="book_name")
	private String bookName;
	
	@Column(name="quantity")
	private int quantity;
	
	
	
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getAuthName() {
		return authName;
	}
	public void setAuthName(String authName) {
		this.authName = authName;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Integer getBookQuantity() {
		return quantity;
	}
	public void setBookQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
//	
//	public Book() {
//	}
//
//	public Book(String bName,String authName) {
//		this.authName = authName;
//		this.bookName = bName;
//	}
//
//	@Id
//	@GeneratedValue(strategy = IDENTITY)
//	@Column(name = "BOOK_ID", unique = true, nullable = false)
//	public Integer getBookId() {
//		return this.bookId;
//	}
//
//	public void setBookId(Integer bId) {
//		this.bookId = bId;
//	}
//
//	@Column(name = "author_name", nullable = false, length = 20)
//	public String getBookAuth() {
//		return this.authName;
//	}
//
//	public void setBookAuth(String authName) {
//		this.authName = authName;
//	}
//
//	@Column(name = "BOOK_NAME", unique = true, nullable = false, length = 20)
//	public String getBookName() {
//		return this.bookName;
//	}
//
//	public void setBookName(String bName) {
//		this.bookName = bName;
//	}
//
//	@Override
//	public String toString() {
//		return "Book [bookCode=" + authName + ", bookId=" + bookId
//				+ ", bookName=" + bookName + "]";
//	}
	
}
