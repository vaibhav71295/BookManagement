package book.mgmt;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import java.sql.Date;

@Entity
@Table(name = "issue", catalog = "book")

public class Issue {
	@Id @GeneratedValue
	@Column(name="issue_id")
	private int issueId;
	@Column(name="user_id")
	private int userId;
	@Column(name="book_id")
	private int bookId;
	
	@Column(name="issue_date")
	private java.sql.Date issueDate;
	
	@Column(name="return_date")
	private java.sql.Date returnDate;
	
	public Integer getIssueId() {
		return issueId;
	}
	public void setIssueId(Integer issueId) {
		this.issueId = issueId;
	}
	
	public int getUser() {
		return userId;
	}
	public void setUser(int userId) {
		this.userId = userId;
	}
	
	public int getBook() {
		return bookId;
	}
	public void setBook(int bookId) {
		this.bookId = bookId;
	}
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate( Date issueDate) {
		this.issueDate = issueDate;
	}
	
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	
	
	
}
